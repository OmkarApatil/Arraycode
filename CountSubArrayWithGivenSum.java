/*
8. Count the Number of Subarrays with a Given Sum
Problem: Given an array of integers and a sum S, find the number of subarrays whose sum equals S.
Example:
arr = [1, 1, 1, 1, 1], S = 3
Output: 3 (subarrays are [1, 1, 1], [1, 1, 1], [1, 1, 1])
*/
import java.util.*;
class CountSubArrayWithGivenSum{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in  array");
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		 System.out.println("Enter the sum ");
		 int s=sc.nextInt();
		 CountOfSubArray(a, s);
		 //System.out.println("total count of sub arrays is : " + res);
	}
	public static void CountOfSubArray(int a[], int s){
		int total=0; int k=0;
		for(int i=0; i<a.length; i++){
			int sum=a[i];
			boolean flag=false;
			for(int j=i+1; j<a.length; j++)
			{
				sum=sum+a[j];
				if(sum==s){
					k=j;
					total++;
					flag=true;
					break;
				}
			}
			if(flag){
			for(int m=i; m<=k; m++){
			System.out.print(a[m]+ " ");
			}
			System.out.println();
			}
		
		}
		System.out.println();
		System.out.println("total count of sub arrays is : " + total);
		
		
		
	}
}