package bai_2;

import java.util.List;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
		
		luaChon(danhSachSinhVien);
	}
	
	public static void thongBao() {
		System.out.println("----- Vui lòng nhập lựa chọn -----");
		System.out.println("1. Nhập vào sinh viên");
		System.out.println("2. Xếp loại sinh viên");
		System.out.println("3. Sinh viên có điểm trung bình cao nhất");
		System.out.println("4. In ra tất cả sinh viên yếu");
		System.out.println("5. Tìm sinh viên theo tên");
		System.out.println("6. Tìm sinh viên theo mã");
		System.out.println("7. Xóa một sinh viên theo mã");
		System.out.println("0. Thoát chương trình");
	}
	
	public static void luaChon(DanhSachSinhVien danhSachSinhVien) {
		
		Scanner banPhim = new Scanner (System.in);
		int luaChon, soThuTu, maSinhVien;
		boolean thoat = false;
		do {
			thongBao();
			System.out.print("Lựa chọn: ");
			luaChon = Integer.parseInt(banPhim.nextLine());
			switch(luaChon) {
			case 1:
				SinhVien sinhVien = new SinhVien();
				sinhVien.nhapThongTin();
				// Điểm trung bình
				sinhVien.diemTrungBinh();
				// Xếp loại
				sinhVien.xepLoai();
				danhSachSinhVien.themSinhVien(sinhVien);
				break;
			case 2:
				danhSachSinhVien.xuatTatCaSinhVien();
				break;
			case 3:
				danhSachSinhVien.diemTrungBinhCaoNhat().xuatThongTin(1);;
				break;
			case 4:
				danhSachSinhVien.tatCaSinhVienYeu();
				break;
			case 5:
				soThuTu = 0;
				System.out.print("Nhập tên sinh viên cần tìm: ");
				String tenSinhVien = banPhim.nextLine();
				List<SinhVien> danhSachSinhVienTimDuoc = danhSachSinhVien.timSinhVienTheoTen(tenSinhVien);
				for(SinhVien sinhVienTimDuoc: danhSachSinhVienTimDuoc) {
					soThuTu++;
					sinhVienTimDuoc.xuatThongTin(soThuTu);
				}
				if (soThuTu == 0) {
					System.out.print("Không tìm thấy sinh viên");

				}
				break;
			case 6:
				System.out.print("Nhập mã sinh viên cần tìm: ");
				maSinhVien = Integer.parseInt(banPhim.nextLine());
				danhSachSinhVien.header();
				if(danhSachSinhVien.timSinhVienTheoMa(maSinhVien) != null ) {
					danhSachSinhVien.timSinhVienTheoMa(maSinhVien).xuatThongTin(1);
				} else {
					System.out.print("Không tìm thấy sinh viên");
				}
				break;
			case 7:
				System.out.print("Nhập mã sinh viên cần xóa: ");
				maSinhVien = Integer.parseInt(banPhim.nextLine());
				danhSachSinhVien.xoaSinhVienTheoMa(maSinhVien);
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
