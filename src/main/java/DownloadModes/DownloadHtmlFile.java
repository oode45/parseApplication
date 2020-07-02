package DownloadModes;
import Interfaces.DownloadInterface;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DownloadHtmlFile implements DownloadInterface {
    // The class loads an html page and returns a link to the downloaded file
    @Override
    public String downloadFile(String url) {
        // The method connects to the URL and extract the data. Then it saves it as
        // a local html file and returns a link to this file.
        String pathToFile = null;
        try {
            Document doc =  Jsoup.connect(url).get();
            pathToFile = String.format("src/main/java/DownloadFiles/%s.html", doc.title());
            FileWriter htmlWriter = new FileWriter(new File(pathToFile));
            htmlWriter.write(doc.outerHtml());
            htmlWriter.close();
        } catch (IOException e) {
            e.printStackTrace(); // error of download
        }

        return pathToFile;
    }
}
