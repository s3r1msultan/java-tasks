package DataBase;
import Cars.CommercialCarBody.CommercialCarBody;
import Cars.PassengerCarBody.PassengerCarBody;

import Factories.CarFactory.*;

import java.sql.*;
import java.util.ArrayList;

public class CarsHandler extends DBHandler{
    public void updatePassengerCars(ArrayList<PassengerCarBody> passengerCars) throws SQLException {
        passengerCars.clear();
        Connection connection = getConnection();
        String query = "SELECT * FROM " + carsTable + " WHERE type = 'Passenger';";
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(query);
        while(rst.next()){
            PassengerCarBody passengerCarBody = null;
            CarFactory carFactory = null;
            switch (rst.getString(3)) {
                case "Mercedes" -> {
                    carFactory = new MercedesFactory();
                }
                case "BMW" -> {
                    carFactory = new BMWFactory();
                }
                case "Volvo" -> {
                    carFactory = new VolvoFactory();
                }
                case "Hyundai" -> {
                    carFactory = new HyundaiFactory();
                }
                default -> {
                    throw new RuntimeException(rst.getString(3) + " is unknown manufacturer");
                }
            }
            passengerCarBody = carFactory.createPassengerCarBody(rst.getString(4));
            if (passengerCarBody != null) {
                passengerCarBody.setEngineCapacity(rst.getFloat(5));
                passengerCarBody.setFuel(rst.getString(6));
                passengerCarBody.setColor(rst.getString(7));
                passengerCarBody.setNumOfSeats(rst.getInt(8));
                passengerCarBody.setTransmission(rst.getString(9));
                passengerCarBody.setMileage(rst.getInt(10));
                passengerCarBody.setModel(rst.getString(11));
                passengerCarBody.setYear(rst.getString(12));
                passengerCarBody.setPrice(rst.getLong(13));
                passengerCarBody.setAmount(rst.getInt(14));
                passengerCars.add(passengerCarBody);
            }
        }
        rst.close();
        statement.close();
        connection.close();
    }

    public void updateCommercialCars(ArrayList<CommercialCarBody> commercialCars) throws SQLException {
        commercialCars.clear();
        Connection connection = getConnection();
        String query = "SELECT * FROM " + carsTable + " WHERE type = 'Commercial';";
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(query);
        while(rst.next()){
            CommercialCarBody commercialCarBody = null;
            CarFactory carFactory = null;
            switch (rst.getString(3)) {
                case "Mercedes" -> {
                    carFactory = new MercedesFactory();
                }
                case "BMW" -> {
                    carFactory = new BMWFactory();
                }
                case "Volvo" -> {
                    carFactory = new VolvoFactory();
                }
                case "Hyundai" -> {
                    carFactory = new HyundaiFactory();
                }
                default -> {
                    throw new RuntimeException(rst.getString(3) + " is unknown manufacturer");
                }
            }
            commercialCarBody = carFactory.createCommercialCarBody(rst.getString(4));
            if (commercialCarBody != null) {
                commercialCarBody.setEngineCapacity(rst.getFloat(5));
                commercialCarBody.setFuel(rst.getString(6));
                commercialCarBody.setColor(rst.getString(7));
                commercialCarBody.setNumOfSeats(rst.getInt(8));
                commercialCarBody.setMileage(rst.getInt(10));
                commercialCarBody.setModel(rst.getString(11));
                commercialCarBody.setYear(rst.getString(12));
                commercialCarBody.setPrice(rst.getLong(13));
                commercialCarBody.setAmount(rst.getInt(14));
                commercialCars.add(commercialCarBody);
            }
        }
        rst.close();
        statement.close();
        connection.close();
    }
    public void addCar(String type, String manufacturer, String body,
                       float engineCapacity, String fuel, String color,
                       int numOfSeats, String transmission, int mileage,
                       String model, String year, long price, int amount) throws SQLException {
        Connection connection = getConnection();
        String addCar = "INSERT INTO " + carsTable + " (type, manufacturer, body, engineCapacity, fuel, color, numOfSeats, transmission, mileage, model, year, price, amount) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addCar);
        preparedStatement.setString(1, type);
        preparedStatement.setString(2, manufacturer);
        preparedStatement.setString(3, body);
        preparedStatement.setFloat(4, engineCapacity);
        preparedStatement.setString(5, fuel);
        preparedStatement.setString(6, color);
        preparedStatement.setInt(7, numOfSeats);
        preparedStatement.setString(8, transmission);
        preparedStatement.setInt(9, mileage);
        preparedStatement.setString(10, model);
        preparedStatement.setString(11, year);
        preparedStatement.setLong(12, price);
        preparedStatement.setInt(13, amount);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }

    public void removeCar(int id) throws SQLException {
        Connection connection = getConnection();
        String removeCar = "DELETE FROM " + carsTable + " WHERE "+ carsTable +".`id`=" + id + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(removeCar);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }

    public void editCar(int id, String parameter, String value) throws SQLException {
        Connection connection = getConnection();
        String editCar = "UPDATE " + carsTable + " SET `" + parameter + "`='" + value + "' WHERE "+ carsTable +".`id`=" + id + ";";
        Statement statement = connection.createStatement();
        statement.execute(editCar);
        statement.close();
        connection.close();
    }
}
