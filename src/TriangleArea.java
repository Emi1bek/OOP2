public class TriangleArea {
    double a;
    double b;
    double c;

    void area(){
        double pp = (a + b + c) / 2.0;  // полупериметр
        double s= Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c)); // прямо по формуле Герона из вики
        System.out.println("Уч-бурчтуктун аянты "+s+" барабар!");
    }
}
