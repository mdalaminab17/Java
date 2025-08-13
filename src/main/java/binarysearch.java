import java.util.Scanner;

public class binarysearch{
	public int search(int nums[], int target, int n){
		int st = 0;
		int end = n-1;
		
		while(st <= end){
			int mid = st + (end - st) / 2;
			
			if(nums[mid] == target){
				return mid;
			}else if(nums[mid]> target){
				end = mid - 1;
			}else{
				st = mid + 1;
			}
			
		} return -1;
	}
	
	public void input(){
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Enter Array Size: ");
		n = in.nextInt();
		
		int a[] = new int[n];
		
		System.out.print("Enter Array Elements: ");
		for(int i =0; i<n; i++){
			a[i] = in.nextInt();
		}
		
		System.out.print("Enter Target: ");
		int t = in.nextInt();
		
		int result = search(a,t,n);
		if(result != -1){
			System.out.print("Target Found at index " + result);
		}else{
			System.out.print("Not Found");
		}
	}
	
	public binarysearch(){
		input();
	}
	
	
}