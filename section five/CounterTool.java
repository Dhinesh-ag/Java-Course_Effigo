import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");
        for(int i=6;i<=66;i=i+3)
        {
            System.out.print(i+" ");
        }


        scan.close();
    }
}
