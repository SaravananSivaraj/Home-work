/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Saravanan Sivaraj
 */
public class SmartLightControl
{
    public static void main(String[] args)
    {
      SmartBulb sb=new SmartBulb();
      SmartFan sf=new SmartFan();
      
      sb.turnOn();
      sf.turnOn();   
    }
  
}
