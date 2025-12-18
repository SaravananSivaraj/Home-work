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
public class LetterDelay 
{
public static void main(String[] args) 
{
        String[] lines = {
            "HAI",
            "HAI SIR HOW CAN I HELP YOU",
            "CAN YOU TELL ME ABOUT JAVA",
            "SURE, JAVA IS AN PROGRAMMING",
            "LANGUAGE WHICH IS USED FOR DEVELOP",
            "APPLICATIONS WITH PLATFORM",
            "INDEPENDENT"
        };

        try 
        {
            for (String line : lines) 
            {
                for (int i = 0; i < line.length(); i++) 
                {
                    System.out.print(line.charAt(i));
                    Thread.sleep(300); 
                }
                System.out.println(); 
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Thread interrupted");
        }
    }    
}
