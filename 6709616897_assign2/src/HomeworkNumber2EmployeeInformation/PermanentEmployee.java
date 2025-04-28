package HomeworkNumber2EmployeeInformation;

public class PermanentEmployee extends Employee {
    private double salary;  // เงินเดือนประจำ

    // Constructor
    public PermanentEmployee(String fullName, int age, String department, int performanceScore, double salary) {
        super(fullName, age, department, performanceScore);
        this.salary = salary;
    }

    // เมธอดคำนวณเงินค่าตอบแทนรายเดือนหลังหักประกันสังคม
    @Override
    public double getMonthlyPayment() {
        // คำนวณเงินหักประกันสังคม (5% ของเงินเดือน แต่ไม่เกิน 750 บาท)
        double socialSecurity = Math.min(salary * 0.05, 750.0);

        // คำนวณโบนัสพิเศษ (3% ของเงินเดือน หากค่าประสิทธิภาพ >= 8)
        double bonus = getPerformanceScore() >= 8 ? salary * 0.03 : 0;

        // คำนวณเงินค่าตอบแทนสุดท้ายโดยหักประกันสังคมและเพิ่มโบนัส (ถ้ามี)
        return salary - socialSecurity + bonus;
    }

    // Getter และ Setter สำหรับเงินเดือน
    public double getSalary() {
        return salary; // คืนค่าเงินเดือน
    }

    public void setSalary(double salary) {
        this.salary = salary; // กำหนดค่าเงินเดือนใหม่
    }
}
