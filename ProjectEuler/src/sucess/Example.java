package sucess;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Example
{
	public static void main (String[] args) 
	{
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] s1=s.split(" ");
    ArrayList<String> a=new ArrayList();
    for(int i=0;i<s1.length;i++){
        String word=s1[i];
        char[] c=word.toCharArray();
        Arrays.sort(c);
        String h=c.toString();
        a.add(h);
    }
    ArrayList<Integer> display=new ArrayList<Integer>();
   for(int i=0;i<a.size();i++){
       String y=a.get(i);
       for(int k=0;k<a.size();k++){
           if(y==a.get(k)){
               display.add(k);
           }
       }
       
   }
   System.out.println(display);
    //String
//    sc.close();
	}
}



