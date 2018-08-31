package com.capgemini.account.domain;

public class Employee {
	private static int empId;
	private String empName;
	private String empAddress;
	private int empphone;
	private double empbasicsal;
	private double empHRA;
	public final double specialAllowance = 250.80;
	public final double HRA = 1000.50;
	public Employee()
	{
	 super();
	 
	}
public Employee(int empId, String empName, String empAddress, int empphone, double empsal) {
	this();
	this.empId = empId;
	this.empName = empName;
	this.empAddress = empAddress;
	this.empphone = empphone;
}

public void calculateSalary()
{
	double salary =  empbasicsal + ( empbasicsal * specialAllowance/100) + ( empbasicsal * empHRA/100); 
	
	System.out.println("The salary is:" +salary);
}
}
