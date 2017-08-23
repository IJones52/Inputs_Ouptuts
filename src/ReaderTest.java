import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khalil Jones on 8/22/2017.
 */
public class ReaderTest {
    final static String OUTPUT_FILE_NAME = "C:\\Users\\Khalil Jones\\Documents\\output.txt";
    final static String FILE_NAME = "C:\\Users\\Khalil Jones\\Documents\\input.txt";

    public static void main(String[] args) throws IOException{
        FileParser parseer = new FileParser();
        Encryption encryption = new Encryption();
        List<String> lines = parseer.readSmallTextFile(FILE_NAME);
        ArrayList<String> lines3 = new ArrayList<>();
        for(int i = 0; i < lines.size(); i ++){
            System.out.println(lines.get(i));
            lines3.add(lines.get(i).toUpperCase());
        }
       List<String> lines2 = encryption.encrypt(lines3);
        for(int i = 0; i < lines2.size(); i ++){
            System.out.println(lines2.get(i));
        }
        parseer.writeSmallTextFile(lines2, OUTPUT_FILE_NAME);

    }
}
