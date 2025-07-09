package java-workshop-.StandardLibs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyUsingBinary {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("tamil-jug_logo.jpeg"));
        FileOutputStream outputStream = new FileOutputStream("MyLogo.jpeg"); 
        
        
    }
}
