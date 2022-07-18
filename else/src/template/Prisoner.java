package template;

public abstract class Prisoner {
    protected String name;

    /**
     * 劳动的方法
     */
    abstract void work();

    /**
     * 吃的方法
     */
    abstract void eat();

    /**
     * 看新闻
     */
    abstract void readNews();

    /**
     * 一天的生活
     */
    public void life() {
        eat();
        work();
        eat();
        work();
        eat();
        readNews();
  }
}