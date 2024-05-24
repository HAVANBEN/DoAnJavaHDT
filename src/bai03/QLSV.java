package bai03;

public class QLSV {

	public static void main(String[] args) {
		// khai bao doi tuong sv kieu sinh vien
			SinhVien sv;
			//khoi tao doi tuong sv
			sv = new SinhVien();
			//gan tia tri cho cac thuoc tinh cua doi tuong sv
			sv.hoten = "Benn";
			sv.namsinh = 2004;
			sv.sdt = "123456789";
			//xuat gia tri cua doi tuong sv ra man hinh
			System.out.println("hoten: " + sv.hoten +"namsinh: " + sv.namsinh + "sdt :" + sv.sdt);
			
	}

}
