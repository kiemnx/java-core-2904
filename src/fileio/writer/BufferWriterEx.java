package fileio.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterEx {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter("/home/kiemnx/project/plus/java-core-2904/write.txt", true);

            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Nguyen Van G\n");
            bufferedWriter.write("Nguyen Van H\n");

            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }
}
