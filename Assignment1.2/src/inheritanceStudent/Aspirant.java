package inheritanceStudent;

public class Aspirant extends Student {
    @Override
    public int getScholarship() {
        return getAverageMark() == 5 ? 200 : 180;
    }
}
