package DataBase;
import Cars.CommercialCarBody.CommercialCarBody;
import Cars.CommercialCarBody.Manufacturers.Hyundai.HyundaiBus;
import Cars.CommercialCarBody.Manufacturers.Hyundai.HyundaiRefrigerator;
import Cars.CommercialCarBody.Manufacturers.Hyundai.HyundaiVan;
import Cars.CommercialCarBody.Manufacturers.Mercedes.MercBus;
import Cars.CommercialCarBody.Manufacturers.Mercedes.MercRefrigerator;
import Cars.CommercialCarBody.Manufacturers.Mercedes.MercTruck;
import Cars.CommercialCarBody.Manufacturers.Mercedes.MercVan;
import Cars.CommercialCarBody.Manufacturers.Volvo.VolvoBus;
import Cars.CommercialCarBody.Manufacturers.Volvo.VolvoRefrigerator;
import Cars.CommercialCarBody.Manufacturers.Volvo.VolvoTruck;
import Cars.PassengerCarBody.Manufacturers.BMW.BMWCrossover;
import Cars.PassengerCarBody.Manufacturers.BMW.BMWSedan;
import Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiCrossover;
import Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiMiniVan;
import Cars.PassengerCarBody.Manufacturers.Hyundai.HyundaiSedan;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercMiniVan;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercSUV;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercSedan;
import Cars.PassengerCarBody.Manufacturers.Volvo.VolvoCrossover;
import Cars.PassengerCarBody.Manufacturers.Volvo.VolvoSedan;
import Cars.PassengerCarBody.PassengerCarBody;

import Cars.PassengerCarBody.Manufacturers.Mercedes.MercCrossover;
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
                passengerCars.add(passengerCarBody);
            }
        }
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
                commercialCars.add(commercialCarBody);
            }
        }
    }
    public void addCar(String type,String manufacturer, String body,
                       float engineCapacity, String fuel, String color,
                       int numOfSeats, String transmission, int mileage,
                       String model) throws SQLException {
        Connection connection = getConnection();
        String addCar = "INSERT INTO " + carsTable + " (type, manufacturer, body, engineCapacity, fuel, color, numOfSeats, transmission, mileage, model) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
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
        preparedStatement.executeUpdate();
        connection.close();
    }

    public void removeCar(int id) throws SQLException {
        Connection connection = getConnection();
        String removeCar = "DELETE FROM " + carsTable + " WHERE "+ carsTable +".`id`=" + id + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(removeCar);
        preparedStatement.executeUpdate();
        connection.close();
    }
}
