package es.ulpgc.dis.kata2;

import es.ulpgc.dis.kata2.control.TitleReader;
import es.ulpgc.dis.kata2.control.TitleTypeHistogram;
import es.ulpgc.dis.kata2.control.TsvTitleReader;
import es.ulpgc.dis.kata2.model.Histogram;
import es.ulpgc.dis.kata2.view.MainFrame;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		TitleReader reader = new TsvTitleReader(new File(args[0]));
		Histogram histogram = new TitleTypeHistogram(reader.read());
		MainFrame mainFrame = new MainFrame();
		mainFrame.displayHistogram(histogram);
		mainFrame.setVisible(true);

	}


}
