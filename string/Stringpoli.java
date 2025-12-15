/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author HP
 */
public class Stringpoli 
{
    public static void main(String []args)
    {
        String str="JaJ";
        String reverse="";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
           reverse = reverse+str.charAt(i);
        }
        if(str.equals(reverse))
        {
            System.out.println("It is Polindrome");
        }
        else
         {
            System.out.println("It is not a Polindrome");
        }   
    }
    
}
