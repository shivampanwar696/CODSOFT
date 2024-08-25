import java.util.*;
public class GradeCalculator {

	public static void main(String[]args)
	{
	Scanner n=new Scanner(System.in);
	int Sub1,Sub2,Sub3,Sub4,Sub5;
	System.out.println("Enter the mark for Subject_1:");
	Sub1=n.nextInt();
	System.out.println("Enter the mark for Subject_2:");
	Sub2=n.nextInt();
	System.out.println("Enter the mark for Subject_3:");
	Sub3=n.nextInt();
	System.out.println("Enter the mark for Subject_4:");
	Sub4=n.nextInt();
	System.out.println("Enter the mark for Subject_5:");
	Sub5=n.nextInt();
	int sum=Sub1+Sub2+Sub3+Sub4+Sub5;
	int avg=sum/5;                            
	System.out.println(avg);
	if(avg>=90)
	 System.out.print("Grade A");         
	else if(avg>=80&&avg<90)
	  System.out.print("Grade B");        
	else if(avg>=70&&avg<80)
		  System.out.print("Grade C");    
	else if(avg>=60&&avg<70)
		  System.out.print("Grade D");    
	else if(avg>=50&&avg<60)
		  System.out.print("Grade E");    
	else
		System.out.print("Grade F");      
	}
}