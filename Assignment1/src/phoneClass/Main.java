package phoneClass;

public class Main {
    public static void main(String[] args) {
        Phone Rauan = new Phone();
        Rauan.setName("Rauan");
        Rauan.setModel("Xiaomi X3 Pro");
        Rauan.setNumber("$2543275");
        Rauan.setWeight(2342);
        Rauan.printValues();
        Phone Alex = new Phone("8706293421", "IPhone 14", "Alex", 200.6f);
        Phone Saint = new Phone("82341365324", "Xiaomi M4","Saint", 250.43f);
        Phone Kate = new Phone("430123523442", "Samsung S22","Kate", 193.42f);


        Alex.printValues();
        Saint.printValues();
        Kate.printValues();

        Alex.receiveCall();
        Alex.receiveCall("Someone");
        Alex.receiveCall(Kate.getName());
        Saint.receiveCall("Anyone");
        Kate.receiveCall("None");
        Rauan.receiveCall("Unknown");

        Phone Adil = new Phone("82342123432", "IPhone 13");
        Adil.receiveCall(Kate.getName(), Kate.getNumber());
        Adil.sendMessage("723143", "2341543123", "231433132412", "344543234", "345235234523");
    }

}