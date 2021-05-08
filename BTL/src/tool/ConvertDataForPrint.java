package tool;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import data.*;

public class ConvertDataForPrint {
	public static CanBoDeIn convert(CanBo x) {
		String type = x.getType() == 1?"Cán Bộ Giảng Dạy":(x.getType() == 2?"Cán Bộ Nghiên Cứu":"Cán Bộ Phục Vu");	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		String date = formatter.format(x.getBirthDay());
		String bonus = x.isBonus()?"Có":"Không";
		return (new CanBoDeIn(x.getFullName(), x.getID(), date, type, x.getWorkProgress(), bonus));
	}
	
	public static ArrayList<CanBoDeIn> convert(ArrayList<CanBo> list) {
		ArrayList<CanBoDeIn> listRes = new ArrayList<CanBoDeIn>();
		for (CanBo x: list) {
			String type = x.getType() == 1?"Cán Bộ Giảng Dạy":(x.getType() == 2?"Cán Bộ Nghiên Cứu":"Cán Bộ Phục Vụ");	
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
			String date = formatter.format(x.getBirthDay());
			String bonus = x.isBonus()?"Có":"Không";
			listRes.add(new CanBoDeIn(x.getFullName(), x.getID(), date, type, x.getWorkProgress(), bonus));
		}
		return listRes;
	}
}
