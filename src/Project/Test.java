package Project;

import java.util.Scanner;

class Test{
	public static void main(String[] args) {
		final double PI=3.1416;
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("������: ");
		double r=stdIn.nextDouble();
		
		System.out.println("������ ���̴�"+2*PI*r+"�Դϴ�.");
		System.out.println("������"+PI*r*r+"�Դϴ�.");
	}
}
