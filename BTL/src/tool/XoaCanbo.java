package tool;

import data.*;

public class XoaCanbo {
	public static void xoaCanBo(CanBo canbo) {
		for (CanBo x: DanhSach.list) {
			if (canbo.equals(x)) {
				DanhSach.list.remove(DanhSach.list.indexOf(x));
				break;
			}
		}
	}
	
	public static void xoaCanBo(String s) {
		for (CanBo x: DanhSach.list) {
			if (s.contains(ConvertDataForPrint.convert(x).toString())) {
				DanhSach.list.remove(DanhSach.list.indexOf(x));
				break;
			}
		}
	}
	
	
}
