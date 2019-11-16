package companyquestions;

import java.util.*;
class Main1
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   
  String name;
  String gender;
  String age;
  String idNum;
  String cgpa;
  String major;
  String year;
     System.out.println("Name");
     name=s.nextLine();
   System.out.println("Age");
    age=s.nextLine();
   System.out.println("Gender");
    gender=s.nextLine();
   System.out.println("ID Number");
    idNum=s.nextLine();
   System.out.println("Major");
    major=s.nextLine();
   System.out.println("CGPA");
    cgpa=s.nextLine();
     System.out.println("Year");
    year=s.nextLine();
    Collegestudent cs=new Collegestudent(name, gender, age, idNum, cgpa, major, year);
    new Student(name, gender, age, idNum, cgpa, major, year);
   // cs.show();
    cs.display();
   
   
  }
}
class Student
{
 // private
    String name;
  //private 
    String gender;
//  private 
  String age;
 // private 
  String idNum;
 // private 
  String cgpa;
 // private 
  String major;
  String year;
 Student(String name,String gender,String age,String idNum,String cgpa,String major,String year)
  {
      this.name=name;
      this.gender=gender;
      this.age=age;
      this.idNum=idNum;
      this.cgpa=cgpa;
      this.major=major;
      this.year=year;
  }
 /* public void show()
  {
    Scanner s=new Scanner(System.in);
   System.out.println("Name");
     name=s.nextLine();
   System.out.println("Age");
    age=s.nextLine();
   System.out.println("Gender");
    gender=s.next();
   System.out.println("ID Number");
    idNum=s.nextLine();
   System.out.println("Major");
    major=s.nextLine();
   System.out.println("CGPA");
    cgpa=s.nextLine();
     System.out.println("Year");
    year=s.nextLine();
  }*/
}
class Collegestudent extends Student
{
  
Collegestudent(String name, String gender, String age, String idNum, String cgpa, String major, String year) {
		super(name, gender, age, idNum, cgpa, major, year);
		
	}

/*String myname,myage,mygender,myidnum,mygpa,year,major;
  Collegestudent(String myname,String myage,String mygender,String myidnum,String mygpa,String year,String major)
 {
    
 }*/
  public void display()
  {
    System.out.println("The Student Details is");
    System.out.println("Id: "+idNum);
    System.out.println("Name: "+name);
    System.out.println("Age : "+age);
    System.out.println("Gender :"+gender);
    System.out.println("Major :"+major);
    System.out.println("CGPA :"+cgpa);
    System.out.println("Year :"+year);
  }
}
                                                                                                 