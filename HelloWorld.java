
public class HelloWorld
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d= -8;
    
    public void run() {
        System.out.println("Hello World");
        if (a==5){
            System.out.println("a is equal to 5");
            System.out.println("a is still equal to 5");
        }
    }
    
    public static void main(String[] args)
    {
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}

