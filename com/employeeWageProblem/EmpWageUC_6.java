package com.employeeWageProblem;

public class EmpWageUc6 
{ 
	final int IS_PART_TIME = 1;
	final int IS_FULL_TIME = 2;
	int EMP_RATE_PER_HOUR = 20;
	int NUM_OF_WORKING_DAY = 2;
	int MAX_HRS_IN_MONTH = 10;

    public void empWageBuilder() 
 {
	int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

    while(totalEmpHrs <= MAX_HRS_IN_MONTH && 
		totalWorkingDays < NUM_OF_WORKING_DAY) 
    {
	    totalWorkingDays++;
	
	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	
	switch (empCheck)
	{
	case IS_PART_TIME:
	empHrs=4;
	
	break;
	case IS_FULL_TIME:
	empHrs=8;
	
	break;
	default:
		empHrs=0;
	}
	
	totalEmpHrs+= empHrs;
	System.out.println("Day: " +totalWorkingDays+ "Emp Hr: "+empHrs);
	
    }
      int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
      System.out.println("Total Emp Wage: "+totalEmpWage);
 }
	public static void main(String[] args)
    {
		EmpWageUc6 a = new EmpWageUc6 ();
		a.empWageBuilder();
	}

}
