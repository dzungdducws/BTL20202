package tool;

import java.time.LocalDate;

import data.*;

public class ThemCanBo {
	public static void themCanBo(String fullName, String ID, LocalDate birthDay, int type, int workProgress) {
		switch(type) {
		case 1:
			XoaCanbo.xoaCanBo(new CanBoGiangDay(fullName, ID, birthDay, type, workProgress));
			DanhSach.list.add(new CanBoGiangDay(fullName, ID, birthDay, type, workProgress));
			break;
		case 2:
			XoaCanbo.xoaCanBo(new CanBoNghienCuu(fullName, ID, birthDay, type, workProgress));
			DanhSach.list.add(new CanBoNghienCuu(fullName, ID, birthDay, type, workProgress));
			break;
		case 3:
			XoaCanbo.xoaCanBo(new CanBoPhucVu(fullName, ID, birthDay, type, workProgress));
			DanhSach.list.add(new CanBoPhucVu(fullName, ID, birthDay, type, workProgress));
		}
	}
}
