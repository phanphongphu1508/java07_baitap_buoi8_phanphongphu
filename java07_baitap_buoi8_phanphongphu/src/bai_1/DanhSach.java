package bai_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DanhSach {
List<SV> danhSach;
	
	DanhSach() {
		this.danhSach = new ArrayList<SV>();
	}
	void themSinhVien(SV sinhVien) {
		this.danhSach.add(sinhVien);
	}
	void xuatTatCaSinhVien() {
		int soThuTu = 0;
		header();
		gachNgang();
		for (SV sv: this.danhSach) {
			soThuTu++;
			sv.xuatThongTin(soThuTu);
		}
	}
	void header() {
		System.out.println("-------------------------------------------------------------------------- THÔNG TIN SINH VIÊN --------------------------------------------------------------------------");
		System.out.print("STT\t|");
		System.out.print("Mã sinh viên\t|");
		System.out.print("Tên sinh Viên\t\t|");
		System.out.print("Điểm toán\t\t|");
		System.out.print("Điểm lý\t\t|");
		System.out.print("Điểm hóa\t\t|");
		System.out.print("Điểm trung bình\t\t|");
		System.out.println("Xếp loại");
		gachNgang();
	}
	void gachNgang() {
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}
