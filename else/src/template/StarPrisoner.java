package template;

public class StarPrisoner extends Prisoner {
    public StarPrisoner(String name) {
        this.name = name;
    }

    @Override
    void work() {
        System.out.println(this.name + "±ß³ª¸è±ß¹¤×÷£¡");
    }

    @Override
    void eat() {
        System.out.println(this.name + "±ß³ª¸è±ß×ö´óÍë¿íÃæ£¡");
    }

    @Override
    void readNews() {
        System.out.println(this.name + "±ß³ª¸è±ß³Ô·¹£¡");
    }

}
