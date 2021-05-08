package tool;

import data.*;

public class TimTheoSoGio {
	public static void timTheoSoGio(int j) {
		for (int i = DanhSach.listProcess.size() - 1; i >= 0; i--) {
			CanBo x = DanhSach.listProcess.get(i);
			if (x.getWorkProgress() <= j)
				DanhSach.listProcess.remove(DanhSach.listProcess.indexOf(x));
		}
	}
}
