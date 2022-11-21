import database.DbConnection;
import models.Student;

public class StudentController{
    DbConnection dbConnection;
public int insertStudent( Student student){
    int id= student.getStudentId();
    String name= student.getStudentName();
    int age= student.getStudentAge();
    String address= student.getStudentAddress();
    int contact= student.getStudentContact();
    String insertQuery= String.format("insert into tbl_student(std_id,std_address,std_contact) values (%d,%s,%d,%s,%d",id,name,age,address,contact);
    dbConnection = new DbConnection();
    int result= dbConnection.manipulate(insertQuery);
    return result;

}
}
