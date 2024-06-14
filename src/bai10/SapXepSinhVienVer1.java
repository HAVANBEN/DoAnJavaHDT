package bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import bai10.model.SinhVien;
import bai9.vd1.SinhVien;

public class SapXepSinhVienVer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<SinhVien> dssv = new ArrayList<SinhVien>();
dssv.add(new SinhVien("Ben",10,20));
dssv.add(new SinhVien("Minh",9,20));
dssv.add(new SinhVien("Nam",8,20));
System.out.println(dssv);
Collections.sort(dssv);
for(SinhVien item: dssv) {
	System.out.println(item);
}
	}

}
