package Com.CredentialsServices.Model;
import Com.Employee.Model.*;

import java.util.Random;

public class CredentialServices extends Employee  {
	
	String departmentName;
	String companyName;
	String spacialSymbol="@";
	String dotOperator=".";
	String com="com";
	
	
	
	public CredentialServices( String firstName , String lastName,String departmentName, String companyName)
	{
        super(firstName,lastName);
		this.departmentName=departmentName;
		this.companyName=companyName;
		
		
		
	}

	public String getPassword()
	{

		
		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String num="0123456789";
		String spacialChar="~!@#$%^&*().?{}[]=+-_";
		String combinationPass=upper+lower+num+spacialChar;
		int length=8;
		
		char[] password=new char[length];
		Random R=new Random();
		
		for(int i=0;i<length;i++)
		{
			password[i]=combinationPass.charAt(R.nextInt(combinationPass.length()));
		}
		String Password= new String(password);
		return Password;
		
	    }
	
	
	   public String theGenerateEmailIS()
	

	    {
		
		
		String Email=firstName+lastName+spacialSymbol+departmentName+dotOperator+companyName+dotOperator+com;
		return Email;
	    }

        }
