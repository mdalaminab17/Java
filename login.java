public class login {
    private String username = "alamin";
    private String password = "alamin1234";

    public login(String user, String pass){
        if(username.equals(user) && password.equals(pass)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid User or Pass! \nPlease try again.");
        }
    }
}
