package fc.java.model;

public class CarUtil {
    public void carPrint(CarDTO carDTO) {
        System.out.println(
                carDTO.getCarSn() +
                carDTO.getCarName() +
                carDTO.getCarPrice()
        );
    }
}
