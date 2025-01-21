class Main
{
  public static void main(String[] args)
  {
    Car nissan=new Car("Nissan","Green",100.03,10000, );
    Car nissan2 = new Car(nissan);

    nissan2.setColor("Yellow");
    nissan.setColor("Orange");
    nissan2.setColor("Blue");
    nissan.setColor("Purple");
    nissan2.setColor("Fuchsia");
    nissan.setColor("Beige");

    Car dodge=new Car("Dodge", "Pink",102.3,20000 );
    System.out.println("This " + nissan.make + " is worth $" + nissan.price + 
    ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
    System.out.println("This " + dodge.make + " is worth $" + dodge.price + 
    ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");
  }
} 