// นาย ศุภณัฐ จันทร์เลข
// 6709616897

package Triangle;

public class TestTriangle {
    public static void main(String[] args){
        Triangle t1 = new Triangle();

        // setter
        t1.setSides(3, 4, 5);

        // คำนวณพื้นที่
        double area = t1.calculateArea();

        // Output
        if(t1.isValidRightTriangle()){
            System.out.printf("Area of Triangle with sides (%.2f, %.2f, %.2f) = %.2f\n", (double)t1.getA(), (double)t1.getB(), (double)t1.getC(), area);
        } else {
            System.out.println("Invalid Triangle");
        }

    }
}
