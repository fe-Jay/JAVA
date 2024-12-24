package fc.java.part3;

import fc.java.model.CarDTO;

import fc.java.model.CarUtil;

public class CarUtilityTest {
    public static void main(String[] args) {
        int carSn = 1230;
        String carName = "Avante";
        int carPrice = 24000000;
        String carOwner = "jay";
        int carYear = 2023;
        String carType ="A";

        CarDTO car=new CarDTO();
        car.setCarSn(carSn);
        car.setCarName(carName);
        car.setCarPrice(carPrice);
        car.setCarOwner(carOwner);
        car.setCarYear(carYear);
        car.setCarType(carType);

        //  print 유틸리티 함수 호출
        CarUtil carUtil= new CarUtil();
        carUtil.carPrint(car);
    }
}
