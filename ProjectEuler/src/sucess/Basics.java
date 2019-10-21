package sucess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println(System.currentTimeMillis());
//		System.out.println(getSum(100)-getSumOfSquare(100));
//		System.out.println(System.currentTimeMillis());
		double start = System.currentTimeMillis();
		int triplet[] = new int[10000001];
		for(int i=0;i<10000000;i++) {
			triplet[i]=(i+1)*(i+1);
		}
		System.out.println(tripletProduct(triplet));
		double end = System.currentTimeMillis();
		System.out.println("Time taken: "+((end-start)/1000)+" seconds");
	}
	
	
	
	public static int tripletProduct(int[] a) {
		for(int i=0;i<=999997;i++) {
			for(int j=i+1;j<999999;j++) {
				System.out.println("Hello");
				int search=Arrays.binarySearch(a, a[i]+a[j]);
				if(search>0) {
					if(search+i+j+3==2000) {
						System.out.println( a[i]+" "+a[j]+" "+a[search] );
						System.out.println((i+1)+" "+(j+1)+" "+(search+1));
						return (i+1)*(j+1)*(search+1);
					}
				}
			}
		}
		return -1;
	}
	
	
	public static long sumOfPrimes(long constant) {
		long sum = 5,prime = 5;
		while(prime < constant) {
			if(isPrime(prime)) {
				sum+=prime;
//				System.out.println(prime);
			}
			prime+=2;
		}
		return sum;
	}
	
	
	
	
	
	
	public static long getSum(long k) {
		long answer = (k*(k+1))/2;
		return answer*answer;
	}
	
	public static long getSumOfSquare(long k) {
		long answer = (k * (k+1) * ((2*k)+1))/6;
		return answer;
	}
	
	
	
	public static void largestPrimeFactor(long number) {
		
	}
	
	
	
	public static long smallestMultiple() {
		System.out.println("Hello");
		int i = 0, j = 0, flag = 0;
		for(i=21;;i+=20) {
			flag = 0;
			for(j=1;j<=20;) {
				if(i%j==0) {
					j++;
				}else {
					flag = 1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(i);
				return i;
			}
		}
	}

}
