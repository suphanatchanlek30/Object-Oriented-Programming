package HomeworkNumber1Bread;

public class Cookie implements Toastable{
    // กำหนดค่าคงที่สำหรับสถานะของขนมคุกกี้
    public static final String BURNT = "Burnt";
    public static final String CRISP = "Crisp";
    public static final String SOFT = "Soft";

    // ตัวแปรเพื่อเก็บสถานะของ Cookie
    private String state;

    // Constructor ที่ใช้สำหรับการสร้าง Cookie และเริ่มต้นสถานะเป็น SOFT
    public Cookie() {
        state = SOFT;
    }

    // เมธอดตั้งสถานะของคุกกี้ (ถ้าอยากเปลี่ยนสถานะเป็นอย่างอื่น)
    public void setState(String state) {
        this.state = state;
    }

    // เมธอดคืนค่าสถานะปัจจุบันของคุกกี้
    public String getState() {
        return state;
    }

    // เมธอดสำหรับการปิ้งคุกกี้โดยการเปลี่ยนสถานะ
    @Override
    public void toast() {
        if (state.equals(SOFT)) {
            // ถ้าสถานะเป็น SOFT จะเปลี่ยนเป็น CRISP
            state = CRISP;
        } else if (state.equals(CRISP)) {
            // ถ้าสถานะเป็น CRISP จะเปลี่ยนเป็น BURNT
            state = BURNT;
        }
    }

    // เมธอดคืนค่าสถานะของคุกกี้ในรูปแบบสตริง
    @Override
    public String getToastState() {
        return state;
    }

    // เมธอด toString เพื่อแสดงผลสถานะของคุกกี้
    @Override
    public String toString() {
        return "Cookie is now: " + state;
    }
}
