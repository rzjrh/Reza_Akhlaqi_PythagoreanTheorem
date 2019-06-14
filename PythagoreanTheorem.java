

// in this sample I tried to be more advance and ask the user to input for each leg
//import java.util.Scanner for input data
//import java.lang.Math for the mathematic calculation

package pythagoreantheorem;
import java.util.Scanner;

public class PythagoreanTheorem {

    public static void main(String[] args) {



Pythagorean object = new Pythagorean ();

Scanner sc = new Scanner (System.in);
while (true)
{
    System.out.println("Please enter the Leg A");
    object.setLegA (sc.nextInt());
    
    System.out.println("Please enter the Leg B");
    object.setLegB (sc.nextInt());
    
object.PrintOutput();
sc.close();
}
    }
  
}
