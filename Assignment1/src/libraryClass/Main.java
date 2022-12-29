package libraryClass;

public class Main {
    public static void main(String[] args) {
        Book first = new Book("Fahrenheit 451", "Ray Bradbury");
        Book second = new Book("1984", "George Orwell");
        Book third = new Book("Brave New World", "Aldous Huxley");
        Book forth = new Book("Grokking Algorithms", "Aditya Bhargava");
        LibraryReader Andrey = new LibraryReader("Kolesnikov Andrey", 2314, "SE", 290504, "+7704521234");

        Andrey.takeBook(5);
        Andrey.takeBook("Fahrenheit 451", "1984", "Brave New World", "Grokking Algorithms");
        Andrey.takeBook(first, second, third, forth);

        Andrey.returnBook(5);
        Andrey.returnBook("Fahrenheit 451", "1984", "Brave New World", "Grokking Algorithms");
        Andrey.returnBook(first, second, third, forth);
    }
}
