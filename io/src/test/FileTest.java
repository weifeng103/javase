package test;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileTest {
    @Test
    public void filePathTest() {
        System.out.println("hello\r\nworld");
    }
    @Test
    public void createFileTest() {
        File file = new File("C:\\Users\\64383\\Pictures");
        File file2 = new File("C:\\Users\\64383\\Pictures","1.jpg");

        File parent = new File("C:\\Users\\64383\\Pictures");
        File file3 = new File(parent,"1.jpg");
    }
    @Test
    public void testFile() throws IOException {
        File file = new File("C:\\Users\\64383\\Pictures");
        if (!file.exists()){
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        }
        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.canRead() = " + file.canRead());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getTotalSpace() = " + file.getTotalSpace());
        System.out.println("file.lastModified() = " + file.lastModified());
    }
    @Test
    public void findAllPicture(){
        FileTest fileTest = new FileTest();
        fileTest.findAll("C:\\Users\\64383\\Pictures");
    }
    public void findAll(String path){
        File file = new File(path);
        // f是父类文件 n是子类文件名
        // new File(f,n)能得到父类文件下的所有文件,与下面的创建方式相同
        /// File parent = new File("C:\\Users\\64383\\Pictures");
        /// File file3 = new File(parent,"1.jpg");
        File[] list = file.listFiles((f,n) -> new File(f,n).isDirectory() || n.contains("jpg") || n.contains("png") || n.contains("jpeg"));
        if(list == null || list.length == 0){
            return;
        }
        for (File parent : list){
            if (parent.isDirectory()){
                findAll(parent.getAbsolutePath());
            }else{
                System.out.println(parent.getName());
            }
        }
    }
}

