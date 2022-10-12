package test;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
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
    @Test
    public void serverTest() throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(8888));
        Socket socket = serverSocket.accept();
        InputStreamReader inputStream = new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8);
        byte[] bytes = new byte[10];
        int len;
        while ((len = inputStream.read()) != -1){
            System.out.println(new String(bytes));
        }
        inputStream.close();
        socket.close();
    }
    @Test
    public void clientTest() throws IOException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(InetAddress.getLoopbackAddress(),8888));
        OutputStreamWriter outputStream = new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8);
        outputStream.write("你好");
        outputStream.close();
        socket.close();
    }
}
