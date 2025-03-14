public class App
{
  public static void main(String[] args)
    {
 System.out.println("ENREGISTREMENTS : " + SoftwareRegistry.getNumberOfRegistrations());


   SoftwareRegistry sr = new SoftwareRegistry(2025);
  System.out.println("ENREGISTREMENTS : " + SoftwareRegistry.getNumberOfRegistrations());

SoftwareRegistry sr2 = new SoftwareRegistry(2025);
System.out.println("ENREGISTREMENTS : " + SoftwareRegistry.getNumberOfRegistrations());


SoftwareRegistry sr3 = new SoftwareRegistry(2025);
System.out.println("ENREGISTREMENTS : " + SoftwareRegistry.getNumberOfRegistrations());
    }
    

}