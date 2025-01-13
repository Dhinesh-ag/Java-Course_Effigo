public class Return {
  public static void main(String[] args) {
    System.out.println(areaOfRectangle(10, 15));
    System.out.println(areaOfRectangle(20, 30));
    System.out.println(areaOfRectangle(30, 20));   
    System.out.println(explainArea("English"));
    System.out.println(explainArea("Spanish"));
    System.out.println(explainArea("French"));
  }
  public static int areaOfRectangle(int length, int width)
  {
    if(length<0||width<0)
    {
      System.out.println("INVALID DIMENSIONS");
    }
    int area=length*width;
    return area;
  }
  public static String explainArea(String language)
  {
    switch (language) {
      case "English":return "Area equals length * width";
      case "French":return "La surface est egale a la longueur * la largeur";
      case "Spanish":return "area es igual a largo * ancho";
      default: return "Language not available";
     
    }
  }
  
}
