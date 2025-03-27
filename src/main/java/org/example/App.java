package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Zoopark m=new Zoopark();
        Display v=new Display();
        Controller c=new Controller(m,v);

        c.run();

    }
}
