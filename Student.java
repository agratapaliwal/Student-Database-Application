package studentdatabaseapp;

import java.util.Scanner;

public class Student {
 private String firstName;
 private String lastName;
 private int gradeYear;
 private String studentID;
 private String courses= "" ;
 private int tuitionBalance =0;
 private int costOfCourses= 600;
 private static int id=1000;
	
	public Student(){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter student first name:");
		this.firstName =s.nextLine();
		
		System.out.print("Enter student last name:");
		this.lastName =s.nextLine();
		
		System.out.print("1 - Freshmen\n2 - sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
		this.gradeYear =s.nextInt();
		
		setstudentID();
		
	}
	
	private void setstudentID(){
		
		id++;
		this.studentID =gradeYear + "" +id;
	}

	public void enroll(){
		
		do{
		System.out.print("Enter courses to enroll(Q to Quit): ");
		Scanner s=new Scanner(System.in);
		String course =s.nextLine();
		if(!course.equals("Q")){
			courses = courses + "\n "+ course;
			tuitionBalance = tuitionBalance + costOfCourses;
		}
		else{
			break; 
			}
		}while(1 !=0);
		
	}

	public void viewBalance(){
		System.out.println("Your balance is: Rs." + tuitionBalance);
		
	}
	
	public void payTuition(){
		viewBalance();
		System.out.print("Enter your payment: Rs.");
		Scanner s=new Scanner(System.in);
		int payment=s.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank You for your payment of Rs." + payment);
		viewBalance();
	}
	
	public String showInfo(){
		return "Name: " + firstName + " " + lastName +
				"\nGrade level: " + gradeYear +
				"\nStudent ID: " + studentID +
		        "\nCourses Enrolled:" + courses +
		        "\nBalance: Rs." + tuitionBalance;
	}
}
