import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by Khalil Jones on 8/22/2017.
 */
public class ReaderTest {
    final static String OUTPUT_FILE_NAME = "C:\\Users\\Khalil Jones\\Documents\\output.txt";
    final static String FILE_NAME = "C:\\Users\\Khalil Jones\\Documents\\input.txt";

    public static void main(String[] args) throws IOException{
        FileParser parseer = new FileParser();
        List<String> lines = parseer.readSmallTextFile(FILE_NAME);
        for(int i = 0; i < lines.size(); i ++){
            System.out.println(lines.get(i));
        }

        parseer.writeSmallTextFile(lines, OUTPUT_FILE_NAME);

    }
}
