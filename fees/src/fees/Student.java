package fees;

import java.util.Scanner;

public class Student implements StudentFee {
	
	private String name;
	private double salary;
	public Student(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public void getFees() {
		// TODO Auto-generated method stub
		try {
			System.out.println("reached here");
			if(salary<0)
				throw new InvalidFeesException();
			
		}catch(Exception e)
		{System.out.println(e);
		
		}
	}
	
	public static void main(String args[])
	{System.out.println("enter name");
	Scanner s= new Scanner (System.in);
	String name=s.next();
	System.out.println("enter fees");
	double fees= s.nextDouble();
	Student s1=new Student (name,fees);
	s1.getFees();
	

		
		}
	}
	


