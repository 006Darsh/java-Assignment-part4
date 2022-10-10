// package Practicle_file;
/*
    Name : Aswani Darsh.
    ID   : 21CE006.
    Pr   : Write a program to generate user defined exception using “throw” and “throws” keyword.
*/
import java.util.*;
class Myexception extends Exception{
    public Myexception(String s)
    {
        super(s);
    }
}
public class _006_4_2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int b = 300;
        System.out.println("Enter amount to be deposited  :");
        int d = s.nextInt();
        b+=d;
        boolean f =true;
        while(f)
        {
            System.out.println("Enter Amount to be withdrawn");
            int w = s.nextInt();
            if(b>w){
                b-=w;
                System.out.println("Your Money has been successfully withdrawn!....");
                System.out.println("Balance of your account : "+b);
            }
            else{
                f=false;
                try{
                    throw new Myexception("Not Sufficient funds");
                }
                catch(Myexception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
