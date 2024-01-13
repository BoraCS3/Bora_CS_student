
public class Main {
    public static void main(String[] args) {
        System.out.println("The Employee Fulltime Info");
        EmpFullTime emp1 = new EmpFullTime(222,"Bora", "444485858", 888);
        System.out.println(emp1.header());
        System.out.println(emp1.id + "\t"+ emp1.name + "\t" + emp1.phone + "\t" + emp1.salary);
        
        
        
        System.out.println("The Employee Parttime Info");
        EmpPartTime emp2 = new EmpPartTime(3333, "Kinda", "049558566", 17, 25);
        System.out.println(emp2.header());
        System.out.println(emp2.id + "\t" + emp2.name + "\t" + emp2.phone + "\t" + emp2.hour + "\t" + emp2.price + "\t" + emp2.calculation());
    }
}
