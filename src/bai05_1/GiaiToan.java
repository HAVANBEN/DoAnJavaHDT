package bai05_1;

import bai05.vd2.MathHelper;

public class GiaiToan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MathHelper obj1 = new MathHelper();
int tong_so_nguyen = obj1.sum(15,30);
System.out.println("Tong 2 so nguyen la:" + tong_so_nguyen);
	System.out.println("Tong 2 so thuc la:" + obj1.sum(1.23,3.45));
	}
	

}
