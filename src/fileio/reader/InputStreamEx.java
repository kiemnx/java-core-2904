package fileio.reader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            fileInputStream = new FileInputStream("/home/kiemnx/project/plus/java-core-2904/read.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream, 10);

            int i = 0;
            while (i != -1){
                i = bufferedInputStream.read();
                System.out.println((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            fileInputStream.close();
            bufferedInputStream.close();
        }

    }
}
