package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Zoopark model=new Zoopark();
        Display view=new Display();
        Controller controller=new Controller(view,model);
    }
}
