package chapter17;

import java.util.Scanner;  

class Person {    
    private String name;    
    private String major;    
  
    public Person(String name, String major) {  
        this.name = name;  
        this.major = major;  
    }  
  
    public String getName() {    
        return name;    
    }    
  
    public String getMajor() {    
        return major;    
    }    
}    
  
class Student extends Person {    
    public Student(String name, String major) {  
        super(name, major);  
    }  
  
    public void printInfo() {    
        System.out.println("Name: " + super.getName());    
        System.out.println("Major: " + super.getMajor());    
    }    
}    
  
public class student_Glass {    
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);  
        System.out.print("이름을 입력하세요:");  
        String name = scanner.next();  
        System.out.print("학과를 입력하세요:");  
        String major = scanner.next();  
  
        Student student = new Student(name, major);    
  
        student.printInfo();    
    }    
}