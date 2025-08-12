import java.util.Scanner;

public class leapyear {
    public leapyear(){
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Enter Year: ");
        year = input.nextInt();

        if(year % 4 == 0 ){
             System.out.println(year + " is Leap Year");
        }else if(year % 100 != 0){
            System.out.println(year + " is not Leap Year");
        }
        else if(year % 400 == 0){
             System.out.println(year + " is Leap Year");
        }else{
            System.out.println(year + " is not Leap Year");
        }
    }
}
