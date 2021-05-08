package tool;

import data.*;

public class TimNguoiDuocThuong {
	public static void timTheoKieuCanBo() {
		for (int i = DanhSach.listProcess.size() - 1; i >= 0; i--) {
			CanBo x = DanhSach.listProcess.get(i);
			if (!x.isBonus())
				DanhSach.listProcess.remove(data.DanhSach.listProcess.indexOf(x));
		}
	}
}
