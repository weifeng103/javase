package Singleton;

public class Singleton {
    // ��ʼ��һ��
    private static final Singleton INSTANCE = new Singleton();
    // �ñ��˲���newʵ��
    private Singleton(){
    }
    // ��֤�����ܻ�ȡ
    public static Singleton getSingleton()  {
        return INSTANCE;
    }
}
