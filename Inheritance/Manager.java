/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Saravanan Sivaraj
 */
public class Manager extends MainEmployee
{
String name;
Manager (String name)
{
    this.name=name;
}
void managerName()
{
    System.out.println(name+ "   is a Manager");  
}       
}
