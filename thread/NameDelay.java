/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author HP
 */
public class NameDelay
{
   public static void main(String[] args)
   {
        try 
        {
            System.out.println("DIWAKAR");
            Thread.sleep(2000);

            System.out.println("KARTHIK");
            Thread.sleep(2000);

            System.out.println("RAJESH");
            Thread.sleep(2000);

            System.out.println("SATHISH");
            Thread.sleep(2000);

            System.out.println("SURYA");
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Thread interrupted");
        }
    }   
}
