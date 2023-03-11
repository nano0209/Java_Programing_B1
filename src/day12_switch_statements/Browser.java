package day12_switch_statements;

import java.util.Scanner;

/*
Ask a user enter Browser type (single word)
Ask a user to enter URL (link Uniform Resource Locator
chrome , edge, safari, opera, firefox,, mozilla
chrome - going to
 */
public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you browser");
        String browser = input.next();

        System.out.println("Enter a URL");
        String Url = input.next();

        switch(browser){
            case "chrome":
                System.out.println("Going into the  " + Url + " in "+ browser + "  browser");
                break;
            case "edge":
                System.out.println("Going into the  " + Url + " in "+ browser + " browser");
                break;
            case "safari":
                System.out.println("Going into the  " + Url + " in "+ browser + "  browser");
                break;

            default:
        }





    }
}
