package fileio.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader("/home/kiemnx/project/plus/java-core-2904/read.txt");
            bufferedReader = new BufferedReader(fileReader, 10);

            int i = 0;
            /*while (i != -1){
                i = bufferedReader.read();
                System.out.println((char) i);
            }*/

            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
            bufferedReader.close();
        }
    }
}
