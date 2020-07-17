package fileio.writer;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("/home/kiemnx/project/plus/java-core-2904/write.txt");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 3);

            byte[] data = {56, 65, 90};

            bufferedOutputStream.write(data);

            bufferedOutputStream.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileOutputStream.close();
        }


    }
}
