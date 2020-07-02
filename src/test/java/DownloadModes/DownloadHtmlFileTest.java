package DownloadModes;

import org.junit.Test;

import static org.junit.Assert.*;

public class DownloadHtmlFileTest {

    @Test
    public void downloadFile() {
        DownloadHtmlFile downloadHtmlFile = new DownloadHtmlFile();
        assertEquals("src/main/java/DownloadFiles/Создаем программное обеспечение для бизнеса - SimbirSoft.html", downloadHtmlFile.downloadFile("https://www.simbirsoft.com/"));
    }
}