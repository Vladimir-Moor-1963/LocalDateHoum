import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProgLanguage> progLanguageList = new ArrayList<>();
        progLanguageList.add( new ProgLanguage("Cyrillic","USSR",LocalDate.of(1978,04,15)));
        progLanguageList.add( new ProgLanguage("Hieroglyph","China",LocalDate.of(1980,5,12)));
        progLanguageList.add( new ProgLanguage("Latin","USA",LocalDate.of(1975,6,24)));

        ProgLanguage oldestProgLanguage = progLanguageList.stream()
                .min(Comparator.comparing(ProgLanguage::getCreationDate))
                .orElse(null);

        System.out.println("oldest programming language");
        System.out.println( oldestProgLanguage);


    }
}
