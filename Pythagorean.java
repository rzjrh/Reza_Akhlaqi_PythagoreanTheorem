/*
This class in not the main class
 */
package pythagoreantheorem;

//we need to import java.lang.math first and befor the public class

public class Pythagorean {

    
private int LegA;
private int LegB;

public int getLegA() {
    return LegA;
}
public void setLegA (int LegA){
    this.LegA= LegA;
}
public int getLegB() {
    return LegB;
}
public void setLegB (int LegB){
    this.LegB= LegB;
}

//double LegC= (LegA*LegA+LegB*LegB);
//double squareroot = Math.sqrt(LegC);
public void PrintOutput ()
{
    System.out.println("your Heyp is"+ (Math.sqrt((LegA*LegA)+(LegB*LegB))) );
}

    
}