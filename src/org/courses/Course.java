package org.courses;
import java.util.ArrayList;
import java.util.HashMap;

import org.student.*;
//Your Course class must have, as attributes: courseName, professorName, year.
//Your class must also contain a collection that lists all students enrolled in them.
//Implement the following methods.
public class Course {
	String courseName;
	String proffesorName = "Nemesio Jones";
	int year;
	
	public Course(String courseName, String proffesorName, int year){
		this.courseName = courseName.toUpperCase();
		this.proffesorName = proffesorName.toUpperCase();
		this.year = year;
	}//constructor Course
	
	ArrayList<Student> students = new ArrayList<Student>();
	
//	public Student students(){
//		students.add(new Student("Santiago","Perez",2023,79,2));
//		students.add(new Student( "Kate","Del Castillo",2023,8,2));
//		students.add(new Student( "Alejandra","Guzman",2020,70,2));
//		students.add(new Student( "Maria", "Daniela",2023,55,2));
//		students.add(new Student( "Peter", "Porker",2022,9,2));
//	return ?;
//		}//students
	   public void enroll(Student student){
		      //TODO add the student to the collection
		   students.add(student);
		   }//enroll void
	   
//	   public void enroll(Student[] students){
//		   for (Student student : students) {
//			   enroll(student);
//		}//foreach
//	   }//enroll sobrecargado
	   

		   public void unEnroll(Student student){
		       //TODO remove this student from the collection
		       // Hint: check if that really is this student
			   if(students.contains(student)) {
				   students.remove(student);
			   }//if student.contains
		   }//unEnroll

		   public int countStudents(){
		       //TODO implement
			   return students.size();
		   }//countStudents
		   
		   public int bestGrade(){
		       //TODO implement
			   int bestgrade = 0;
			   for(Student student : students) {
				   if(student.grade>bestgrade){
					   bestgrade=student.grade;
				   }//if best
			   }//foreach
		       return bestgrade;
		   }//bestGrade
}
