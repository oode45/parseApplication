package MainApp;
import DownloadModes.DownloadHtmlFile;
import ParseModes.ParseHtmlForStatistic;
import java.util.Map;

public class LoadAndParseHtmlEx extends ParseApplication {

    @Override
    void saveToDataBase() {

    }

    @Override
    void displayDataOnConsole() {
        if(data!=null){
            // по идее мы знаем, что для этой реализации будет возвращена мапа
            // и ничего такого не случится. но это не точно
            ((Map) data).forEach((k,v) -> System.out.println(k+" - "+v));
        }
        else System.out.println("First specify the url for parsing");
    }

    public LoadAndParseHtmlEx() {
        downloadMode = new DownloadHtmlFile();
        parseMode = new ParseHtmlForStatistic();
    }


}
