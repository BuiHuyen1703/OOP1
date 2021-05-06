package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sort {
	public String Hoten;
	public float luong;
	public sort(String Hoten, float luong) {
		this.Hoten = Hoten;
		this.luong = luong;
	}
	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so cong nhan");
		int n = input.nextInt();
		ArrayList <sort> danhSach = new ArrayList<sort>();
		for(int i = 0; i< n;i++) {
			input.nextLine();
			sort x = new sort(Hoten,luong);
			System.out.println("Thong tin cong nhan thu "+ i);
			System.out.println("Ho va ten: ");
			x.Hoten = input.nextLine();
			System.out.println("Luong: ");
			x.luong = input.nextFloat();
			danhSach.add(x);
		}
		 Collections.sort(danhSach, new Comparator<sort>() {
	            @Override
	            public int compare(sort nv1, sort nv2) {
	                if (nv1.luong < nv2.luong) {
	                    return 1;
	                } else {
	                    if (nv1.luong == nv2.luong) {
	                        return 0;
	                    } else {
	                        return -1;
	                    }
	                }
	            }
	        });
		 System.out.println("Danh sach sap xep theo thu tu luong giam dan là: ");
	        for (int i = 0; i < danhSach.size(); i++) {
	            System.out.println("Ten: " + danhSach.get(i).Hoten + " Luong: " + danhSach.get(i).luong);
	        }
	}
//	public static void main(String[] args) {
//		sort employee = new sort(null, 0);
//		employee.display();
//	}

}
