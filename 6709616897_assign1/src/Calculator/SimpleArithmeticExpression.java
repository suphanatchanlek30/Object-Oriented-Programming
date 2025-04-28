// นาย ศุภณัฐ จันทร์เลข
// 6709616897

package Calculator;

import java.math.BigInteger;

public class SimpleArithmeticExpression {
    private String operand1; // เก็บค่าตัวเลขที่ 1
    private String operand2; // เก็บค่าตัวเลขที่ 2
    private String operator; // เก็บค่า '+' || '-'

    public String computeExpression() {
        // คำนวณผลลัพธ์ของ Expression
        BigInteger num1 = new BigInteger(operand1); // แปลงตัวเลขที่ 1 เป็น BigInteger
        BigInteger num2 = new BigInteger(operand2); // แปลงตัวเลขที่ 2 เป็น BigInteger
        BigInteger result;

        // เงื่อนไข
        if (operator.equals("+")) {
            result = num1.add(num2);
        } else {
            result = num1.subtract(num2);
        }

        // แปลงผลลัพธ์เป็น String และจัดรูปแบบผลลัพธ์
        String resStr = result.toString(); // แปลงผลลัพธ์เป็น String
        boolean isNegative = resStr.startsWith("-"); // ตรวจสอบว่าผลลัพธ์เป็นค่าลบหรือไม่
        if (isNegative) {
            resStr = resStr.substring(1); // ถ้าเป็นค่าลบ ให้ตัดเครื่องหมายลบออกก่อน
        }

        StringBuilder formatted = new StringBuilder(); // ใช้ StringBuilder เพื่อสร้างผลลัพธ์ที่จัดรูปแบบ
        int count = 0; // ตัวนับจำนวนหลัก
        for (int i = resStr.length() - 1; i >= 0; i--) { // วนลูปจากหลักท้ายสุดไปต้นสุด
            formatted.insert(0, resStr.charAt(i)); // เพิ่มตัวเลขจากขวาไปซ้าย
            count++;
            if (count % 3 == 0 && i != 0) { // ทุก 3 หลัก ให้เติมเครื่องหมาย , เว้นแต่เป็นหลักแรก
                formatted.insert(0, ",");
            }
        }

        return isNegative ? "-(" + formatted + ")" : formatted.toString(); // ถ้าเป็นค่าลบ ให้ใส่ในวงเล็บ

    }

    public void setOperand1(String operand) {
        this.operand1 = operand;
    }

    public void setOperand2(String operand) {
        this.operand2 = operand;
    }

    public void setOperator(String op) {
        this.operator = op;
    }

    public String getOperand1() {
        return this.operand1;
    }

    public String getOperand2() {
        return this.operand2;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getExpression() {
        StringBuilder formattedOperand1 = new StringBuilder();
        int count1 = 0;
        for (int i = getOperand1().length() - 1; i >= 0; i--) {
            formattedOperand1.insert(0, getOperand1().charAt(i));
            count1++;
            if (count1 % 3 == 0 && i != 0) {
                formattedOperand1.insert(0, ",");
            }
        }

        StringBuilder formattedOperand2 = new StringBuilder();
        int count2 = 0;
        for (int i = getOperand2().length() - 1; i >= 0; i--) {
            formattedOperand2.insert(0, getOperand2().charAt(i));
            count2++;
            if (count2 % 3 == 0 && i != 0) {
                formattedOperand2.insert(0, ",");
            }
        }

        return formattedOperand1 + " " + getOperator() + " " + formattedOperand2;
    }

}
