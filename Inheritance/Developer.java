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
public class Developer extends MainEmployee
{
 String name;
 Developer(String name)
 {
     this.name=name;
 }
 void developerName()
 {
     System.out.println(name+"    is a Developer");
 }
}
