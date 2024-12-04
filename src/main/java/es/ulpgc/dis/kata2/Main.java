package es.ulpgc.dis.kata2;

import es.ulpgc.dis.kata2.control.*;
import es.ulpgc.dis.kata2.model.Histogram;
import es.ulpgc.dis.kata2.view.MainFrame;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File tsvfile = new File("D:/Fotillos/IS2/title.basics.tsv");
		File dbFile = new File("./base_de_datos.db");
		new TitleLoader().loadTitles(tsvfile, dbFile);
		Histogram histogram = new TitleTypeHistogram(new SQLiteTitleReader(dbFile));
		MainFrame mainFrame = new MainFrame();
		mainFrame.displayHistogram(histogram);
		Command randomCommand = new SQLiteRandomCommand(
				mainFrame.titleDisplay(),
				dbFile
		);
		mainFrame.add("random", randomCommand);
		mainFrame.setVisible(true);
	}

}
