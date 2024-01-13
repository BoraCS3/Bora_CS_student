/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherigeometry;
public class Cylinder extends Circle{
    public double h;
    public Cylinder(){
        super();
        h = 10;
    }
    public Cylinder(double h){
        this.h = h;
    }
    public Cylinder(double r, double h){
        this.h = h;
        super.r = r;
    }
    public double getVolume(){
        return super.getArea()*this.h;
    }
}

