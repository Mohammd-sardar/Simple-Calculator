import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		
		    
		    Scanner cin=new Scanner(System.in);
		    
		    
		    System.out.println("welcome to calculator APP!");
		    System.out.println("our calculator has 7 options ! ");
		    
		    String again;
		    
		    do {
		    
		    boolean repeat =false;
		       double result=0;
		    
		    
		    do {
		    System.out.println("  1-sum");
		    System.out.println("  2-subtract");
		    System.out.println("  3-multiply");
		    System.out.println("  4-division");
		    System.out.println("  5-power");
		    System.out.println("  6-square root");
		    System.out.println("  7-absolute value");
		    
		    System.out.print("please choose one of them: ");
		    int choice=cin.nextInt();
		    
		    
		    if(choice>=1&&choice<=5)
		    {
		      Double first,second;
		      
		      repeat=false;
		      
		      
		      System.out.print("please enter first number: ");
		      first=cin.nextDouble();
		      
		      System.out.print("please enter second number: ");
		      second=cin.nextDouble();
		      
		      if(choice==1)
		      {
		        result=first+second;
		      }
		      
		      else if(choice==2)
		      {
		        result=first-second;
		      }
		      
		      else if(choice==3)
		      {
		        result=first*second;
		      }
		      
		      else if(choice==4)
		      {
		        result=first/second;
		      }
		      
		      else if(choice==5)
		      {
		        result=Math.pow(first, second);
		      }
		      
		    }
		    
		    else if(choice==6)
		    {
		      repeat=false;
		      
		      double num;
		      System.out.print("please enter a number: ");
		      
		      num=cin.nextDouble();
		      
		      result=Math.sqrt(num);
		    }
		    
		    else if(choice==7)
		    {
		      repeat=false;
		      
		      double num;
		      System.out.print("please enter a number: ");
		      
		      num=cin.nextDouble();
		      
		      if(num<0)
		        result=-num;
		      
		      else
		        result=num;
		      
		    }
		    
		    else
		    {
		      System.out.println("this option does not available ! ");
		      System.out.println("please enter again:  ");
		      
		      repeat=true;
		      
		    }
		    
		    }while(repeat);
		    
		    
		    
		    
		    
		    System.out.println("result = "+result);
		    
		    cin.nextLine();
		    
		    System.out.print("you want to repeat it? type (yes) for repeat :");
		    again=cin.nextLine();

		    
		    
		    }while(again.equals("yes"));
		    
		    
		    
		    System.out.println("End");
		    

		    
		   
		  
		    
		      
		    
		  }
		  
		}

	

