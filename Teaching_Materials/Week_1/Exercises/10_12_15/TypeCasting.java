public class TypeCasting
{
   public static void main(String [] args)
   {
     //syntax:
     //(type)(expression)
     //put a wide value in a narrow box
     double d = 4.3;
     int x = (int)d;
     byte a = 1;
     byte b = 2;
     short c =(short)(a+b);
     c = 129;
     a = (byte)c;
     
     //make a type wider to store more information,
     //typically, fractional parts of answer.
     
     int sum = 6834;
     int count = 13;
     double average = sum / count;
     average = (double)sum / count;
   }
}