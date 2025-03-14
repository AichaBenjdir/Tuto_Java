public class SoftwareRegistry
{
/* [Accesseurs]
getters: accées à un attribut (lecture)
setters : modification d'un attribut   */

public SoftwareRegistry(int expiration)
{
    this.mExpirationYear = expiration;
    System.out.println("Enregistrement du produit, valide jusqu'en " + this.mExpirationYear);
}
private int mExpirationYear;
}