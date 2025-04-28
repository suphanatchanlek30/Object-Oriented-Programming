package HomeworkNumber2EmployeeInformation;

public class HourlyEmployee extends Employee {
    private static final double MIN_HOURLY_WAGE_RATE = 50.0;  // ค่าจ้างรายชั่วโมงขั้นต่ำ
    private int workingSessionsPerMonth;  // จำนวนกะที่ทำงานต่อเดือน

    // Constructor
    public HourlyEmployee(String fullName, int age, String department, int performanceScore, int workingSessionsPerMonth) {
        super(fullName, age, department, performanceScore);
        this.workingSessionsPerMonth = workingSessionsPerMonth;
    }

    // เมธอดคำนวณค่าจ้างรายชั่วโมงที่แตกต่างกันตามค่าประสิทธิภาพการทำงาน
    private double calculatePersonalHourlyWage() {
        double hourlyWage = MIN_HOURLY_WAGE_RATE;
        if (getPerformanceScore() > 5) {
            // ถ้าค่าประสิทธิภาพการทำงานมากกว่า 5 จะได้ค่าจ้างเพิ่มขึ้น 10% ของค่าจ้างขั้นต่ำ
            hourlyWage += (getPerformanceScore() - 5) * 0.1 * MIN_HOURLY_WAGE_RATE;
        }
        return hourlyWage; // คืนค่าจ้างรายชั่วโมง
    }

    @Override
    public double getMonthlyPayment() {
        double hourlyWage = calculatePersonalHourlyWage(); // คำนวณค่าจ้างรายชั่วโมง
        return hourlyWage * 8 * workingSessionsPerMonth; // คำนวณเงินค่าตอบแทนรายเดือน (8 ชั่วโมงต่อกะ)
    }
}
