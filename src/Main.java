import java.sql.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<ProgLanguage> progLanguageList = new ArrayList<>();
        progLanguageList.add( new ProgLanguage("Cyrillic","USSR",LocalDate.of(1978,4,15)));
        progLanguageList.add( new ProgLanguage("Hieroglyph","China",LocalDate.of(1980,5,12)));
        progLanguageList.add( new ProgLanguage("Latin","USA",LocalDate.of(1975,6,24)));

        ProgLanguage oldestProgLanguage = progLanguageList.stream()
                .min(Comparator.comparing(ProgLanguage::getCreationDate))
                .orElse(null);

        System.out.println("oldest programming language");
        System.out.println( oldestProgLanguage);

        List<Packtage> packtages = new ArrayList<>();
       // LocalDateTime departureTime = LocalDateTime.of();
        packtages.add(new Packtage("Moscow","Berlin",23.3,LocalDateTime.of(2024,7,12,12,30)));
        packtages.add(new Packtage("Hof","Berlin",12.2,LocalDateTime.of(2024,7,23,20,20)));
        packtages.add(new Packtage("Tashkent","Berlin",5.6,LocalDateTime.of(2024,6,16,23,12)));
        packtages.add(new Packtage("Chelyabinsk","Berlin",54.3,LocalDateTime.of(2024,5,12,13,55)));
        Optional<Packtage> newparcel = packtages.stream()
                .filter(pack-> pack.getReceiptOfCiti().equalsIgnoreCase("Berlin"))
                .max(Comparator.comparing(Packtage::getDepartureTime));
        System.out.println(newparcel);




}}
