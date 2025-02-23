/*7. Subarrays with K Different Integers
Problem: Given an array of integers, find the number of subarrays that contain exactly K distinct integers.
Example:
arr = [1, 2, 1, 2, 3], K = 2
Output: 7 (subarrays are [1, 2], [2, 1], [1, 2, 1], etc.)
*/

import java.util.*;
public class SubarrayswithKDifferentIntegers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array Size");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the no of distinct intergers");
		int k=sc.nextInt();
		subArray(a, k);
		
	}
	public static void subArrays(int a[], int k){
		
	}
}  // 1  2     2  1    1  3    2   3    1  2  1     1  2  3    2  1  2    