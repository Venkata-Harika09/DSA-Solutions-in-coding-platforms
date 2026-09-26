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
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		       arr[i]=sc.nextInt();
		    }
		    k=k%n;
		    StringBuilder sb=new StringBuilder();
		    for(int i=k;i<n;i++){
		        sb.append(arr[i]).append(" ");
		    }
		    for(int i=0;i<k;i++){
		        sb.append(arr[i]).append(" ");
		    }
		    System.out.println(sb.toString().trim());
		}
		sc.close();
	}
}
