
public class EmpPartTime extends Employee{
    protected int hour;
    protected double price;
    public EmpPartTime(int id, String name, String phone, int hour, double price){
        super(id, name, phone);
        this.hour = hour;
        this.price = price;
    }

    @Override
    public double calculation() {
        return hour * price;
    }
    @Override
    public String header(){
        return "ID\tName\tPhone\t\tHour\tPrice\tSalary";
    }
}
