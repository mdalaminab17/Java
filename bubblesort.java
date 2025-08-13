import java.util.Scanner;

public class bubblesort {
    private void sort(int nums[], int n){
       
        for(int i = 0; i<n-1; i++){
            boolean f = false;
            for(int j=0; j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp ;
                        temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                        f = true;
                }
            }
        }

        for(int i=0; i<n;i++){
            System.out.print(nums[i] +" ");
        }
        
    }
    
 private void input(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter array Size: ");
        int n = in.nextInt();
        
        int a[] = new int[n];
        //n = a.length;
        System.out.print("Enter array Elements: ");
        for(int i=0; i<n;i++){
        a[i] = in.nextInt();
        }

        sort(a,n);
      
       
    }

    public bubblesort(){
        input();
    }
    
}
