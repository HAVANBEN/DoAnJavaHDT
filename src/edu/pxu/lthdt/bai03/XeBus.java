package edu.pxu.lthdt.bai03;

import java.time.LocalDate;

public class XeBus {
	 private String hangXe;
	    private int namSanXuat;
	    private float dongCo;
	    public int soGhe;

	    public XeBus() {
	    }

	    public XeBus(String hangXe, int namSanXuat, float dongCo, int soGhe) {
	        this.hangXe = hangXe;
	        this.setNamSanXuat(namSanXuat);
	        this.dongCo = dongCo;
	        this.setSoGhe(soGhe);
	    }

	    public String getHangXe() {
	        return hangXe;
	    }

	    public void setHangXe(String hangXe) {
	       
	    	LocalDate ngayht = LocalDate.now();
			int namhientai = ngayht.getYear();
			if((namSanXuat < 1885) || (namSanXuat > namhientai)) {
				System.out.println("Nam san xuat khong phu hop");
			}else {
				this.namSanXuat = namSanXuat;
			}
	    }

	    public int getNamSanXuat() {
	        return namSanXuat;
	    }

	    public void setNamSanXuat(int namSanXuat) {
	        if (namSanXuat > 0){
	            this.namSanXuat = namSanXuat;
	        }
	    }

	    public float getDongCo() {
	        return dongCo;
	    }

	    public void setDongCo(float dongCo) {
	        this.dongCo = dongCo;
	    }

	    public int getSoGhe() {
	        return soGhe;
	    }

	    public void setSoGhe(int soGhe) {
	        this.soGhe = soGhe;
	    }

	    @Override
	    public String toString() {
	        return "XeBus{" +
	                "hangXe='" + hangXe + '\'' +
	                ", namSanXuat=" + namSanXuat +
	                ", dongCo=" + dongCo +
	                ", soGhe=" + soGhe +
	                '}';
	    }
}
