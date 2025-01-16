import java.util.Arrays;

public class UpdatingArrays {
  public static void main(String[] args) 
  {
     String[]menu={"Expersso", "ICed coffee", "Macchiato"};
     menu[2]="Latte";
     String menuString=Arrays.toString(menu);
    System.out.println(menuString);
    String[] newMenu=new String[5];
    for(int i=0;i<menu.length;i++)
    {
      newMenu[i]=menu[i];
      // System.out.println(i+ ". "+newMenu[i]);
    }
    newMenu[3]="House";
    newMenu[4]="club";
    System.out.println(Arrays.toString(newMenu));
  }
  
}
