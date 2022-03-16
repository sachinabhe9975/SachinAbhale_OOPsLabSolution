package Com.mainClass.Model;

import java.util.Scanner;

import Com.CredentialsServices.Model.*;

public class Driver {



	public static void main(String[] args) {
		
		       int choice;
		       Scanner sc=new Scanner(System.in);
		
		
		
		do 
		{
			  System.out.println();
			
		      System.out.println("Please enter the department from the following:");
		      System.out.println("1.technical"+"\n"+"2.Admin"+"\n"+"3.Human Resource"+"\n"+"4.Legal"+"\n");
	    
		      choice =sc.nextInt();
		
	    
	    switch(choice)
	    
	    {
	    
	   case 1 : 
	    	
	    	
	    	CredentialServices GN= new CredentialServices("Harshit", "Choudary","Tech","ABC");
	    	
	           System.out.println("Dear Harshit your generated credentials are as follows");
               System.out.println("Email        --->  "+GN.theGenerateEmailIS());
             
               
               System.out.println("Password     ---> "+GN.getPassword());
               break;
	           
	    case 2 :
	    	   
	    	
	    	   CredentialServices GN1= new CredentialServices("Harshit", "Choudary","admin","ABC");
	    
	    	   System.out.println("Dear Harshit your generated credentials are as follows");
               System.out.println("Email        --->  "+GN1.theGenerateEmailIS());
             
               
               System.out.println("Password     ---> "+GN1.getPassword());
               break;
                	
                
	    case 3 :
	    	
	    	
	    	   CredentialServices GN2= new CredentialServices("Harshit", "Choudary","HR","ABC");
	    
	    	   System.out.println("Dear Harshit your generated credentials are as follows");
               System.out.println("Email        --->  "+GN2.theGenerateEmailIS());
             
               
               System.out.println("Password     ---> "+GN2.getPassword());
               break;
            
	    case 4:
	    	
	    	    CredentialServices GN3= new CredentialServices("Harshit", "Choudary","Legal","ABC");
	    
	    	    System.out.println("Dear Harshit your generated credentials are as follows");
                System.out.println("Email        --->  "+GN3.theGenerateEmailIS());
             
               
                System.out.println("Password     ---> "+GN3.getPassword());
                break;
	    
	   default:
		     System.out.println("You entered wrong choice ");
	    }
		}
		
		while(choice<5);
		
		    System.out.println("**** Thank you ***** ");
	    
	    
		    sc.close();
	}
	

}


