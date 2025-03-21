import java.util.*; 

public class App
{

  public static void main(String []args)
  {
     
     Scanner sc = new Scanner(System.in);
   try{
    System.out.print("Annee de naissance :");
    int yearOfBirth = sc.nextInt();
    System.out.print("yearOfBirth");
   
   }
   catch(InputMismatchException e)
   {
    System.out.println("La date de naissance est incorretce.");
      }

catch(Exception e)
{

}
//   Scanner sc = new Scanner(System.in);
//   System.out.print("Annee de naissance : ");
//   int yearOfBirth = sc.nextInt();
//   System.out.print("yearOfBirth");
  }
}