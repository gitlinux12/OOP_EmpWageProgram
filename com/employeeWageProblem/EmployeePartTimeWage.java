package com.employeeWageProblem;

public class EmployeePartTimeWage {
	
	 int IS_PRESENT = 1;
	 int WAGE_PER_HOUR = 20;
	 int IS_PART_TIME =2;
	 int PART_TIME= 4;
	 int FULL_TIME = 8;
	 int empWage = 0;

	public void partEmpWage() 
	{

	    int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
	System.out.println("empCheck=> "+empCheck);
	if (empCheck == IS_PRESENT)
	{
	       System.out.println("Employee is present");
	       empWage = WAGE_PER_HOUR * FULL_TIME ;                                 //FULL TIME
	}
	   
	else if(empCheck == IS_PART_TIME)
	{
		   System.out.println("Employee working as part time");
		   empWage = WAGE_PER_HOUR * PART_TIME ;                                    //PART TIME
		}
	else
	{
	       System.out.println("Employee is absent");
	        empWage = 0;
	}
	System.out.println("Employee wage = " +empWage);
	}

	public static void main(String[] args) {
		
		    EmployeePartTimeWage a = new EmployeePartTimeWage ();
	        a.partEmpWage();

	}

}
