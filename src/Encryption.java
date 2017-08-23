import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khalil Jones on 8/23/2017.
 */
public class Encryption {
    private ArrayList<Integer> keyArray;
    private ArrayList<CharSequence> chars;
    private ArrayList<Integer> charactersInInts;
    private ArrayList<Integer> encryptedInts;
    private ArrayList<Character> encryptedChars;
    private ArrayList<String> encryptedString;
    private String encryptedWord;

    public Encryption(){
        keyArray = new ArrayList<>();
        chars = new ArrayList<>();
        charactersInInts= new ArrayList<>();
        encryptedInts = new ArrayList<>();
        encryptedChars = new ArrayList<>();
        encryptedString = new ArrayList<>();
        encryptedWord = "";
    }

    public List<String> encrypt(List<String> words){
        for(int i = 0; i < words.size(); i ++){
            for(int k = 0; k < words.get(i).length(); k++){
            keyArray.add((int) Math.random()*26);
            }
        }
        for(int i = 0; i < words.size(); i ++){
            chars.add(words.get(i));
        }
        for(int i = 0; i < chars.size(); i++){
            for(int k = 0; k < chars.get(i).length(); k++){
            charactersInInts.add((int) chars.get(i).charAt(k));
            }
        }
        for(int i = 0; i < charactersInInts.size(); i++){
             encryptedInts.add( charactersInInts.get(i) + keyArray.get(i) %26 );
        }

        for(int i = 0; i < encryptedInts.size(); i ++){
            encryptedChars.add((char)((int) encryptedInts.get(i)));
        }
        for(int i = 0; i < encryptedChars.size(); i ++) {
            String encryptedWord= "";
            encryptedWord = encryptedWord + encryptedChars.get(i);

        }
        encryptedString.add(encryptedWord);
        return encryptedString;
    }
}
