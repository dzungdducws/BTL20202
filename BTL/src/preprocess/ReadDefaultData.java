package preprocess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadDefaultData {
	private ArrayList<String> data = new ArrayList<String>();;
	
	public ArrayList<String> readData() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("src/preprocess/data1.txt"));
			String line = reader.readLine();
			line = reader.readLine();
			while (line != null) {
				data.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}
