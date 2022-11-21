package view;

import data.Student;

public class StudentView {
    public static void main(String[] args) {
        Student s1= new Student(std_id:1,std_name:"Aakriti",std_age:19,std_address:"Sitapaila",std_contact:9849571750);
        StudentController sc= new StudentController();
        int isInserted= sc.insertStudent(s1);
        if (isInserted>0){
            System.out.println("Student Inserted");

        }
        else{
            System.out.println("failed to insert student");
        }
    }
    
}
