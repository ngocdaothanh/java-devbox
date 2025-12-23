import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadTextFile {
    public static void main(String[] args) throws Exception {
        loadWholeFile();
    }

    private static void loadWholeFile() throws Exception {
        Path filePath = Paths.get("abc.txt");
        byte[] bytes = Files.readAllBytes(filePath);

        String text = new String(bytes, "UTF-8");
        System.out.println(text);
    }

    private static void loadFileInStream() throws Exception {
        // To learn later
    }
}
