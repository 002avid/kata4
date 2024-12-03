package es.ulpgc.dis.kata2.view;

import es.ulpgc.dis.kata2.model.Histogram;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
	JFreeChartHistogramDisplay display;

	public MainFrame() throws HeadlessException {
		this.setTitle("es.ulpgc.dis.kata2.model.Histogram Display");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.display = new JFreeChartHistogramDisplay();
		add(display);
	}

	public void displayHistogram(Histogram histogram) {
		display.display(histogram);
	}
}
