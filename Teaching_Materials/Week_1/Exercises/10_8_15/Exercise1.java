public class Exercise1
{
   public static void main(String [] args)
   {
   int a = -3;
   System.out.println(((7+(6*4))/(8-(3%2))+ ((17-(4/3))/(6+(3*2)))/(8-(7%4))));
   
   System.out.println( (((7+6*4)/(8-3%2)) + ((17-4/3)/(6+3*2))) / (8-7%4));
   
   System.out.println(7 + 6/4 - 3*7%2 + 5/2);
   System.out.println( 6 + 3/2.0 - 6/4 + 8%10);
   System.out.println( 6 + 4/2.0 - 6/4 + 8%10);
   String s = "abc";
   String t = 6 - 8 % 3 + s + "\n" + -a + 7 / 4;
   System.out.println(t);
  //  t = 6 - 8 % 3 + s + "\n" + -a + 7 / 4;
  //  t = s * 3
  // The only string operator is + 
  
  double inches = 10.0;
  System.out.println(inches + " inches is equal to " + 2.54 * inches + " centimeters");
  
  //constants
  final int MAXIMUM_DAMAGE = 1000000;
   }
}