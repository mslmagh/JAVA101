import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName = " ";
        String password = " ";
        System.out.print("Please enter your username: ");
        userName = inp.nextLine();
        System.out.print("Please enter your password: ");
        password = inp.nextLine();
        if (userName.equals("Muslum") && password.equals("Java101"))
            System.out.println("Logged in");
        else
            System.out.println("Logged in incorredctly");
    }

}