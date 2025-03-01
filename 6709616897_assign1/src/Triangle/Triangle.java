// นาย ศุภณัฐ จันทร์เลข
// 6709616897

package Triangle;

public class Triangle {
    private int a, b, c;  // เก็บความยาว 3 ด้านของสามเหลี่ยม

    // Constructor เปล่า
    public Triangle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    // Setter
    public void setSides(int a, int b, int c) {
        if(isValidTriangle(a, b, c)){
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Invalid triangle");
        }
    }

    public int getA() { return a; }
    public int getB() { return b; }
    public int getC() { return c; }

    // ตรวจสอบว่าด้านทั้ง 3 โดยความยาวต้องเป็นเลขจำนวนเต็มบวกมากกว่า 0
    private boolean isValidTriangle(int a, int b, int c){
        return (a > 0 && b > 0 && c > 0) && (a + b > c) && (a + c > b) && (b + c > a);
    }

    // ตรวจสอบว่าเป็นสามเหลี่ยมมุมฉากหรือไม่
    public boolean isValidRightTriangle(){
        return Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2));
    }

    // คํานวณพื้นที่สามเหลี่ยมจากด้าน 3 ด้าน
    public double calculateArea(){
        if (!isValidTriangle(a, b, c)) {
            return 0; // ถ้าสามเหลี่ยมไม่ถูกต้อง ให้คืนค่า 0
        }
        double s = (a + b + c) / 2.0; // s เป็นผลรวมความยาว 3ด้านของสามเหลี่ยม / 2
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // คำนวณหาพื้นที่
    }

}
