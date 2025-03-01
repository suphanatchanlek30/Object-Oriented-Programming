// นาย ศุภณัฐ จันทร์เลข
// 6709616897

package Calculator;
import java.util.Scanner;

public class Calculator {
    private String expression;

    public static void main(String[] args) {
        // สร้าง Scanner เพื่อรับค่า
        Scanner input = new Scanner(System.in);
        // สร้าง object ของ Calculator
        Calculator calculator = new Calculator();
        // สร้าง object ของ SimpleArithmeticExpression
        SimpleArithmeticExpression simpleArithmeticExpression  = new SimpleArithmeticExpression();

        System.out.println("=====================================");
        System.out.println("      Simple Arithmetic Calculator  ");
        System.out.println("=====================================");
        System.out.println("\n Enter two positive numbers and an operator");
        System.out.println(" (Supports only addition and subtraction)");
        System.out.println("\n Format: <number1> <operator> <number2>");
        System.out.println(" Example:  10 + 20");
        System.out.println("           30 - 15");
        System.out.println("\n Type \"q\" to exit.");
        System.out.println("-------------------------------------");

        // loop เพื่อรับค่าและตรวจสอบ
        while (true) { // วนลูปรับค่าจากผู้ใช้จนกว่าจะสั่งหยุด
            System.out.print("\nInput:  ");
            String expr = input.nextLine().trim(); // รับค่า Expression จากผู้ใช้และตัดช่องว่างหัวท้าย

            if (expr.equals("quit") || expr.equals("q")) { // ตรวจสอบว่าผู้ใช้ต้องการออกจากโปรแกรมหรือไม่
                System.out.println("\n=====================================");
                System.out.println("       Thank you for using");
                System.out.println("    Simple Arithmetic Calculator");
                System.out.println("=====================================");
                break; // ออกจากลูป
            }

            if (!calculator.isValidExpression(expr)) { // ตรวจสอบว่านิพจน์ที่ป้อนมามีรูปแบบถูกต้องหรือไม่
                System.out.println("\n⚠ Invalid format!");
                System.out.println("Correct format: <number1> <operator> <number2>");
                System.out.println("Supported operators: +, -");
                System.out.println("-------------------------------------");
                continue; // ถ้าผิด ให้รับค่ารอบใหม่
            }

            calculator.expression = expr; // เก็บ Expression ที่ผ่านการตรวจสอบแล้ว
            String operand1 = calculator.extractOperand1(expr); // ดึงค่าตัวเลขตัวแรกออกจาก Expression
            String operand2 = calculator.extractOperand2(expr); // ดึงค่าตัวเลขตัวที่สองออกจาก Expression
            String operator = calculator.extractOperator(expr); // ดึงโอเปอเรเตอร์ (+ หรือ -) ออกจาก Expression

            simpleArithmeticExpression.setOperand1(operand1); // ตั้งค่าตัวเลขที่ 1
            simpleArithmeticExpression.setOperand2(operand2); // ตั้งค่าตัวเลขที่ 2
            simpleArithmeticExpression.setOperator(operator); // ตั้งค่าโอเปอเรเตอร์

            System.out.println("You entered: " +simpleArithmeticExpression.getExpression());
            System.out.println("Result: " + simpleArithmeticExpression.computeExpression());
            System.out.println("-------------------------------------");
        }
        input.close(); // ปิด Scanner

    }

    private boolean isBigInteger(String x){
        return x.matches("[1-9][0-9]*");
    }

    private boolean isOperator(String op){
        // คำนวณได้คือต้องเป็น ‘+’ หรือ ‘-‘ เท่านั้น
        return op.equals("+") || op.equals("-");
    }

    public boolean isValidExpression(String expr){
        // ทำการเช็คว่าเป็น Expression ที่ถูก Format หรือไม่
        String[] parts = expr.split(" ");
        if (parts.length != 3) return false; // ต้องมี 3 ส่วน: ตัวเลข1, โอเปอเรเตอร์, ตัวเลข2
        return isBigInteger(parts[0]) && isOperator(parts[1]) && isBigInteger(parts[2]);
    }

    public String extractOperand1(String expr){
        // สกัด operand ตัวแรกจาก expression
        return expr.split(" ")[0];
    }

    public String extractOperand2(String expr){
        // สกัด operand ตัวที่ 2 ของ expression
        return expr.split(" ")[2];
    }

    public String extractOperator(String expr){
        // สกัด operator จาก expression
        return expr.split(" ")[1];
    }

}
