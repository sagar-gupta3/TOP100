//Decimal to Hexadecimal
public class Main 
{
  
 
 
public static void main (String[]args) 
  {
    
 
 
int decimal = 1457;
    
 
 
convert (decimal);
  
 
 
} 
 
static void convert (int num) 
  {
    
 
 
			// creating a char array to store hexadecimal equivalent
    char[] hexa = new char[100];
    
 
      // using i to store hexadecimal bit at given array position
    int i = 0;
    
while (num != 0)
      
      {
    
int rem = 0;
  
 
 
rem = num % 16;
   
 
       // check if rem < 10 : Digits : 0 - 9
          // ascii 0 : 48
        if (rem < 10)
          {
        hexa[i] = (char) (rem + 48);
           i++;
         }                    
         // else positional values : A - F 
         // rem value will be > 10, adding 55 will result : A - F 
        // ascii A : 65, B : 66 ..... F : 70 
      else
     
       {
        
hexa[i] = (char) (rem + 55);
          
i++;
        
} 
num = num / 16;
      
} 
// printing hexadecimal array in reverse order
      System.out.println ("Hexadecimal:");
    
for (int j = i - 1; j >= 0; j--)
      
System.out.print (hexa[j]);

} 
 
}