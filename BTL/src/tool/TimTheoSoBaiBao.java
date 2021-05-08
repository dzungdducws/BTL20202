package tool;

import data.*;

public class TimTheoSoBaiBao {
	public static void timTheoSoBaiBao(int j) {
		for (int i = DanhSach.listProcess.size() - 1; i >= 0; i--) {
			CanBo x = DanhSach.listProcess.get(i);
			if (x.getWorkProgress() >= j)
				DanhSach.listProcess.remove(DanhSach.listProcess.indexOf(x));
		}
	}
}
