import java.util.Scanner;

public class largest {
    public largest(){
        Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.print("Enter Three Numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("A is Largest Number");
            }else{
                System.out.println("C is Largest Number");
            }
        }
        else if(b>a){
            if(b>c){
                System.out.println("B is Largest Number");
            }else{
                System.out.println("C is Largest Number");
            }
        }else{
            System.out.println("Three numbers are Equal");
        }

    }
}
