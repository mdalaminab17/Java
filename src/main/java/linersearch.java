import java.util.Scanner;

public class linersearch {
    private void search(int nums[],int target, int n){
        for(int i=0; i<n; i++){
            if(nums[i] == target){
                System.out.print("Target " + nums[i] + " Found at index " +i);
            }
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

        System.out.print("Enter Target: ");
        int t = in.nextInt();

        search(a,t,n);
    }

    public linersearch(){
        input();
    }
}
