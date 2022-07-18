package Singleton;

public class Singleton3 {
    // �ñ��˲��ܻ�ȡ
    private Singleton3() {
    }
    // ��ȡʵ��
    public static Singleton3 INSTANCE(){
        return Singleton.INSTANCE;
    }
    // ��̬�ڲ�����ڵ�һ��ʹ�õ�ʱ�����һ�� ����̬������������غ��ʼ��һ��
    private static class Singleton {
        private static final Singleton3 INSTANCE = new Singleton3();
    }
}
