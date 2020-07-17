package oop.activity52;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppTest {
    public static void main(String[] args) throws IOException {
        long score = 10L;
        int a = (int) score++;
        System.out.println(a);
    }
}

