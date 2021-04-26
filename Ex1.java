package main;

import java.util.Scanner;

public class Ex1 {
	private String firstName;
	private String lastName;
	private String className;
	private int age;
	private float C;
	private float PHP;
	private float diemTB;
	private String xepLoai;
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public float getC() {
		return C;
	}
	public void setC(float c) {
		C = c;
	}
	public float getPHP() {
		return PHP;
	}
	public void setPHP(float pHP) {
		PHP = pHP;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	public String getXepLoai() {
		return xepLoai;
	}
	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}
	public Ex1(String firstName, String lastName, int age,String className,float C, float PHP, float diemTB,String xepLoai) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.className = className;
		this.C = C;
		this.PHP = PHP;
		this.diemTB = diemTB;
		this.xepLoai = xepLoai;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void dislay() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your last name: ");
		lastName = input.nextLine();
		System.out.println("Enter your first name: ");
		firstName = input.nextLine();
		System.out.println("Enter your class: ");
		className = input.nextLine();
		System.out.println("Enter your age: ");
		age = input.nextInt();
		System.out.println("Xin chao " + getLastName() + " " + getFirstName() + " " + getAge() + " tuoi");
		System.out.println("Enter your C mark: ");
		C = input.nextFloat();
		System.out.println("Enter your PHP mark: ");
		PHP = input.nextFloat();
		diemTB=(C+PHP)/2;
		System.out.println("Diem trung binh mon cua " + getFirstName() +" la:" + getDiemTB());
		if(diemTB>=8) {
			xepLoai = "Gioi";
		}else if (diemTB>=6){
			xepLoai = "Kha";
		}else if (diemTB>=5) {
			xepLoai = "TB";
		}else {
			xepLoai = "Khong dat";
		}
		System.out.println("Ket qua xep loai hoc tap cua " + getFirstName()  + " la: " + getXepLoai());
	}

	

}
