public class SoftwareRegistry
{
/* [Accesseurs]
getters: accées à un attribut (lecture)
setters : modification d'un attribut   */

public SoftwareRegistry(int expiration)
{
    if(mNumberOfRegistrations > 0)
    {
     this.mExpirationYear = expiration;
     mNumberOfRegistrations--;

     System.out.println("Logiciel valide (expiration :" + this.mExpirationYear + ")");
    
     System.out.println("Enregistrements restants : " + this.mNumberOfRegistrations + ")");

    }
   else {
  System.out.println("Maximum de validatins effectues !");
   }
  
}
private int getExpirationYear()
{
    return this.mExpirationYear;
}
public static int getNumberOfRegistrations()
{
    return mNumberOfRegistrations.
}
private static int mNumberOfRegistrations = 2;
private int mExpirationYear;
}