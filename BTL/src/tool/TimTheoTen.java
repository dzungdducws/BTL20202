package tool;

import data.CanBo;
import data.DanhSach;

public class TimTheoTen {
	public static void timTheoTen(String name) {
		for (int i = DanhSach.listProcess.size() - 1; i >= 0; i--) {
			CanBo x = DanhSach.listProcess.get(i);
			if (!(x.getFullName().contains(name)))
				DanhSach.listProcess.remove(DanhSach.listProcess.indexOf(x));
		}
	}
}
