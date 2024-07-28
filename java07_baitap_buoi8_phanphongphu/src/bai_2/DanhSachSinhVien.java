package bai_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachSinhVien {
	
	List<SinhVien> danhSachSinhVien;
	
	DanhSachSinhVien() {
		this.danhSachSinhVien = new ArrayList<SinhVien>();
	}
	void themSinhVien(SinhVien sinhVien) {
		this.danhSachSinhVien.add(sinhVien);
	}
	SinhVien diemTrungBinhCaoNhat() {
		header();
		SinhVien max = this.danhSachSinhVien.get(0);
		for(SinhVien sinhVien: danhSachSinhVien) {
			if (sinhVien.getDiemTrungBinh() > max.getDiemTrungBinh()) {
				max = sinhVien;
			}
		}
		return max;
	}
	void tatCaSinhVienYeu() {
		int soThuTu = 0;
		header();
		for(SinhVien sinhVien: this.danhSachSinhVien) {
			if(sinhVien.getDiemTrungBinh() < 5) {
				soThuTu++;
				sinhVien.xuatThongTin(soThuTu);
			}
		}
		if (soThuTu == 0) {
			System.out.println("Không có sinh viên loại yếu.");
		}
	}
	List<SinhVien> timSinhVienTheoTen(String tenSinhVien) {
		header();
		List <SinhVien> ketQua = new ArrayList<SinhVien>();
		for (SinhVien sinhVien: danhSachSinhVien) {
			if(sinhVien.getTenSinhVien().toLowerCase().equals(tenSinhVien.toLowerCase())) {
				ketQua.add(sinhVien);
			}
		}
		return ketQua;
	}
	SinhVien timSinhVienTheoMa(int maSinhVien) {
		SinhVien ketQua = null;
		for (SinhVien sinhVien: this.danhSachSinhVien) {
			if(sinhVien.getMaSinhVien() == maSinhVien) {
				ketQua = sinhVien;
				break;
			}
		}
		return ketQua;
	}
	void xoaSinhVienTheoMa(int maSinhVien) {
		Scanner banPhim = new Scanner(System.in);
		char chon;
		int stt = 0;
		for (SinhVien sinhVien: this.danhSachSinhVien) {
			if(sinhVien.getMaSinhVien() == maSinhVien) {
				stt++;
				System.out.print("Bạn chắc chắn xóa! chọn 'Y' hoặc 'N: ");
				chon = banPhim.nextLine().charAt(0);
				switch(chon) {
				case 'Y':
					this.danhSachSinhVien.remove(sinhVien);
					System.out.println("Đã xóa sinh viên có mã " + maSinhVien);
					break;
				case 'N':
					break;
				}
			}
		} if(stt == 0) {
			header();
			System.out.print("Không tìm thấy sinh viên cần xóa");
		}
	}
	void xuatTatCaSinhVien() {
		int soThuTu = 0;
		header();
		gachNgang();
		for (SinhVien sinhVien: this.danhSachSinhVien) {
			soThuTu++;
			sinhVien.xuatThongTin(soThuTu);
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
