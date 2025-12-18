/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticFinal;

/**
 *
 * @author HP
 */
public class BankAccount 
{
     final int accountNumber;

    BankAccount(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    void display()
    {
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args)
    {
        BankAccount b = new BankAccount(1265687);
        b.display();
    }
}
