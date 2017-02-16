package lab4_stropeem;

/**
 * Created by Elisa on 2/14/2017.
 */
public class Faculty extends Employee {

    private int courseNumber = 5;
    private String[] courses = new String[courseNumber];

    public Faculty(){
        //super("Unknown");
    }
    public Faculty(String name, double salary, String[] courses){
        this.name=name;
        this.salary=salary;
    }

    public String getName(){
        return "Professor " + super.getName();
    }

    public void setCourses(String[] courses){
        this.courses=courses;
    }

    public CD[] getCourses(){
        CD[] temp = new CD[courseNumber];
        for(int i=0; i<courseNumber; i++){
            temp[i] = new CD(collection[i]);
        }
        return temp;
    }

    public String toString(){
        return getName() + " has a salary of " + super.getSalary() + " and teaches " + " courses";
    }



}
