package es.ulpgc.dis.kata2.control;

import es.ulpgc.dis.kata2.model.Title;
import es.ulpgc.dis.kata2.view.TitleDisplay;

import java.io.File;

public class SQLiteRandomCommand implements Command{
    private final TitleDisplay titleDisplay;
    private final File dbFile;

    public SQLiteRandomCommand(TitleDisplay titleDisplay, File dbFile) {
        this.titleDisplay = titleDisplay;
        this.dbFile = dbFile;
    }

    @Override
    public void execute() {
        RandomTitleLoader loader = new SQLiteRandomTitleLoader(this.dbFile);
        Title title = loader.load();
        titleDisplay.show(title);
    }
}
