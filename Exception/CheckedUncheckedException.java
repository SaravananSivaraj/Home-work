/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.io.IOException;

/**
 *
 * @author HP
 */
public class CheckedUncheckedException 
{
    static void checkedExceptionMethod() throws IOException
    {
        throw new IOException("This is a checked exception");
    }

    static void uncheckedExceptionMethod()
    {
        String str = null;
        System.out.println(str.length()); 
    }

    public static void main(String[] args)
    {
        try
        {
            checkedExceptionMethod();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            uncheckedExceptionMethod();
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException occurred");
        }
    }  
}
