package template;

public class PoliticalPrisoner extends Prisoner {
    public PoliticalPrisoner(String name){
        this.name = name;
    }
    @Override
    void work() {
        System.out.println("我是政治罪犯");
    }

    @Override
    void eat() {
        System.out.println("我是政治罪犯");
    }

    @Override
    void readNews() {
        System.out.println("我是政治罪犯");
    }
}
