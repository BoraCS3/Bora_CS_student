/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherigeometry;

public class Circle {
    public double r;
    public Circle(){
        r = 5;
    }
    public Circle(double r){
        this.r = r;
    }
    public Circle(double r, String name){
        this.r =r;
        System.out.println(name);
    }
    public double getArea(){
        return (3.14)*r*r;
    }
}

