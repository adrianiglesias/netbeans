
package cat.iesjoaquimmir.daw2.myapp;

import java.util.Date;
import java.util.Random;

public class Application {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        Random rnd = new Random();
        System.out.println("rnd = " + rnd.nextInt(1000));
        Date d = new Date();
        System.out.println("d = " + d.toString());
    }
}
