package com.employeeWageProblem;

public class EmpWageSwitchCase 
{

	 int WAGE_PER_HOUR = 20;
	 int FULL_TIME = 8;
	 int PART_TIME= 4;
	 int empWage = 0;
	 
    public void empWageCase()
		{

		    int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("empCheck=> "+empCheck);

		switch(empCheck)
		{
		case 1:
		   System.out.println("Employee is present");
		   empWage = WAGE_PER_HOUR * FULL_TIME ;
		   break;

		case 2:
		   System.out.println("Employee working as part time");
		   empWage = WAGE_PER_HOUR * PART_TIME ;
		   break;

		default:
		   System.out.println("Employee is absent");
		   empWage = 0;

		}
		System.out.println("Employee wage = " +empWage);	
	}
	 
	public static void main(String[] args)
	{
		EmpWageSwitchCase a = new EmpWageSwitchCase();
		a.empWageCase();		
	}
}
