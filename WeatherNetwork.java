public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 25;  

        String forecast = "forecast";
        if(temp<=-1)
        {
           System.out.println("The forecast is freezing");
        }
        else if(temp<=10)
        {
            System.out.println("The forecast is chilly");
        }
        else
        {
            System.out.println("its warm go outside and play");
        }        //IF - ELSE IF - ELSE STATEMENTS HERE!
        
        
        System.out.println(forecast);
    }
}
