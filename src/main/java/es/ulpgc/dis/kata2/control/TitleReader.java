package es.ulpgc.dis.kata2.control;

import es.ulpgc.dis.kata2.model.Title;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public interface TitleReader {
	Iterator<Title> read() throws IOException;
}
