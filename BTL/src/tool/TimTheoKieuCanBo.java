package tool;

import data.*;

public class TimTheoKieuCanBo {
	public static void timTheoKieuCanBo(int type) {
		for (int i = DanhSach.listProcess.size() - 1; i >= 0; i--) {
			CanBo x = DanhSach.listProcess.get(i);
			if (x.getType() != type)
				DanhSach.listProcess.remove(DanhSach.listProcess.indexOf(x));
		}
	}
}
