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
public class BMI 
{
    float height;
    float weight;
    float bmi;
  BMI(float height,float weight)//m,kg
  {
    this.height=height;
    this.weight=weight;
    this.bmi=weight/(height*height);
  }
  void print()
  {
      System.out.println("BMI is;="+bmi);
  }
}
