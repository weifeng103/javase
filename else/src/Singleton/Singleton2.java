package Singleton;

public class Singleton2 {
    // ��ʼ��һ��
    private static  Singleton2 INSTANCE;
    // �ñ��˲��ܻ�ȡ
    private Singleton2(){
    }
    // ��֤�����ܻ�ȡ
    public static Singleton2 getSingleton(){
        if (INSTANCE == null){
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}
