package ParseModes;

import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ParseHtmlForStatisticTest {

    @Test
    public void parse() {
        ParseHtmlForStatistic parseHtmlForStatistic = new ParseHtmlForStatistic();
        HashMap<String,Long> expected = new HashMap<>();
        expected.put("Document", 1L);
        expected.put("Div", 2L);
        expected.put("SpaN", 3L);
        expected.put("P", 4L);
        expected.put("h1", 5L);
        expected.put("text", 6L);

        assertThat(parseHtmlForStatistic.parse("src/test/java/HtmlForTests/Untitled-1.html"), is(expected));
    }
}