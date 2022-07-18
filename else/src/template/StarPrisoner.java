package template;

public class StarPrisoner extends Prisoner {
    public StarPrisoner(String name) {
        this.name = name;
    }

    @Override
    void work() {
        System.out.println(this.name + "�߳���߹�����");
    }

    @Override
    void eat() {
        System.out.println(this.name + "�߳������������棡");
    }

    @Override
    void readNews() {
        System.out.println(this.name + "�߳���߳Է���");
    }

}
