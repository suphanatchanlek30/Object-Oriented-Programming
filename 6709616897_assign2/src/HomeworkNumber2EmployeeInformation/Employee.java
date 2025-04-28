package HomeworkNumber2EmployeeInformation;

public abstract class Employee {
    private String fullName;
    private int age;
    private String department;
    private int performanceScore;

    // Constructor สำหรับการสร้างวัตถุ Employee
    public Employee(String fullName, int age, String department, int performanceScore) {
        this.fullName = fullName;
        this.age = age;
        this.department = department;
        this.performanceScore = performanceScore;
    }

    // Getter และ Setter สำหรับการดึงข้อมูลและตั้งค่า
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        this.performanceScore = performanceScore;
    }

    // เมธอด abstract สำหรับคำนวณเงินค่าตอบแทนรายเดือนของพนักงาน ซึ่งแต่ละประเภทจะมีการคำนวณต่างกัน
    public abstract double getMonthlyPayment();

    // เมธอดสำหรับดึงชื่อจริงจาก fullName (แยกจากชื่อ-นามสกุล)
    public String getFirstName() {
        return fullName.split("-")[0];
    }

    // เมธอดสำหรับดึงนามสกุลจาก fullName (แยกจากชื่อ-นามสกุล)
    public String getLastName() {
        return fullName.split("-")[1];
    }
}
