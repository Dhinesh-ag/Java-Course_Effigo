import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to JavaGram! Let's sign you up.");

        System.out.println("What is your first name?");
        String fName=scan.nextLine();
        
        System.out.println("What is your last name?");
        String Lname=scan.nextLine();
        System.out.println("How old are you?");
        int Age=scan.nextInt();
        scan.nextLine();
        System.out.println("Make a username");  
        String Uname=scan.nextLine();
        System.out.println("What city do you live in?");
        String city=scan.nextLine();
        System.out.println("What country is that?");
        String country=scan.nextLine();
        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: "+fName);
        System.out.println("\tLast Name: "+ Lname);
        System.out.println("\tAge: "+ Age);
        System.out.println("\tUsername: "+Uname);
        System.out.println("\tCity: "+city);
        System.out.println("\tCountry: "+country);

        scan.close();
    }
}
