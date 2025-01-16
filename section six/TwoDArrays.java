import java.util.Arrays;

public class TwoDArrays 
{
  public static void main(String[] args) 
  {
    // int [][] grades=new int[3][4];
    // grades[0][0]=72;
    // grades[0][1]=74;
    // grades[0][2]=78;
    // grades[0][3]=76;

    int[][]grades={{72,74,78,76},{65,64,61,67},{95,98,99,100}};

    System.out.println("\tHarry: "+ Arrays.toString(grades[0]));
    System.out.println("\tRon: "+ Arrays.toString(grades[1]));
    System.out.println("\tHermione: "+ Arrays.toString(grades[2]));   
    
  }
  
}
