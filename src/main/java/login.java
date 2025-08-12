import java.util.Scanner;

public class login {
    private String username = "alamin";
    private String password = "alamin1234";

    public login(){
        String user; String pass;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username: ");
        user = input.nextLine();
        System.out.println("Enter Password");
        pass = input.nextLine();

        if(username.equals(user) && password.equals(pass)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid credentials");
        }
    }
}
