package tool;

import java.time.LocalDate;

import data.*;

public class TimTheoSinhNhat {
	public static void timTheoSinhNhat(LocalDate date) {
		for (int i = DanhSach.listProcess.size() - 1; i >= 0; i--) {
			CanBo x = DanhSach.listProcess.get(i);
			if (x.getBirthDay() != date)
				DanhSach.listProcess.remove(DanhSach.listProcess.indexOf(x));
		}
	}
}
