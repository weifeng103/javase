package test;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

public class IOTest {
    @Test
    public void readTest() throws IOException {
        File file = new File("D:\\testCode\\a.txt");
        InputStream inputStream = new FileInputStream(file);
        int len;
        byte[] bytes = new byte[3];
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
    }

    @Test
    public void writeTest() throws IOException {
        byte[] bytes = new byte[]{97};
        System.out.println(bytes[0]);
        OutputStream outputStream = new FileOutputStream("D:\\testCode\\a.txt", false);
        outputStream.write(bytes);
    }

    @Test
    public void copyFileTest() {
        try (
                InputStream inputStream = new FileInputStream("C:\\Users\\64383\\Pictures\\1.jpg");
                OutputStream outputStream = new FileOutputStream("C:\\Users\\64383\\Pictures\\test\\1.jpg")) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readerTest() {
        try (Reader reader = new FileReader("D:\\testCode\\a.txt");
             Writer writer = new FileWriter("D:\\testCode\\b.txt")) {
            char[] chars = new char[1024];
            int len;
            while ((len = reader.read(chars)) != -1) {
                writer.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void bufferedReaderTest() {
        try (Reader reader = new FileReader("D:\\testCode\\a.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String content;
            while ((content = bufferedReader.readLine()) != null) {
                System.out.println(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void main(String[] args){
        try (Writer writer = new FileWriter("D:\\testCode\\b.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                String content = scanner.next();
                bufferedWriter.write(content);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
