import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by Khalil Jones on 8/22/2017.
 */
public class ReaderTest {
    final static String OUTPUT_FILE_NAME = "C:\\Users\\Khalil Jones\\AppData\\Local\\Temp\\output.txt";
    final static String FILE_NAME = "C:\\Users\\Khalil Jones\\AppData\\Local\\Temp\\input.txt";

    public static void main(String[] args) throws IOException{
        FileParser parseer = new FileParser();
        List<String> lines = parseer.readSmallTextFile(FILE_NAME);

        lines.add("This is a line added in code.");
        parseer.writeSmallTextFile(lines, FILE_NAME);

    }
}
