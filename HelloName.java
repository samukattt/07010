package Name;

import java.util.Scanner;

public class HelloName {
    public static void main(String [] args){
        Scanner v = new Scanner (System.in);
        System.out.println("Как тебя зовут?");
        String n = v.next();
        System.out.println("Привет, " + n + "!");
    }
}
