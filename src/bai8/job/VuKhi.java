package bai8.job;

public class VuKhi {
private String tenVuKhi;
private int SoLuong;
public VuKhi(String tenVuKhi, int soLuong) {
	super();
	this.setTenVuKhi(tenVuKhi);
	this.setSoLuong(soLuong);
}
public String getTenVuKhi() {
	return tenVuKhi;
}
public void setTenVuKhi(String tenVuKhi) {
	this.tenVuKhi = tenVuKhi;
}
public int getSoLuong() {
	return SoLuong;
}
public void setSoLuong(int soLuong) {
	SoLuong = soLuong;
}
@Override
public String toString() {
	return "VuKhi [tenVuKhi=" + tenVuKhi + ", SoLuong=" + SoLuong + "]";
}

}
