package ParseModes;
import Interfaces.ParseInterface;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParseHtmlForStatistic implements ParseInterface {
    // Class for parsing the transferred file
    @Override
    public Object parse(String url) {
        // Method gets the path to the html file, then extracts from it, splits it by regex
        // and counts the number of repetitions of each word
        File htmlFile = new File(url);
        Map<String, Long> countOfEachWord = null;
        try {
            Document doc = Jsoup.parse(htmlFile, "UTF-8");
            String t = doc.body().text()+" "+doc.title();
            String[] arr = t.split("[.,\\s!?;:\\[\\]\\(\\)\\\"\\r\\n\\t]");
            countOfEachWord = Stream.of(arr)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            countOfEachWord.forEach((k,v) -> System.out.println(k+"-"+v)); // не забыть удалить
        } catch (IOException e) {
            e.printStackTrace(); // parsing error
        }
        return countOfEachWord;
    }
}
