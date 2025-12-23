import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadBinaryFile {
    public static void main(String[] args) throws Exception {
        loadWholeFile();
    }

    private static void loadWholeFile() throws Exception {
        Path filePath = Paths.get("abc.txt");
        byte[] bytes = Files.readAllBytes(filePath);

        for (byte b : bytes) {
            // In Java, all numbers are signed.
            // Convert byte to int so that the result is in range 0-255.
            int unsignedByte = b & 0xFF;
            System.out.println(unsignedByte);
        }
    }

    private static void loadFileInStream() throws Exception {
        // To learn later
    }
}
