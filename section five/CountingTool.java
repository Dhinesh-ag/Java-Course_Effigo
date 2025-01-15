import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice=scan.nextInt();
        for(int i=0;i<=choice;i++)
        {
            System.out.print(i+ " ");
        }
        // See Learn the Part for the instructions.

        scan.close();
    }
}
