public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
        if(wallet>toyCar)
        {
            System.out.println("Yes you can buy the car");
        }
        else{
            System.out.println("You can't buy the car insuffient balance");
        }
        wallet-=toyCar;
        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
        if(wallet>nike)
        {
            System.out.println("YEs you can get it");
        }
        else
        {
            System.out.println("No insuffient balance "+ wallet);
        }
    }
}
