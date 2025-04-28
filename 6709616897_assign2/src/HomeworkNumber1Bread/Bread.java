package HomeworkNumber1Bread;

public class Bread implements Toastable {
    // กำหนดค่าคงที่สำหรับสถานะของขนมปัง
    public static final String BURNT = "Burnt";
    public static final String CRISP = "Crisp";
    public static final String SOFT = "Soft";

    // ตัวแปรเพื่อเก็บสถานะของขนมปัง
    private String state;

    // Constructor ที่ใช้สำหรับการสร้างขนมปังโดยเริ่มต้นสถานะเป็น SOFT
    public Bread() {
        state = SOFT;
    }

    // เมธอดตั้งสถานะของขนมปัง (ถ้าอยากเปลี่ยนสถานะเป็นอย่างอื่น)
    public void setState(String state) {
        this.state = state;
    }

    // เมธอดคืนค่าสถานะปัจจุบันของขนมปัง
    public String getState() {
        return state;
    }

    // เมธอดสำหรับการปิ้งขนมปังโดยการเปลี่ยนสถานะ
    @Override
    public void toast() {
        if (state.equals(SOFT)) {
            // ถ้าสถานะเป็น SOFT จะเปลี่ยนเป็น CRISP
            state = CRISP;
        }
        else if (state.equals(CRISP)) {
            // ถ้าสถานะเป็น CRISP จะเปลี่ยนเป็น BURNT
            state = BURNT;
        }
    }

    // เมธอดคืนค่าสถานะของขนมปังในรูปแบบสตริง
    @Override
    public String getToastState() {
        return state;
    }

    // เมธอด toString เพื่อแสดงผลสถานะของขนมปัง
    @Override
    public String toString() {
        return "Bread is now: " + state;
    }
}
