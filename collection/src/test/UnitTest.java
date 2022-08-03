package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTest {
    @Test
    public void TestQuery() {
        System.out.println("hello world");
    }
    @Test
    public void TestQuery2() {
        int i = 5;
        i++;
        Assertions.assertEquals(7,i);

    }
}
