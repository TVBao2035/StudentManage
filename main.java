import objects.student.Student;
import objects.department.Department;
public class main {
    public static void main(String[] args) {
        Department[] listDepartments = new Department[2];
        listDepartments[0] = new Department("D-0002", "Information Technology", 100);
        listDepartments[1] = new Department("D-0003", "Fix Car", 100);

        Student student = new Student("SV-001", "Bao", true, "2003", "D-0002");
        Student student1 = new Student("SV-002", "Bao1", true, "2003", "D-0003");

        
        student1.displayInfor(listDepartments); 
        
    }   
}
