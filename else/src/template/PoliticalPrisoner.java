package template;

public class PoliticalPrisoner extends Prisoner {
    public PoliticalPrisoner(String name){
        this.name = name;
    }
    @Override
    void work() {
        System.out.println("���������ﷸ");
    }

    @Override
    void eat() {
        System.out.println("���������ﷸ");
    }

    @Override
    void readNews() {
        System.out.println("���������ﷸ");
    }
}
