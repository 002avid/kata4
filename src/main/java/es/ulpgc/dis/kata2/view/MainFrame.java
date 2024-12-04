package es.ulpgc.dis.kata2.view;

import es.ulpgc.dis.kata2.control.Command;
import es.ulpgc.dis.kata2.model.Histogram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class MainFrame extends JFrame {
	private final HistogramDisplay display;
	private final Map<String, Command> commands;
	private final JFreeChartTitleDisplay titleDisplay;

	public MainFrame() {
		this.setTitle("TITULOS");
		this.setSize(1800, 1600);
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.display = new JFreeChartHistogramDisplay();
		add((JPanel)display);
		this.commands = new HashMap<>();
		this.add(titleDisplay = createTitleDisplay());
		this.add(createRandomButton());
	}
	private Component createRandomButton(){
		JButton button = new JButton("Random Movie");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				commands.get("random").execute();
			}
		});
		return button;
	}

private JFreeChartTitleDisplay createTitleDisplay(){
		return new JFreeChartTitleDisplay();
}


	public void displayHistogram(Histogram histogram) {
		display.display(histogram);
	}


public JFreeChartTitleDisplay titleDisplay(){
	return titleDisplay;
}

public void add(String operation, Command command){
	commands.put(operation, command);}
}
