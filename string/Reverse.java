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
public class Reverse 
{
    public static void main(String [] args)
    {
        String str="Java";
        String reverse="";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
           reverse = reverse+str.charAt(i);
        }
        System.out.println(reverse);
    } 
}
