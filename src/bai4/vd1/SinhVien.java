package bai4.vd1;

public class SinhVien extends Nguoi{
	private String maSV;
	private String nganhhoc;
	public SinhVien(String hoTen, int namSinh,String maSV, String nganhhoc) {
		super(hoTen, namSinh);
		this.setMaSV(maSV);
		this.setNganhhoc(nganhhoc);
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getNganhhoc() {
		return nganhhoc;
	}
	public void setNganhhoc(String nganhhoc) {
		this.nganhhoc = nganhhoc;
	}
	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", nganhhoc=" + nganhhoc + "]";
	}
	
}
