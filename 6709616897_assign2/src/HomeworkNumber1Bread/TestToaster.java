package HomeworkNumber1Bread;

public class TestToaster {
    public static void main(String[] args) {
        // สร้าง Toaster, Bread, และ Cookie
        Toaster t = new Toaster();
        Bread b = new Bread();
        Cookie c = new Cookie();

        // เพิ่ม Bread และ Cookie ลงใน Toaster
        t.add(b);
        t.add(c);

        // แสดงสถานะของไอเท็มทั้งหมดใน Toaster
        System.out.println("Before toasting:");
        t.print();

        // ปิ้ง Bread และ Cookie
        b.toast();
        c.toast();

        // แสดงสถานะหลังการปิ้ง
        System.out.println("\nAfter toasting:");
        t.print();
    }
}
