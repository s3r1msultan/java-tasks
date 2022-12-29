package libraryClass;

public class LibraryReader {
    private String fullname;
    private int cardNumber;
    private String faculty;
    private int dateOfBirth;
    private String phoneNumber;

    public LibraryReader() {

    }
    public LibraryReader(String fullname, int cardNumber, String faculty, int dateOfBirth, String phoneNumber) {
        setCardNumber(cardNumber);
        setFaculty(faculty);
        setFullname(fullname);
        setPhoneNumber(phoneNumber);
        setDateOfBirth(dateOfBirth);
    }


    public void takeBook(int numOfBooks) {
        System.out.println(fullname + " took " + numOfBooks + " books.");
    }
    public void takeBook(String ...books) {
        System.out.print(fullname + " took books: ");
        for(int i = 0; i < books.length; ++i) {
            System.out.print(books[i]);
            if (i != books.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public void takeBook(Book ...books) {
        System.out.print(fullname + " took books: ");
        for(int i = 0; i < books.length; ++i) {
            System.out.print(books[i].getName());
            if (i != books.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }



    public void returnBook(int numOfBooks) {
        System.out.println(fullname + " returned " + numOfBooks + " books.");
    }
    public void returnBook(String ...books) {
        System.out.print(fullname + " returned books: ");
        for(int i = 0; i < books.length; ++i) {
            System.out.print(books[i]);
            if (i != books.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public void returnBook(Book ...books) {
        System.out.print(fullname + " took books: ");
        for(int i = 0; i < books.length; ++i) {
            System.out.print(books[i].getName());
            if (i != books.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }



    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
