package bai_1;
import java.util.List;
import java.util.Scanner;


public class bai_1 {
	public static void main(String[] args) {
	
DanhSach danhSach = new DanhSach();
		
		luaChon(danhSach);
	}
	
	public static void thongBao() {
		System.out.println("----- Vui lòng nhập lựa chọn -----");
		System.out.println("1. Nhập vào sinh viên");
		System.out.println("2. Xếp loại sinh viên");
		System.out.println("0. Thoát chương trình");
	}
	
	public static void luaChon(DanhSach danhSach) {
		
		Scanner banPhim = new Scanner (System.in);
		int luaChon, soThuTu, maSinhVien;
		boolean thoat = false;
		do {
			thongBao();
			System.out.print("Lựa chọn: ");
			luaChon = Integer.parseInt(banPhim.nextLine());
			switch(luaChon) {
			case 1:
				SV sv = new SV();
				sv.nhapThongTin();
				sv.diemTrungBinh();
				sv.xepLoai();
				danhSach.themSinhVien(sv);
				break;
			case 2:
				danhSach.xuatTatCaSinhVien();
				break;
			case 0:
				thoat = true;
				System.out.print("Đã dừng chương trình.");
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.\n");
				break;
			}
		} while(!thoat);
	}
}
