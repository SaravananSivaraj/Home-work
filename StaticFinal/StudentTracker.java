package StaticFinal;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class StudentTracker 
{
    public static void main(String[] args) 
    {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student 1 Name: ");
        Student s1 = new Student(sc.nextLine());

        System.out.print("Enter Student 2 Name: ");
        Student s2 = new Student(sc.nextLine());

        System.out.print("Enter Student 3 Name: ");
        Student s3 = new Student(sc.nextLine());

       
        System.out.println("\nBefore Changing School Name:");
        s1.display();
        s2.display();
        s3.display();

        
        Student.changeSchoolName("XYZ");

     
        System.out.println("After Changing School Name:");
        s1.display();
        s2.display();
        s3.display();
       
    }
    
}
