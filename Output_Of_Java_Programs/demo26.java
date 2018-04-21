/*package Output_Of_Java_Programs;

 Hello.java 
package a;
public class Hello {
    public void doIt()
    {
        printMessage();
    }
    void printMessage()
    {
        System.out.println("Hello");
    }
}
 
 World.java 
package b;
import a.Hello;
public class World {
    private static class GFG extends Hello {
        void printMessage()
        {
            System.out.println("World");
        }
    } 
    public static void main(String[] args)
    {
        GFG gfg = new GFG();
        gfg.doIt();
    }
}

//Output: Hello*/