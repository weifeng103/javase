package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
    Class<Dog> clazz = null;

    public ReflectTest() throws ClassNotFoundException {
    }

    // 使用类名
    @BeforeEach
    public void before() {
        clazz = Dog.class;
    }

    // 使用对象
    Dog dog2 = new Dog();
    Class<? extends Dog> dog3 = dog2.getClass();
    // forName 全限定名称
    Class<?> dog4 = Class.forName("test.Dog");

    @Test
    public void fieldTest() throws NoSuchFieldException{
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Field names = clazz.getDeclaredField("name");
        System.out.println(names.getName());
    }

    @Test
    public void methodTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method[] methods = clazz.getMethods();
        for (Method method : methods
        ) {
            System.out.println(method);
        }
        Method say = clazz.getDeclaredMethod("say");
        Dog dog = new Dog();
        say.invoke(dog);
    }
    @Test
    public void constructorTest() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?>[] constructors = clazz.getConstructors();
        Constructor<Dog> declaredConstructor = clazz.getDeclaredConstructor();
        Dog dog = declaredConstructor.newInstance();
    }
    @Test
    public void annotationTest() throws NoSuchFieldException {
        Field declaredField = clazz.getDeclaredField("name");

    }
}
