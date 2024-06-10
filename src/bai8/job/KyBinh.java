package bai8.job;

import java.util.ArrayList;

public class KyBinh implements Cloneable {
private int maKyBinh;
private ArrayList<VuKhi> dskb;

public KyBinh(int maKyBinh, ArrayList<VuKhi> dssp) {
	super();
	this.setMaKyBinh(maKyBinh);
	this.dskb = dskb;
}

public int getMaKyBinh() {
	return maKyBinh;
}

public void setMaKyBinh(int maKyBinh) {
	this.maKyBinh = maKyBinh;
}

public ArrayList<VuKhi> getDssp() {
	return dskb;
}

public void setDssp(ArrayList<VuKhi> dssp) {
	this.dskb = dskb;
}

@Override
public String toString() {
	return "KyBinh [maKyBinh=" + maKyBinh + ", dskb=" + dskb + "]";
}

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	ArrayList<KyBinh> dskbmoi = new ArrayList<KyBinh>();
	for(KyBinh item: this.	dskb) {
		KyBinh tam =  	new KyBinh(item.getMaKyBinh());
		dskb.add(tam);
		
	}
	KyBinh sl = new KyBinh(this.maKyBinh,dskb);
	return sl;
}

}
