package bai03.vd2;

public class SinhVien {
	public String hoten;
	public int namsinh;
	public String sdt;
	
	public String getHoten() {
		return this.hoten;
	}
	public void setHoten(String name) {
		this.hoten = name;
	}
	public int getNamsinh() {
		return this.namsinh;
	}
	public void setNamsinh(int yob) {
		this.namsinh = yob;
	}
	public String getSdt() {
		return this.sdt;
	}
	public void setSdt(String phone) {
		this.sdt = phone;
	}
	public String toString() {
		String result = "Ho ten: " + this.getHoten() + "; namsinh: " + this.getNamsinh() +
				"; sdt: " + this.getSdt();
		return result;
	}
}
	
