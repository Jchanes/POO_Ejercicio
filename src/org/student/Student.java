package org.student;

public class Student {
    String firstName;
    String lastName;
    int registration;
    public int grade; //public porque en la clase Course daba error en bestGrade
    int year;
    
    public Student(String firstName, String lastName, int registration, int grade, int year){
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.registration = registration;
    	this.grade = grade;
    	this.year = year;
    }//constructor student
    
    public void printFullName(){
        //TODO implement
    	System.out.println("Full Name: " + firstName + " " + lastName );
     }//printFullName
    
    public String FullName()
    {
    	return firstName + lastName;
    }

     public boolean isApproved(){
         //TODO implement: should return true if grade >= 60
    	 if (grade>=60) {
    		 System.out.println("Appoved");
			return true;
		}//if grade>60 
    	 else {
    		 System.out.println("Failed");
    		 return false;
		}//else
    	 
     }//isApproved

     public int changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congragulations" if the student has been approved
    	 if (isApproved()) {
			System.out.println("Congratulations! you passed");
    		 year+=1;
			
		} //if
    	 return year;
     }//changerYearIfApproved
     
}//Class Student

