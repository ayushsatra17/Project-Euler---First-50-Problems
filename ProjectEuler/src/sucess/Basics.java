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
	
	
	public static boolean isPrime(long n) {
		if(n%2==0 || n%3==0) {
			return false;
		}
		for(int i=5;i<=Math.sqrt(n);i+=6) {
			if(n%i==0 || n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int threeOrFive() {
		int sum=0;
		for(int i=1;i<1000;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
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
	
	public static int getFibonacciEvenSum() {
		int first = 0, second = 1, result = 0, sum = 0;
		while(result<(4*(1000000))) {
			result = (first+second);
			if(result%2==0) {
				sum+=result;
			}
			first = second;
			second = result;
		}
		return sum;
	}
	
	public static void largestPrimeFactor(long number) {
		
	}
	
	public static int palindromicProduct() {
		int ans = 0, result = 0;
		StringBuffer s;
		for(int i=100;i<=999;i++) {
			for(int j=i;j<=999;j++) {
				ans = j*i;
				s = new StringBuffer(String.valueOf(ans));
				if(Integer.parseInt(s.reverse().toString()) == ans) {
					if(ans>result) {
						System.out.println(ans + " " + i + " " + j);
						result = ans;
					}
				}
			}
		}
		return result;
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
