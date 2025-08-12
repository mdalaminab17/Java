import java.util.Scanner;

public class evenodd {
    private void myFunction(int a){
        if(a%2==0){
            System.out.println(a + " is an Even Number");
        }else{
            System.out.println(a + " is an Odd Number");
        }
    }
    private int input(){
        int a;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        a = in.nextInt();

        return a;
    }

    public evenodd(){
        myFunction(input());
    }
}
