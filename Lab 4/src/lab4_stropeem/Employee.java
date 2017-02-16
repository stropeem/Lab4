package lab4_stropeem;

/**
 * Created by Elisa on 2/14/2017.
 */
public class Employee implements Rules{

    String name;
    double salary;

    public Employee(){
        //No name provided
        //this.("No Name");
        //System.out.println("This is a no-arg constructor of Employee");
    }

    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
        //System.out.println("this is a constructor of Employee with args");
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String toSting(){
        return "Employee " + getName() + " has a salary of " + getSalary();
    }


}
