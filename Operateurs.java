/* 

[Notes]
= Affectation
+ Concatination

+ - *  / %  ()
== === != < <= > >=
+= -= *= /= %= ------> A = A + x 
                       A += x

                       A = A-x 
                       A -= x 

 A++ post-incrémentatin  A = (A + 1  )
++A  pré-incrémentation 
 A-- post-décreméntation
 --A pré-décrémentation
*/


public class Operateurs
{
    public static void main(String[] args)
    {

// int age = 24;  
// System.out.println("Tu as " + age +  " ans"); 
//  int resultat = 5 % 2; 
//  System.out.println(resultat); 




// int number = 4; 
// int result = number; 
// System.out.println(result); 

// boolean myvar = true; 
// System.out.println(myvar);




// int experience = 0; 
// System.out.println(experience);

//  experience = 10; 
// System.out.println(experience);

//  experience = 100; 
// System.out.println(experience);



int nb1 = 1;
int nb2 = nb1++;  //nb2 = nb1 puis nb1 += 1
int nb2 = ++nb1;  // nb1 += 1 puis nb2 = nb1
System.out.println(nb1); 
System.out.println(nb2);
    }
}