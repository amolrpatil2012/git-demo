package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void helloWorld ( String name )
    {
        if ( name.equalsIgnoreCase("Rohit"))
            System.out.println("Hi " + Constants.name);
        else
            System.out.println( " Hello " + name );
    }
    public static void main( String[] args )
    {
        helloWorld("Rohit");
    }
}
