/*
    Name : Aswani Darsh.
    ID   : 21CE006.
    Pr   : Write a program that raises two exceptions. Specify two ‘catch’ clauses for the 
    two exceptions. Each ‘catch’ block handles a different type of exception. For 
    example the exception could be ‘ArithmeticException’ and 
    ‘ArrayIndexOutOfBoundsException’. Display a message in the ‘finally’ block.

*/
public class _006_4_3 {
    public static void main(String[] args) {
        int a[] = new int[5];
        String ptr = null;
        try
        {
            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(Exception e)
        {
            System.out.println("NullPointerException Caught");
        }
        try {
            System.out.println(a[10]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }  
        try{
            a[4]=30/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        }
        
        finally{
            System.out.println("rest of the code");
        }
    }
}
