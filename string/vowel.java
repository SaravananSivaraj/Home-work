/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class vowel 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int vowelCount = 0;
        input = input.toLowerCase(); 

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
    }
}
    

