package HomeworkNumber1Bread;

import java.util.ArrayList;

public class Toaster {
    private ArrayList<Toastable> items; // ตัวแปรเพื่อเก็บรายการของ Toastable items (ขนมปัง, คุกกี้)

    // Constructor สำหรับการสร้าง Toaster และกำหนดให้ items เป็น ArrayList เปล่า
    public Toaster() {
        items = new ArrayList<>();
    }

    // เมธอด add เพื่อเพิ่มไอเท็มประเภท Toastable เข้าไปในรายการ items
    public void add(Toastable item) {
        items.add(item);
    }

    // เมธอด print สำหรับการแสดงผลสถานะของไอเท็มทั้งหมดในรายการ items
    public void print() {
        // ใช้ for-each loop เพื่อวนลูปแสดงผลของแต่ละไอเท็มในรายการ
        for (Toastable item : items) {
            System.out.println(item); // แสดงสถานะของไอเท็มใน ArrayList
        }
    }
}
