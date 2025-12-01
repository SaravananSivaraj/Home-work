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
public class Discount 
{
  int original;
  int disc;
  int finalprice;
  
  Discount(int original,int disc)
  {
      this.disc=disc;
      this.original=original;
      this.finalprice=original*disc/100;
  }
  void printFinalPrice()
  {
      System.out.println("Final price is:"+finalprice);
  }
}
