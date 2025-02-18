package com.demo;

import java.util.List;
import java.util.Scanner;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	System.out.println("*************************************************");
    	System.out.println("* 1.Insert Student                              *");
    	System.out.println("* 2.Delete Student By Id                        *");
    	System.out.println("* 3.Display Student By Id                       *");
    	System.out.println("* 4.Update Student                              *");
    	System.out.println("* 5.Display All Student                         *");
    	System.out.println("* 6.Display Student By Name in Ascending order  *");
    	System.out.println("* 7.Display Student By Name in Descending order *");
    	System.out.println("* 8.Display Student By Percentage Greater than  *");
    	System.out.println("* 9.Display Student By Percentage Less than     *");
    	System.out.println("* 10.Display Student By Percentage Between      *");
    	System.out.println("* 11.Display Student By Percentage Not Between  *");
    	System.out.println("* 12.Display Student By Id and Name             *");
    	System.out.println("* 13.Display Student By Id or Name              *");
    	System.out.println("* 14.Display Student By Name Start with         *");
    	System.out.println("* 15.Display Student By Name Ends with          *");
    	System.out.println("* 16.Display Student By Name Contains           *");
    	System.out.println("* 17.Display All Names                          *");
    	System.out.println("*************************************************");
    	
        StudentDao sd = new StudentDao();
        Student s1 = new Student();
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your choice:");
        int choice = sc.nextInt();
        sc.nextLine();
       switch(choice)
       {
    	   case 1:
    		   System.out.println("enter student name");
    		   s1.setName(sc.nextLine());
    		   System.out.println("enter student city");
    	        s1.setCity(sc.nextLine());
    	        System.out.println("enter student percentage");
    	        s1.setPercentage(sc.nextDouble());
    	        sc.nextLine();
    		   System.out.println(sd.insertStudent(s1));
    		   break;
    		   
    	   case 2: 
    		   System.out.println("Enter Student Id to Delete");
    		   int id = sc.nextInt();
    		   System.out.println(sd.deleteStudentById(id));
    		   break;
    		   
    	  case 3:
    		   System.out.println("Enter Student Id to display Student");
    		   int id1 = sc.nextInt();
   		   	   System.out.println(sd.findStudentById(id1));
   		   	   break;
   		   	   
    	  case 4:
    		  System.out.println("Enter Student Id to update data");
    		  int id2 = sc.nextInt();
    		  sc.nextLine();
    		  Student s2 = sd.findStudentById(id2);
    		  
    		  if(s2 == null) {
    			  System.out.println("Student not found!");
    			  break;
    		  }
    		  
    		  System.out.println("Current Student: "+s2);
   
    		  System.out.println("Enter new Name");
    		  s2.setName(sc.nextLine());
    		  
    		  System.out.println("Enter new City");
    		  s2.setCity(sc.nextLine());
    		  
    		  System.out.println("Enter new Percentage");
    		  s2.setPercentage(sc.nextDouble());
    		  sc.nextLine();
    		  
    		  System.out.println(sd.updateStudent(s2));
    		  break;
    	 
    	  case 5:
    		  List<Student> list = sd.findAll();
    		  for(Student s:list)
    			  System.out.println(s);
    		  break;
    		  
    	case 6:
    		  List<Student> list1 = sd.findStudentByNameAsc();
    		  if(list1.isEmpty()) {
    			  System.out.println("No Student Found");
    		  } else {
    			  list1.forEach(o->System.out.println(o));
    		  }
    		  break;
    		  
    	case 7:
    		List<Student> list3 = sd.findStudentByNameDesc();
    		for(Student s:list3)
    			System.out.println(s);
    		break;
    		
    	case 8:
    		System.out.println("Enter Percentage to find all students which greater than given percentage");
    		List<Student> list4 = sd.findStudentByPercentageGreaterThan(sc.nextDouble());
    		for(Student s:list4)
    			System.out.println(s);
    		break;
    		
    	case 9: 
    		System.out.println("Enter Percentage to find all students which less than given percentage");
    		List<Student> list5 = sd.findStudentByPercentageLessThan(sc.nextDouble());
    		for(Student s:list5)
    			System.out.println(s);
    		break;
    		
    	case 10:
    		System.out.println("Enter Percentages to find all Students which between given percentages");
    		List<Student> list6 = sd.findStudentByPercentageBetween(sc.nextDouble(), sc.nextDouble());
    		for(Student s:list6)
    			System.out.println(s);
    		break;
    		
    	case 11:
    		System.out.println("Enter Student to find all students which not between given percentages");
    		List<Student> list7 = sd.findStudentByPercentageNotBetween(sc.nextDouble(), sc.nextDouble());
    		for(Student s:list7)
    			System.out.println(s);
    		break;
    		
    	case 12:
    		System.out.println("Enter Id and Name to find Student");
    		
    		int id3 = sc.nextInt();
    		
    		sc.nextLine();
    		
    		String name = sc.nextLine();
    		
    		System.out.println(sd.findStudentByIdAndName(id3, name));
    		break;
    		
    	case 13:
    		System.out.println("Enter Id or Name to find Students");
    		
    		int id4 = sc.nextInt();
    		sc.nextLine();
    		
    		String name1 = sc.nextLine();
    		
    		System.out.println(sd.findStudentByIdOrName(id4, name1));
    		break;
    		
    	case 14:
    		System.out.println("Enter Starting character to find students");
    		
    		List<Student> list8 = sd.findStudentByNameStartWith(sc.nextLine());
    		for(Student s:list8)
    			System.out.println(s);
    		break;
    		
    	case 15:
    		System.out.println("Enter ending characters to find students");
    		
    		List<Student> list9 = sd.findStudentByNameEndsWith(sc.nextLine());
    		for(Student s:list9)
    			System.out.println(s);
    		break;
    	default:
    		System.out.println("invalid choice");
    		break;
       }
    }
}
