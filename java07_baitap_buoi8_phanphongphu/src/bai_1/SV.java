package bai_1;
import java.util.Scanner;
public class SV {
	String tenSinhVien;
	String xepLoai = "";
	int maSinhVien;
	double diemToan;
	double diemLy;
	double diemHoa;
	double diemTrungBinh = 0;
	
	SV() {	
	}
	void nhapThongTin() {
		Scanner banPhim = new Scanner(System.in);
		
		System.out.print("Nhập tên sinh viên: ");
		this.tenSinhVien = banPhim.nextLine();
		
		System.out.print("Nhập mã sinh viên: ");
		this.maSinhVien = Integer.parseInt(banPhim.nextLine());
		
		// Nhập điểm toán
		do {
			System.out.print("Nhập điểm toán: ");
			this.diemToan = Integer.parseInt(banPhim.nextLine());
			if(diemToan < 0 || diemToan > 10) {
				System.out.println("Điểm không hợp lệ!");
			}
		} while (diemToan < 0 || diemToan > 10);
		
		// Nhập điểm lý
		do {
			System.out.print("Nhập điểm lý: ");
			this.diemLy = Integer.parseInt(banPhim.nextLine());
			if(diemLy < 0 || diemLy > 10) {
				System.out.println("Điểm không hợp lệ!");
			}
		} while (diemLy < 0 || diemLy > 10);
		
		// Nhập điểm hóa
		do {
			System.out.print("Nhập điểm hóa: ");
			this.diemHoa = Integer.parseInt(banPhim.nextLine());
			if(diemHoa < 0 || diemHoa > 10) {
				System.out.println("Điểm không hợp lệ!");
			}
		} while (diemHoa < 0 || diemHoa > 10);
	}
	void diemTrungBinh() {
		this.diemTrungBinh = (this.diemToan + this.diemLy + this.diemHoa) / 3;
		System.out.printf("Điểm trung bình: %1.1f\n", this.diemTrungBinh );
	}
	void xepLoai () {
		if(this.diemTrungBinh >= 9) {
			this.xepLoai = "Xuất Sắc";
		}
		if(this.diemTrungBinh < 9 && this.diemTrungBinh >= 8) {
			this.xepLoai = "Giỏi";
		}
		if(this.diemTrungBinh < 8 && this.diemTrungBinh >= 7) {
			this.xepLoai = "Khá";
		}
		if(this.diemTrungBinh < 7 && this.diemTrungBinh >= 6) {
			this.xepLoai = "Trung Bình Khá";
		}
		if(this.diemTrungBinh < 6 && this.diemTrungBinh >= 5) {
				this.xepLoai = "Trung bình";
		}
		if(this.diemTrungBinh < 5 ) {
			this.xepLoai = "Yếu";
		}
		System.out.println("Xếp loại: " + this.xepLoai + "\n");
	}
	public void xuatThongTin(int soThuTu) {
		DanhSach danhSachSinhVien = new DanhSach();
		System.out.print(soThuTu + "\t|");
		System.out.print(this.maSinhVien + "\t\t|");
		System.out.print(this.tenSinhVien + "\t\t\t|");
		System.out.print(this.diemToan + "\t\t\t|");
		System.out.print(this.diemLy + "\t\t\t|");
		System.out.print(this.diemHoa + "\t\t\t|");
		System.out.printf("%1.1f\t\t\t\t|",this.diemTrungBinh );
		System.out.println(this.xepLoai);
		danhSachSinhVien.gachNgang();
	}
	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	public double getMaSinhVien() {
		return maSinhVien;
	}
}
