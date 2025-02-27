package service;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class PrintStreamList extends PrintStream {
	public PrintStreamList(OutputStream out){
		super(out);
	}
	public PrintStreamList(String fileName) throws IOException{
		super(fileName);
	}
	
	public void println(ArrayList<String> lista) {
		for(String t:lista) {
			println(t);
		}
	}
}
