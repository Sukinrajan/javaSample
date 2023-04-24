package logic;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n=scan.nextInt();
	int i,count=0;
	if(n<2) {
		System.out.println("not a prime Number");
	}else {
	for(i=2;i<n;i++) {
		if(n%i==0) {
			count++;
		}
	}
	if(count<1) {
		System.out.println("prime number");
	}else {
		System.out.println("not a prime number");
	}
}
	//nth number
	
	 System.out.print("Enter the first number : ");  
     int start = scan.nextInt();  
     System.out.print("Enter the second number : ");  
     int end = scan.nextInt();  
     System.out.println("List of prime numbers between " + start + " and " + end);  
     for (int j = start; j <= end; j++) {  
         if (isPrime(j)) {  
             System.out.println(j);  
         }  
     }  
 }  
 public static boolean isPrime(int n) {  
     if (n <= 1) {  
         return false;  
     }  
     for (int j = 2; j <= Math.sqrt(n); j++) {  
         if (n % j == 0) {  
             return false;  
         }  
     }  
     return true;  
 
 
 
 }  	
}

