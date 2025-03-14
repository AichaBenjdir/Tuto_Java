public class App
{
    /*
    String : immuable (contenu non modifiable)
      > contact() -> plus rapide que (+)
      > length()
      > toUpperCase(), toLowerCase(), trim(), replace(<old>, <new>)
      > charAt(<index>)
      > substring(<index>, <nb>
      > equals(<str>), compareTo(<str>)
    */
  public static void main(String[] args)
    {
        String s ="A"; //65
        String s2 = "a"; //97
      
        System.out.println(s.compareTo(s2));
     }

}