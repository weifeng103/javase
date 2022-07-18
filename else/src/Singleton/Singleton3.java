package Singleton;

public class Singleton3 {
    // 让别人不能获取
    private Singleton3() {
    }
    // 获取实例
    public static Singleton3 INSTANCE(){
        return Singleton.INSTANCE;
    }
    // 静态内部类会在第一次使用的时候加载一次 ，静态常量会在类加载后初始化一次
    private static class Singleton {
        private static final Singleton3 INSTANCE = new Singleton3();
    }
}
