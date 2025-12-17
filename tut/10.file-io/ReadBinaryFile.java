import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadBinaryFile {
    public static void main(String[] args) throws Exception {
        loadWholeFile();
    }

    private static void loadWholeFile() throws Exception {
        byte[] bytes = Files.readAllBytes(Paths.get("abc.txt"));

        for (byte b : bytes) {
            System.out.println(b);
        }
    }
}
