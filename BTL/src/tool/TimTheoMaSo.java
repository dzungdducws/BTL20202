package tool;

import data.*;

public class TimTheoMaSo {
	public static void timTheoMaSo(String ID) {
		for (int i = DanhSach.listProcess.size() - 1; i >= 0; i--) {
			CanBo x = DanhSach.listProcess.get(i);
			if (!(x.getID().contains(ID)))
				DanhSach.listProcess.remove(DanhSach.listProcess.indexOf(x));
		}
	}
}
