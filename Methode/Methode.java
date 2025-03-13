public class Methode
{
    public static void main(String []args)
    {
    
      String message = "Hello"
      message = say("Hello !");
      System.out.println(message);
       }
    // 
    public static String say(String msg)
    {
     System.out.println(msg);
     msg = "world !";
     return msg;
    }
}