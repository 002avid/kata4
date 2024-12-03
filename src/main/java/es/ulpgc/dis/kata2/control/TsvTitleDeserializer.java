package es.ulpgc.dis.kata2.control;

import es.ulpgc.dis.kata2.model.Title;

import java.time.Year;

public class TsvTitleDeserializer implements TitleDeserializer {
	@Override
	public Title deserialize(String value) {
		String[] columns = value.split("\t");
		return new Title(columns[0], Title.TitleType.valueOf(columns[1].toUpperCase()), columns[2], columns[3],
				Boolean.parseBoolean(columns[4]), getYear(columns[5]), getYear(columns[6]), getMinutes(columns[7]));
	}
	public Integer getMinutes(String s){
		if (s.equals("\\N")) return null;
		return Integer.parseInt(s);
	}
	public Year getYear(String s){
		if (s.equals("\\N")) return null;
		return Year.parse(s);
	}
}
