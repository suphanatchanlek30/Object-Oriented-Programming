package HomeworkNumber2EmployeeInformation;

import java.util.ArrayList;

public class EmployeeInheritanceTest {
    public static void main(String[] args) {
        // สร้างพนักงานประเภทต่าง ๆ
        ArrayList<Employee> employees = new ArrayList<>();

        // สร้างพนักงานประจำ
        employees.add(new PermanentEmployee("Somchai-Hankla", 25, "IT", 8, 20000));
        employees.add(new PermanentEmployee("Somsong-Bunthum", 22, "IT", 4, 12000));

        // สร้างพนักงานทำงานเป็นกะ
        employees.add(new HourlyEmployee("Manee-Dumkum", 21, "Production", 6, 25));
        employees.add(new HourlyEmployee("Piti-Rukthai", 25, "Production", 5, 30));
        employees.add(new HourlyEmployee("Veera-Rukdee", 30, "Production", 8, 20));

        // เรียกใช้งานเมธอด printMonthlyPaymentSlip
        printMonthlyPaymentSlip(employees);
    }

    // เมธอดพิมพ์ Slip ของค่าตอบแทนรายเดือน
    public static void printMonthlyPaymentSlip(ArrayList<Employee> employees) {
        for (Employee emp : employees) {
            System.out.println("*************************************************");
            System.out.printf("         Payment Slip of %s-%s\n", emp.getFirstName().toUpperCase(), emp.getLastName().toUpperCase());
            System.out.println("*************************************************");
            // การพิมพ์ข้อมูลพนักงาน
            System.out.printf("First Name : %-10s", emp.getFirstName());
            System.out.printf("Last Name : %-10s\n", emp.getLastName());

            System.out.printf("Department : %-17s", emp.getDepartment());
            System.out.printf("Age : %-3d\n", emp.getAge());

            // การพิมพ์ค่าตอบแทนรายเดือน
            System.out.printf("Monthly Payment: %-1.2f baht", emp.getMonthlyPayment());

            // ตรวจสอบว่าเป็นประเภท PermanentEmployee หรือไม่
            if (emp instanceof PermanentEmployee) {
                PermanentEmployee pe = (PermanentEmployee) emp;
                double socialSecurity = Math.min(pe.getSalary() * 0.05, 750.0);
                System.out.printf("  Social Security: %-1.2f baht", socialSecurity);  // พิมพ์ค่าประกันสังคม
            }

            System.out.println("\n\n");

        }
    }
}
