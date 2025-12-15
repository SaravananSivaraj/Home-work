/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author Saravanan Sivaraj
 */
public class Age 
{
  int age;
  int year;
  Age(int year)
  {
      this.year=year;
      age=2025-year;
  }
  void showAge()
  {
      System.out.println("Age is"+age);
  }
}
