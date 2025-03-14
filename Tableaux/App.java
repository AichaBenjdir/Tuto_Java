
/* Objects: equals, toString*/ 
import java.util.Array;  
public class App 
{

  public static void main(String []args)
  {
       int[] tab = new int[]; 
       Array.fill(tab, 15);

       for(int e1 : tab)
          System.out.println(e1);

  }
}