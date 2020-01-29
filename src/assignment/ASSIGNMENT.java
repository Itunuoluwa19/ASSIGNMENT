//@author ITUNU
package assignment;
import java.util.Scanner;
public class ASSIGNMENT {
    public static void main(String[] args) {
        System.out.println("JAVA");
        Scanner input=new Scanner(System.in);
        System.out.println("please supply a digit between 1 and 3");
        int option=input.nextInt();
        System.out.println();
        int a;  // a= hours worked per week
        double b;  // b= overtime
        double c;  //c= overtime pay
        double d;
        String g;  //g= name of employee  
        System.out.println("WELCOME TO FooCorporation");
     System.out.println("Your name please ");
            g=input.next();
        switch (option){
            case 1:
            System.out.println("your hour of work please ");
                a=input.nextInt();
                if (a<40){
                    System.out.println("your work hours seem low for the department");
                }
                if (a>=40){
                 b=a*7.0;
                System.out.println(g +" your total hours worked in hrs is " +a);
                System.out.println( g +" your weekly pay is $" + b);
                }            break;
            case 2: 
            System.out.println("your hour of work please ");
                a=input.nextInt();
                if (a<40){
                    System.out.println("this system shows you have worked way less than the expected work hours in the department this week, please see the account department to get your pay sorted");
                }
                                if (a>60){
                                    b=a-60;
                                    c=8.0*1.5;
                                    d=(b*c)+(60*8);
                   System.out.println(g +" your total hours worked in hrs is " +a);
                System.out.println( g +" your weekly pay is $" + d);
                }
                                if (a> 39 && a <= 60){
                                 b=a*8.0;
                System.out.println(g +" your total hours worked in hrs is " +a);
                 System.out.println(g +" your weekly pay is $" +b);
                                }                               break;
            case 3: 
            System.out.println("your hour of work please ");
                a=input.nextInt();
                if (a>60){
                    System.out.println( g +" Thanks for your dilligence ");
                System.out.println("You exceeded the maximum weekly work hours, thanks for stretching youself some more for our joint growth and development");
                }
                if (a==60){
                    System.out.println(g +" your work hours for the week is just perfect, thanks for your contribution to our growth");
                }
                if (a<60){
                    System.out.println(g +" you have less than the required work hours please do better in the coming week, your efort means a lot to us");
                }
        break;
                    default: 
                    System.out.println(g +" this is an invalid selection");
                        }
        System.out.println("written: ITUNUOLUWA, VERSION 1.0, DATE: 05-11-2014");
    }   
}
    

