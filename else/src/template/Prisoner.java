package template;

public abstract class Prisoner {
    protected String name;

    /**
     * �Ͷ��ķ���
     */
    abstract void work();

    /**
     * �Եķ���
     */
    abstract void eat();

    /**
     * ������
     */
    abstract void readNews();

    /**
     * һ�������
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