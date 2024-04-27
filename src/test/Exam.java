package test;

import java.util.Arrays;

public class Exam {

	public static void main(String[] args) {
		
		int nums[] = {1,3,5,6}; int target = 7;
		int low = 0, high=nums.length-1;
	while(low<high) {
		int mid = (low+high)/2;
			if(nums[mid] == target) System.out.println(mid);
			else if (nums[mid] > target) high = mid-1;
			else low = mid+1;
		}	
		
//		int[] arr = {1,0,0,0,1};
//		int n=1;
//		int count = 0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] == 0) {
//				boolean l = (i==0) || arr[i-1] == 0;
//				boolean r = (i == arr.length - 1) || (arr[i+1] == 0);
//				if(l && r) {
//					arr[i] = 1;
//					count++;
//				}
//						
//			} 
//		}
//		System.out.println(count >= n);
		
		
//		int num = 5;
//		int[] f = new int[num+1];
//		for(int i=1; i<=num; i++)f[i] = f[i>>1] + (i & 1);
//		for(int i = 0; i< f.length; i++) {
//			System.out.println(f[i]);
//		}
		
		
//		int arr[] = {3,1,7,11};
//		Arrays.sort(arr);
//		for(int i=0; i<arr.length; i++) {
//			int target = 2 * arr[i];
//			int lo = 0, hi = arr.length-1;
//			while(lo<=hi) {
//				int mid = lo + (hi-lo)/2;
//				if(arr[mid] == target && mid!= i) System.out.println("true");
//				if(arr[mid] < target) lo = mid+1;
//				else hi = mid-1;
//			}
//			System.out.println("false");
//		}
		
		
//		int num[] = {0,2,1,5,3,4};
//		int[] ans = new int[num.length];
//		for(int i=0; i<num.length; i++) {
//			ans[i] = num[num[i]];
//		}
//		for(int i=0; i<ans.length; i++) {
//			System.out.println(ans[i]);
//		}
//		
		
		
		
//		String st1 = "aA";
//		String st2 = "aAAbbbb";
//		
//		int num = 0;
//		for(int i = 0; i<st2.length() ; i++)
//		{
//			if(st1.indexOf(st2.charAt(i)) != -1) num++;
//		}		
//		System.out.println(num);
		
		
//		int arr[] = {0,3,2,1};
//		int l = 0;
//		int r = arr.length-1;
//		while(l+1 < arr.length - 1 && arr[l] < arr[l+1]) l++;
//		while(r-1 > 0 && arr[r] < arr[r-1]) r--;
//		 System.out.println(l==r);
		
		
		
		
//		int[] num = {6,5,4,8};
//		int[] temp = new int[101];
//		for(int i = 0; i<num.length; i++) temp[num[i]] +=1;
//
//		for(int j = 0; j<=100; j++) temp[j] += temp[j-1];
//
//		for(int i = 0; i<num.length; i++) { 
//			int pos = num[i];
//			num[i] = pos == 0 ? 0 : temp[pos-1];
//			}
//		System.out.println(num);
	}

}
