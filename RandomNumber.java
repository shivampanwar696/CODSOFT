import java.util.*;
public class RandomNumber{
    public static void main(String[]args){
	    Scanner k=new Scanner(System.in);
        Random random=new Random();
        int a=random.nextInt(100),b=1,s=0;
        System.out.println("Welcome to the Number Game  \nEnjoy the Experience \nRandom Number Generates From 0 to 99");
        while(b<=5)
        {
	        System.out.print("Enter The Number:    ");
	        int c=k.nextInt();
	        if(c>a)
	        {
		        System.out.println(" less than this Number!!");
		        s++;
	        }
	        else if(c<a)
	        {
		        System.out.println("Greater than this Number!!");
		        s++;
	        }
	        else
	        {
		        System.out.println("Bingo! It is Right Answer");
		        break;
	        }
	        b++;
        }
        int f=5-s;
  
        if(s==5)
        {
	    System.out.println(" try next time!!");
        }
        else
        {
	    System.out.println("Congrats!! You Have Won The Game!!    \nPlay Again!!");
	    System.out.println("Your Score is "+f+"/5");
        }
        System.out.println("The Random Number is "+a);
    }
}