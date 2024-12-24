package fc.java.model;

public class CarDAO {
    public void carInsert(CarDTO car) {
        System.out.println("car 정보가 DB에 저장되었습니다.");
    }

    public void carSelect() {
        System.out.println("car 정보가 출력되었습니다.");
    }
}
