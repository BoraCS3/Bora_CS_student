
public abstract class Employee {
    protected int id;
    protected String name;
    protected String phone;
    
    public Employee(int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
    
    public abstract double calculation();
    public abstract String header();
}
