package tool;

import java.time.LocalDate;

import data.*;

public class ThayCanBo {
	public static void thayCanBo(String s, String fullName, String ID, LocalDate birthDay, int type, int workProgress) {
		for (CanBo x: DanhSach.list) {
			if (s.contains(ConvertDataForPrint.convert(x).toString())) {
				switch(type) {
				case 1:
					XoaCanbo.xoaCanBo(new CanBoGiangDay(fullName, ID, birthDay, type, workProgress));
					DanhSach.list.set(DanhSach.list.indexOf(x), new CanBoGiangDay(fullName, ID, birthDay, type, workProgress)); 
					break;
				case 2:
					XoaCanbo.xoaCanBo(new CanBoNghienCuu(fullName, ID, birthDay, type, workProgress));
					DanhSach.list.set(DanhSach.list.indexOf(x), new CanBoNghienCuu(fullName, ID, birthDay, type, workProgress));
					break;
				case 3:
					XoaCanbo.xoaCanBo(new CanBoPhucVu(fullName, ID, birthDay, type, workProgress));
					DanhSach.list.set(DanhSach.list.indexOf(x), new CanBoPhucVu(fullName, ID, birthDay, type, workProgress));
				}
				System.out.println(x);
				break;
				
			}
		}
	}
}
