package MainApp;

import Interfaces.DownloadInterface;
import Interfaces.ParseInterface;

public abstract class ParseApplication {
    DownloadInterface downloadInterface;
    ParseInterface parseInterface;
    String fileAdress;

    abstract void saveToDataBase();
    abstract void displayOnConsole();

    public ParseApplication() {
    }

    public void setDownloadInterface(DownloadInterface downloadInterface) {
        this.downloadInterface = downloadInterface;
    }

    public void setParseInterface(ParseInterface parseInterface) {
        this.parseInterface = parseInterface;
    }
}
