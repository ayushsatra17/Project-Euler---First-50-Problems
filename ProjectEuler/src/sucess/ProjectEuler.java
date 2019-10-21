package sucess;

import java.io.BufferedReader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ProjectEuler {
	
	static long tMatrix[];
	static int arr[][];
	static int finalArray[];
	static String ones[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	static String tens[] = {"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static String hundreds[] = {"","onehundred","twohundred","threehundred","fourhundred","fivehundred","sixhundred","sevenhundred","eighthundred","ninehundred"};
	static String tys[] = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	static HashMap<String, Integer> alphabetMap; 
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

//      Problem-01
//		int t = sc.nextInt();
//        while(t!=0){
//            int n = sc.nextInt();
//            System.out.println(sumOfDivisor(n-1,3)+sumOfDivisor(n-1,5)-sumOfDivisor(n-1,15));
//            t--;
//        }
		
		//Problem-02
//		System.out.println(getFibonacciEvenSum(100));
		
		System.out.println(palindromicProduct(101110));
		
		
		
		//Problem-03
		//Problem-04
		//Problem-05
		//Problem-06
		//Problem-07
		//Problem-08
		//Problem-09
		//Problem-10
		
//		BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\dell\\Desktop\\input.txt"));
		
//		initializeWithAlphabets();
//     	namesScores();
		
//	    Amicable Numbers ==> problem 21
//		double start = System.currentTimeMillis();
//		System.out.println(amicableNumbers(1000));
//		double end = System.currentTimeMillis();
//		System.out.println((end-start)/1000);
		
//		Problem 23
//		System.out.println(nonAbundantSums());
		
//		Problem 25
//		thousandDigitFiboNacciNumber();

//		double start = System.currentTimeMillis();
//		System.out.println(numberSpiralDiagonal(Long.MAX_VALUE)+" "+Long.MAX_VALUE);
//		double end = System.currentTimeMillis();
//		System.out.println((end-start)/1000);

//		HashMap<String,String> h = new HashMap<>();
//		h.put("mom", "9699667895");
//		h.put("mom jio", "222");
////		if(h.containsKey(key)("9699667895")) {
////			System.out.println("true"+" "+h.size());
////		}else {
////			System.out.println("false");
////		}
//		
//		Set<String> h1 = new HashSet<String>(); 
//		h1 = h.keySet();
//		for(String key : h1) {
//			if(key.contains("mom")) {
//				System.out.println(key);
//			}
//		}
				
//      Problem 29
//		System.out.println(getDistinctPowers(100));
					
//		double start = System.currentTimeMillis();
//		countingSundays();
//		double end = System.currentTimeMillis();
//		System.out.println((end-start)/1000);		
		
//		System.out.println(returnFirstThousandFiboIndex());
//		returnFirstThousandFiboIndex();
//     	System.out.println(digitCount(BigInteger.valueOf(1000)));
     	
//		arr = new int[100][50];
//		finalArray = new int[50];
		
//		getFactorial(100);
		
//		
//		long sum = 0;
//		for(int i=1;i<=1000;i++) {
//			sum = sum + getCount(i);
//		}
//		System.out.println(sum);
		
	
//		BigInteger big = BigInteger.ONE;
//		big=big.add(BigInteger.ONE);
//		big = big.pow(1000);
//		String s = big.toString();
//		System.out.println(sumOfBigNumber(s));
		
		
//      14th problem		
//		long max = 0,newMax=0,maxNumber=0;
//		for(long start=13;start<=1000000;start++){
//			newMax = getCollatz(start);
//			System.out.println(newMax+" "+max);
//			if(newMax>=max) {
//				max=newMax;
//				maxNumber = start;
//			}
//		}		
//		System.out.println(maxNumber);
		
		
//		for(int i=0;i<100;i++) {
//			storeInArray(i, buffer.readLine());
//		}
//		
//		sumOver();
//		
//		int first = getCountOfDigits(finalArray[0]);
//		String ans = "" + finalArray[0];
//		for(int i=1;i<=10-first;i++) {
//			ans += finalArray[i]; 
//		}
//		
//		System.out.println("10 digits of sum: "+ans);
		
//     12th Problem
//		tMatrix = new long[30000];
//		tMatrix[0]=0;
//		tMatrix[1]=1;
//		for(int i=2;i<=15000;i++) {
//			if(getNumberOfFactors(triangularNumber(i))>=500) {
//				System.out.println(i+" "+triangularNumber(i));
//			}
//		}
		
//      11th problem
//		long arr[][] = new long[20][20];
//		for(int row=0;row<20;row++) {
//			for(int col=0;col<20;col++) {
//				arr[row][col] = sc.nextLong();
//			}
//		}
//		System.out.println(getMaxInMatrix(arr));
		
	}
	
	//Problem-01
	public static long sumOfDivisor(int target, int n) {
		// Catch: Not to use Math.round() because if it is 8.8 it will be converted to 9 instead of 8 
		int limit = (int)((target-1)/n);
		long temp = n*(limit)*(limit+1);
		temp = temp/2;
		return temp;
	}
	
	//Problem-02
	public static long getFibonacciEvenSum(long n) {
		int first = 0, second = 1, result = 0, sum = 0;
		while(result<n) {
			System.out.println(result);
			result = (first+second);
			if(result%2==0 && result<n) {
				sum+=result;
			}
			first = second;
			second = result;
		}
		return sum;
	}
	
	//Problem-03
	public static long getLargestPrime(long n) {
		List<Long> primes = new ArrayList<>();
		if(isPrime(n)) {
			return n;
		}
		for(long i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				if(isPrime(i)) {
					primes.add(i);
				}
				if(isPrime((n/i))) {
					primes.add(n/i);
				}
			}
		}
		return Collections.max(primes);
	}
	
	public static boolean isPrime(long n) {
		for(long i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//Problem-04
	public static int palindromicProduct(long limit) {
		int ans = 0, result = 0;
		StringBuffer s;
		for(int i=100;i<=999;i++) {
			for(int j=i;j<=999;j++) {
				ans = j*i;
				if(ans<=limit) {
					s = new StringBuffer(String.valueOf(ans));
					if(Integer.parseInt(s.reverse().toString()) == ans) {
						if(ans>result) {
//							System.out.println(ans);
							result = ans;
						}
					}
				}
			}
		}
		return result;
	}
	
	
	//Problem-05
	//Problem-06
	//Problem-07
	//Problem-08
	//Problem-09
	//Problem-10
	
	public static long digitPowers(int n) {
		long countSum = 0;
		long start = (long) Math.pow(10, n-1);
		long end = (long) Math.pow(10, n);
		for(long i=2;i<355000;i++) {
			if(i==getSum(i, n)) {
				System.out.println(i);
				countSum+=i;
			}
		}
		return countSum;
	}
	
	public static long getSum(long n, long pow) {
		long sum = 0;
		while(n!=0) {
			long temp = n%10;
			sum = sum + (long)(Math.pow(temp, pow));
			n = n/10;
		}
		return sum;
	}
	
	public static int getDistinctPowers(int n) {
		HashSet<BigInteger> distinctElements = new HashSet<>();
		for(int a=2;a<=n;a++){
			BigInteger power = BigInteger.valueOf((long) a);
			for(int b=2;b<=n;b++){
				BigInteger temp = power.pow(b);
//				System.out.println(temp);
				distinctElements.add(temp);
//				power = BigInteger.valueOf((long) a);
			}
		}
		return distinctElements.size();
	}
	
	
	public static BigInteger numberSpiralDiagonal(long length) {
		BigInteger firstDiagonal = new BigInteger("1"), temp1 = new BigInteger("0"), temp2 = new BigInteger("0"), increment = new BigInteger("2"), decrement = new BigInteger("6");
		for(long i=2;i<=length;i++) {
			if(i%2==0) {
				temp1 = temp1.add(BigInteger.valueOf(i*i).add(BigInteger.valueOf(1))); 
				firstDiagonal = firstDiagonal.add(temp1.add(temp1.add(increment)));
				increment = increment.add(BigInteger.valueOf(2));
				temp1 = BigInteger.ZERO;
			}else {
//				firstDiagonal = firstDiagonal + temp2 + (temp2-decrement);
				temp2 = temp2.add(BigInteger.valueOf(i*i)); 
				firstDiagonal = firstDiagonal.add(temp2.add(temp2.subtract(decrement)));
				decrement = decrement.add(BigInteger.valueOf(6));
				temp2 = BigInteger.ZERO;
			} 
		}
		return firstDiagonal;
	}
	
	
	
	public static void countingSundays() {
		int days[] = {31,0,31,30,31,30,31,31,30,31,30,31};
		int start = 6,sundayCount=0;
		// Start = 6 since 1 January, 1901 is Tuesday 
		for(int count=1901;count<=2000;count++) {
			if(isLeapYear(count)) {
				days[1]=29;
			}else {
				days[1]=28;
			}
			for(int month=0;month<=11;month++) {
				if(start==1) {
					sundayCount++;
				}
				start=performSundayOperation(start,days[month]);
			}
		}
		System.out.println(sundayCount);
	}
	
	public static int performSundayOperation(int s, int d) {
		while(s<=d) {
			s = s + 7;
		}
		return s-d;
	}
	
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0)  
	        return true;  
	  
	    if (year % 100 == 0)  
	        return false;  
	  
	    if (year % 4 == 0)  
	        return true;  
	    
	    return false; 
	}
	
	
	public static long nonAbundantSums() {
		long sum = 0;
		LinkedHashSet<Long> abundantList = abundantList();
		List<Long> list = new ArrayList<>();
		Iterator<Long> itr = abundantList.iterator();  
		while(itr.hasNext())  {
			list.add(itr.next());
        }  
		for(long startIter=1;startIter<=28123;startIter++) {
			if(!inAbundantList(startIter, abundantList, list)) {
				sum += startIter;
			}
		}
		return sum;
	}

	public static boolean inAbundantList(long number, LinkedHashSet<Long> hashset, List<Long> list) {
		for(int i=0;i<list.size();i++) {
			long first = list.get(i);
			long second = number - first;
			if(hashset.contains(second)) {
				return true;
			}
		}
		return false;
	}
	
	public static LinkedHashSet<Long> abundantList() {
		LinkedHashSet<Long> abundantList = new LinkedHashSet<>();
		for(long start=12;start<=28123;start++) {
			long sumOfDivisors = getDivisorSum(start);
			if(sumOfDivisors > start) {
				abundantList.add(start);
			}
		}
		return abundantList;
	}
	
	
	public static long amicableNumbers(long range) {
		long sum = 0;
		for(int start=4;start<10000;start++) {
			long dOfA = getDivisorSum(start);
			long dOfB = getDivisorSum(dOfA);
			if(start!=dOfA) {
				if(dOfB==start) {
					sum += start;
				}
			}
		}
		return sum;
	}
	
		
	public static long getDivisorSum(long num) {
		List<Long> sumList = new ArrayList<>();
		long sum = 0;
		sumList.add((long) 1);
		for(long i=2;i<=Math.sqrt(num);i++) {
			long contemporary = num/i;
			if(num%i==0) {
				sumList.add(i);
				if(contemporary!=i) {
					sumList.add(contemporary);
				}
			}
		}
		for(int start=0;start<sumList.size();start++) {
			sum += sumList.get(start);
		}
		return sum;
	}
	
	public static boolean isOdd(long num) {
		if(num%2!=0) {
			return true;
		}
		return false;
	}
	
	public static void thousandDigitFiboNacciNumber() {
		BigInteger first = BigInteger.ONE;
		BigInteger second = BigInteger.ONE;
		BigInteger sum = new BigInteger("0");
		int count = 2;
		while(true) {
			sum = first.add(second);
			count++;
			if(sum.toString().length()==1000) {
				break;
			}
			first = new BigInteger(second.toString());
			second = new BigInteger(sum.toString());
			sum = BigInteger.ZERO;
		}
		System.out.println(count);
	}
	
	public static void namesScores() throws IOException {
		BufferedReader wordReaderFromInputFile = new BufferedReader(new FileReader("C:\\Users\\dell\\Desktop\\p022_names.txt"));
		String wordInput[] = wordReaderFromInputFile.readLine().split(",");
     	Arrays.sort(wordInput);
     	BigInteger wordValue = new BigInteger("0");
     	BigInteger sumValue = new BigInteger("0");
     	long tempValue = 0;
     	for(int position=0;position<wordInput.length;position++) {
     		tempValue = calculateWordValue(wordInput[position].substring(1,wordInput[position].length()-1));
     		wordValue = BigInteger.valueOf(tempValue);
     		wordValue = wordValue.multiply(BigInteger.valueOf(position+1));
     		sumValue = sumValue.add(wordValue);
     	}
     	System.out.println(sumValue);
     	wordReaderFromInputFile.close();
	}
	
	public static void initializeWithAlphabets() {
		alphabetMap = new HashMap<>();
		for(int i=1;i<=26;i++) {
			Character alphabet = (char)(64+i);
			String value = alphabet+"";
			alphabetMap.put(value, i);
		}
	}
	
	public static long calculateWordValue(String word) {
		long sum = 0;
		for(int loop=0;loop<word.length();loop++) {
			sum = sum + alphabetMap.get(word.charAt(loop)+"");
		}
		return sum;
	}
	
	public static void getFactorial(int number) {
		BigInteger bg = new BigInteger("1");
		for(int start=1;start<=100;start++) {
			bg = bg.multiply(BigInteger.valueOf(start));
		}
		String factorialValue = bg.toString();
		long sum = 0;
		for(int i=0;i<factorialValue.length();i++) {
			sum = sum + Integer.parseInt(""+factorialValue.charAt(i));
		}
		System.out.println(sum);
	}
	
	public static int getCount(int number) {
		String temp = number+"";
		switch(temp.length()) {
			case 1:
				return ones[number].length();
			case 2:
				return getTwoDigitNumberCount(number);
			case 3:
				int index = number/100;
				if(temp.charAt(1)=='0' && temp.charAt(2)=='0') {
					return hundreds[index].length();
				}
				if(number%100>9) {
					return (hundreds[index]+"and").length() + getTwoDigitNumberCount(number%100);
				}else {
					return (hundreds[index]+"and").length() + ones[number%100].length() ;
				}
			case 4:
				return "onethousand".length();
		}
		return 0;
	}
	
	public static int getTwoDigitNumberCount(int input) {
		String temp = ""+input;
		if(temp.startsWith("1")) {
			if(input==10) {
				return tys[1].length();
			}
			return tens[input%10].length();
		}else if(temp.startsWith("2")) {
			if(input==20) {
				return tys[2].length();
			}
			return (tys[2]+ones[input%10]).length();
		}else if(temp.startsWith("3")) {
			if(input==30) {
				return tys[3].length();
			}
			return (tys[3]+ones[input%10]).length();
		}else if(temp.startsWith("4")) {
			if(input==40) {
				return tys[4].length();
			}
			return (tys[4]+ones[input%10]).length();
		}else if(temp.startsWith("5")) {
			if(input==50) {
				return tys[5].length();
			}
			return (tys[5]+ones[input%10]).length();
		}else if(temp.startsWith("6")) {
			if(input==60) {
				return tys[6].length();
			}
			return (tys[6]+ones[input%10]).length();
		}else if(temp.startsWith("7")) {
			if(input==70) {
				return tys[7].length();
			}
			return (tys[7]+ones[input%10]).length();
		}else if(temp.startsWith("8")) {
			if(input==80) {
				return tys[8].length();
			}
			return (tys[8]+ones[input%10]).length();
		}else if(temp.startsWith("9")) {
			if(input==90) {
				return tys[9].length();
			}
			return (tys[9]+ones[input%10]).length();
		}
		return 0;
	}
	
	
	public static long sumOfBigNumber(String input) {
		long returnSum = 0;
		for(int i=0;i<input.length();i++) {
			long digit = Integer.parseInt(""+input.charAt(i));
			returnSum+=digit;
		}
		return returnSum;
	}
	
	
	
	public static long getCollatz(long number) {
		long count = 0;
		while(number!=1){
			if(number%2==0) {
				number = number/2;
				count++;
			}else if(number%2!=0) {
				number = (3*number) + 1;
				count++;
			}
		}
		return count;
	}
	
	
	public static int getCountOfDigits(int num) {
		String s = "" + num;
		return s.length();
	}
	
	public static void storeInArray(int row, String input) {
		for(int i=0;i<50;i++) {
			String s = "" + input.charAt(i);
			arr[row][i] = Integer.parseInt(s);
		}
	}
	
	public static void sumOver() {
		int sumOfEachColumn,carry=0,i=49;
		for(int col=49;col>=0;col--) {
			sumOfEachColumn = 0;
			for(int row=0;row<=49;row++) {
				sumOfEachColumn = sumOfEachColumn + arr[row][col];
			}
			sumOfEachColumn += carry;
			carry = sumOfEachColumn/10;
			if(i!=0) {
				finalArray[i] = sumOfEachColumn%10;
			}else {
				finalArray[i] = sumOfEachColumn;
			}
//			System.out.println(i+" "+sumOfEachColumn+" "+carry+" "+finalArray[i]);
			i--;
		}
	}
		
	public static String getSumOfOneFiftyDigitNumber(String input) {
		String sum = "";
		long actualSum = 0;
		for(int i=0;i<input.length();i++) {
			String temp = "" + input.charAt(i);
			int number = Integer.parseInt(temp);
			actualSum += number;
		}
		sum+=sum;
		return sum;
	}

	public static int getNumberOfFactors(long number) {
		int count = 0;
		for(int i=1;i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				count+=2;
			}
		}
		return count;
	}
	
	
	public static long triangularNumber(int index) {
		tMatrix[index] = tMatrix[index-1]+index;
		return tMatrix[index];
	}
	
	public static long getMaxInMatrix(long a[][]) {
		long max = 0;
		for(int row=0;row<20;row++) {
			for(int col=0;col<20;col++) {
				long upProd = upProduct(a,row,col);
				long downProd = downProduct(a,row,col);
				long leftProd = leftProduct(a,row,col);
				long rightProd = rightProduct(a,row,col);
				long diagProd1 = diagonalLeftProduct(a,row,col);
				long diagProd2 = diagonalRightProduct(a,row,col);
				long diagProd3 = diagonalUpleftProduct(a,row,col);
				long diagProd4 = diagonalUpRightProduct(a,row,col);
//				if(upProd==70600674 || downProd==70600674 || diagProd1==70600674 || diagProd2==70600674 || diagProd3==70600674 || diagProd4==70600674 || rightProd==70600674 || leftProd==70600674) {
//					System.out.println(a[row][col]);
//				}
				max = Math.max(max, upProd);
				max = Math.max(max, downProd);
				max = Math.max(max, leftProd);
				max = Math.max(max, rightProd);
				max = Math.max(max, diagProd1);
				max = Math.max(max, diagProd2);
				max = Math.max(max, diagProd3);
				max = Math.max(max, diagProd4);
			}
		}
		return max;
	}
	
	public static long upProduct(long a[][], int r, int c) {
		if(r>=3) {
			long product = a[r][c]*a[r-1][c]*a[r-2][c]*a[r-3][c];
			return product;
		}
		return 0;
	}
	
	public static long downProduct(long a[][], int r, int c) {
		if(r<=16) {
			long product = a[r][c]*a[r+1][c]*a[r+2][c]*a[r+3][c];
			return product;
		}
		return 0;
	}
	
	public static long leftProduct(long a[][], int r, int c) {
		if(c>=3) {
			long product = a[r][c]*a[r][c-1]*a[r][c-2]*a[r][c-3];
			return product;
		}
		return 0;
	}

	public static long rightProduct(long a[][], int r, int c) {
		if(c<=16) {
			long product = a[r][c]*a[r][c+1]*a[r][c+2]*a[r][c+3];
			return product;
		}
		return 0;
	}
	
	public static long diagonalRightProduct(long a[][], int r, int c) {
		if(r<=16 && c<=16) {
			long product = a[r][c]*a[r+1][c+1]*a[r+2][c+2]*a[r+3][c+3];
			return product;
		}
		return 0;
	}
	
	public static long diagonalLeftProduct(long a[][], int r, int c) {
		if(r<=16 && c>=3) {
			long product = a[r][c]*a[r+1][c-1]*a[r+2][c-2]*a[r+3][c-3];
			return product;
		}
		return 0;
	}
	
	public static long diagonalUpRightProduct(long a[][], int r, int c) {
		if(r>=4 && c<=16) {
			long product = a[r][c]*a[r-1][c+1]*a[r-2][c+2]*a[r-3][c+3];
			return product;
		}
		return 0;
	}
	
	public static long diagonalUpleftProduct(long a[][], int r, int c) {
		if(r>=3 && c>=3) {
			long product = a[r][c]*a[r-1][c-1]*a[r-2][c-2]*a[r-3][c-3];
			return product;
		}
		return 0;
	}
	
	
}
