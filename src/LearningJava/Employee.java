package LearningJava;

class Employee {
    //attibutes
    private String id;
    private String name;
    private Double salary;

    //Static Attribute
    static int minSalary=30000;

    public Employee(){
        System.out.println("I'm Employee");
    }
    //Methods
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void disPlayEmployees(){
        System.out.println("Name = " + this.name);
        System.out.println("Salary = " + this.salary);
    }
    public String getName(){
        return this.name;
    }
    public Double getSalary(){
        return this.salary;
    }
}
