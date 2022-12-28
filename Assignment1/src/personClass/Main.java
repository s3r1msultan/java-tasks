package personClass;

public class Main {
    public static void main(String[] args) {
        Person Andrey = new Person();
        Andrey.setAge((byte)18);
        Andrey.setFullName("Kolesnikov Andrey");
        Andrey.move();
        Andrey.talk();
        Person Rauan = new Person("Yessentaev Rauan", (byte) 18);
        Rauan.move();
        Rauan.talk();
    }
}
