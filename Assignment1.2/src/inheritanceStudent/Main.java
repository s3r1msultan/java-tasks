package inheritanceStudent;

public class Main {
    public static void main(String[] args) {
        Student anyone = new Student();
        anyone.setAverageMark(5);
        System.out.println(anyone.getScholarship());
        Aspirant someone = new Aspirant();
        someone.setAverageMark(4.1);
        System.out.println(someone.getScholarship());
        Student[] students = {anyone, someone};
        for(int i = 0; i < students.length; ++i) {
            System.out.println(students[i].getScholarship());
        }
    }
}
