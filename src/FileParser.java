import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Khalil Jones on 8/22/2017.
 */
public class FileParser{

    final static Charset ENCODING = StandardCharsets.UTF_8;



    List<String> readSmallTextFile(String aFileName) throws IOException {
        Path path = Paths.get(aFileName);

        return Files.readAllLines(path, ENCODING);
    }
    void writeSmallTextFile(List<String> aLines, String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        Files.write(path, aLines,ENCODING);
    }


}