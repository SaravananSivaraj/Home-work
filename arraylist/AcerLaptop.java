/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;



public class AcerLaptop 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        ArrayList<Acer> laptops = new ArrayList<>();

        while (true) 
        {
            System.out.println("1 for Entry 2 for search");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) 
            {
                System.out.println("Enter the model of laptop");
                String model = sc.nextLine();

                System.out.println("Color of the laptop");
                String color = sc.nextLine();

                System.out.println("Its is rgb keyboard (True/ false)");
                boolean rgbKeyboard = sc.nextBoolean();
                sc.nextLine();

                System.out.println("Processor");
                String processor = sc.nextLine();

                System.out.println("Price");
                int price = sc.nextInt();

                laptops.add(new Acer(model, color, rgbKeyboard, processor, price));
            }

            else if (choice == 2) 
            {
                System.out.println("Enter the laptop name");
                String searchModel = sc.nextLine();

                boolean found = false;

                for (Acer a : laptops)
                {
                    if (a.model.equalsIgnoreCase(searchModel)) 
                    {
                        System.out.println("Laptop name :" + a.model);
                        System.out.println("Color of the laptop : " + a.color);
                        System.out.println("It is rgb keyboard: " + a.rgbKeyboard);
                        System.out.println("Processor : " + a.processor);
                        System.out.println("Price of the Laptop :" + a.price);
                        found = true;
                        break;
                    }
                }

                if (!found) 
                {
                    System.out.println("Laptop not found");
                }
                break;
            }

            else 
            {
                System.out.println("Invalid choice");
            }
        }
       
    }
}


