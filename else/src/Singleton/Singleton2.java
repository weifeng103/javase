package Singleton;

public class Singleton2 {
    // 初始化一个
    private static  Singleton2 INSTANCE;
    // 让别人不能获取
    private Singleton2(){
    }
    // 保证别人能获取
    public static Singleton2 getSingleton(){
        if (INSTANCE == null){
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}
