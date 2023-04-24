package logic;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a value: ");
		int row=scan.nextInt();
		int i,j;
		for(i=0;i<row;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=row;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
