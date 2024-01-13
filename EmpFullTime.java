
public class EmpFullTime extends Employee {
    protected double salary;
    public EmpFullTime(int id, String name, String phone, double salary){
        super(id, name, phone);
        this.salary = salary;
    }
     
//    public double salary(){
//        return salary;
//    }

    /**
     *
     * @return
     */

    @Override
    public double calculation() {
        return salary;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public String header(){
        return "ID\tName\tPhone\t\tSalary";
    }
}
