
package inherigeometry;

import static java.lang.String.format;

public class InheriGeometry {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius " + c1.r + " Area : "+ c1.getArea());
        Circle c2 = new Circle(9);
        System.out.println("Radius "+ c2.r + " Area :" + c2.getArea());
        Circle c = new Circle(7, "Circle");
        System.out.println("Area of circle : " + c.getArea()); 
        System.out.println("\n---------------------\n");
        
        Cylinder cy = new Cylinder();
        System.out.println("Cylinder, radius "+ cy.h + " Area : " + cy.getVolume());
        Cylinder cy1 = new Cylinder(7, 3);
        System.out.println("cylinder, radius "+cy1.r + " Heighr : "+ cy1.h + " Area : " + format("%.2f",cy1.getVolume()));
        Cylinder cy2 = new Cylinder(10);
        System.out.println("Radius :" + cy2.r + " height :" + cy2.h + " Area : " + cy2.getVolume());
    }
    
}
