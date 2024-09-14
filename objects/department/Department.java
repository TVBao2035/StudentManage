package objects.department;

public class Department {
    private String id;
    private String name;
    private int amountOfStudents;
    
    public String getId(){
        return this.id;
    }

    public Department(String id, String name, int amountOfStudents){
        this.id = id;
        this.name = name;
        this.amountOfStudents = amountOfStudents;
    }

    public void displayInfor(){
        System.out.println("_______________________");
        System.out.println("ID: " + this.id);
        System.out.println("Department Name: " + this.name);
        
        System.out.println("Amount Of Students: " + this.amountOfStudents);
    }
    public void displayName(){
        System.out.println("Department Name: " + this.name);
    }
}
