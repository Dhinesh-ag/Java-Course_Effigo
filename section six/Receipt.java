// public class Receipt {
//     public static void main(String[] args) {


//         System.out.println("Here's your receipt:\n");
//         String Apples[]={"Gala", "Granny Smith", "Macintosh"};
//         double Prices[]={1.99, 1.49, 1.29};
//         for(int i=0;i<Apples.length;i++)
//         {
//             for(int j=0;j<Prices.length;j++)
//             {
//                 System.out.println(Apples[i]+ " : "+ Prices[j]);
//             }
//         }

//         // System.out.println("\t<apple i >: $<price i >"); // to be used in for loop.
//     }
// }
import java.util.Arrays;

public class Receipt {
    public static void main(String[] args) {
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] price = {1.99, 1.49, 1.29};

        System.out.println("Here's your receipt:\n");
        for (int i = 0; i < apples.length; i++) {
            System.out.println("\t" + apples[i] + ": $" + price[i]); 
        }

    }
}