package objects.student;
import objects.department.Department;
public class Student {
    private String id;
    private String name;
    private boolean gender;
    private String bornYear;
    private String departmentId;
   

    public String getDepartmentId(){
        return this.departmentId;
    }
    
    public Student(String id, String name, boolean gender, String bornYear, String departmentId){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.bornYear = bornYear;
        this.departmentId = departmentId;
    }
    public Student(){}

    public void displayInfor(Department[] listDepartments){
        System.out.println("_______________________");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + (this.gender ? "Boy":"Girl"));
        System.out.println("Born Year: " + this.bornYear);
       
        for(int i=0; i<listDepartments.length; i++){
            if(this.departmentId == listDepartments[i].getId()){
                listDepartments[i].displayName();
            }
        }
    }

}


