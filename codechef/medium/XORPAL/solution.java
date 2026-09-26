import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    String s=sc.next();
		    int zeros=0;
		    int ones=0;
		    for(char ch:s.toCharArray()){
		        if(ch=='0')
		           zeros++;
		        else
		           ones++;
		    }
		    if(N%2==1){
		        System.out.println("YES");
		        
		    }
		    else if(zeros==ones || (zeros%2==0 && ones%2==0)){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    
		}
		sc.close();
	}
}
