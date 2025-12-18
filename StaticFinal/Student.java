package StaticFinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Student 
{
    static String schoolName = "ABC";
    String studentName;

    
    Student(String name) 
    {
        studentName = name;
    }

  
    static void changeSchoolName(String name) 
    {
        schoolName = name;
    }

    
    void display() 
    {
        System.out.println("Student Name : " + studentName);
        System.out.println("School Name  : " + schoolName);
        System.out.println();
    }
}
