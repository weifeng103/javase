package Singleton;

public class Singleton {
    // 初始化一个
    private static final Singleton INSTANCE = new Singleton();
    // 让别人不能new实例
    private Singleton(){
    }
    // 保证别人能获取
    public static Singleton getSingleton()  {
        return INSTANCE;
    }
}
