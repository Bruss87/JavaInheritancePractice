package staff;

public abstract class Employee {

    private String name;
    private String niNo;
    private double salary;

    public Employee(String name, String niNo, double salary){
        this.name = name;
        this.niNo = niNo;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNiNo(){
        return this.niNo;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setName(String name) {
        if (this.name != null)
        this.name = name;
    }

    public double raiseSalary(double raise){
         raise = -1;
         raise = raise < 0? 0 : raise;
         return this.salary + raise;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
