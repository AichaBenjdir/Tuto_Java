/* 

== égal à
=== égal et de méme type que 
!= différent de 
<  strictement inféreur à
<= inférieur ou égal à 
>  strictement supérieur à 
>=  supérieur ou égal à
!   inverse de (négation)
&&  Et 
||  OU 
*/


public class Conditions
{
    public static void main(String[] args)
    {
 
//  boolean value = (24  == 24); 

//  System.out.println(value); 



// int value = 16; 
//  if(value == 24  || value == 16) 

//   System.out.println("oui !");

//   else 
//   System.out.println("value ne vaut ni 24 ni 16");
    
    
    // 
    

  String choice = "yes"; 
    switch(choice)
    {
        case "y": /* if(choice == "y") */
            System.out.println("OUI"); 
            break; 
        
        case "n": 
           /* if (choice == "n") */
               System.out.println("NON"); 
                break; 

        default: 
        /* choice != "y" && choice != "n" */
            System.out.println("Ni oui ni non"); 
             break; 
    }
    
    }

}