package preprocess;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import tool.ThemCanBo;

public class InitData {
	public static void init(){
		ReadDefaultData DefaultData = new ReadDefaultData();
		for (String x: DefaultData.readData()) {
			String[] s = x.split(", ");	
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
			LocalDate date = LocalDate.parse(s[2], formatter);
			int type = Integer.parseInt(s[3]);
			int workProgress = Integer.parseInt(s[4]);
			ThemCanBo.themCanBo(s[0], s[1], date, type, workProgress);
		}
	}
}
