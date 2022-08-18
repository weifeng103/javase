package test;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;

public class SocketTest {
    @Test
    public void inetAddressTest() throws UnknownHostException {
        InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
        System.out.println("loopbackAddress = " + loopbackAddress);
        InetAddress[] baidu = InetAddress.getAllByName("www.baidu.com");
        System.out.println("baidu = " + Arrays.toString(baidu));
    }
    @Test
    public void urlTest() throws IOException {
        URL url1 = new URL("https://down.qq.com/qqweb/PCQQ/PCQQ_EXE/PCQQ2021.exe");
        URLConnection urlConnection = url1.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        OutputStream outputStream = new FileOutputStream("D:\\QQ.exe");
        byte[] bytes = new byte[1024 * 1024];
        while (inputStream.read() != -1){
            outputStream.write(bytes);
        }
    }
}
