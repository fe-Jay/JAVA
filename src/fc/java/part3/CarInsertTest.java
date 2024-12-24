package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarDAO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("자동차 일련번호: ");
        int carSn = scan.nextInt();

        scan.nextLine(); // 줄바꿈 처리

        System.out.print("자동차 이름: ");
        String carName = scan.nextLine();

        System.out.print("자동차 가격: ");
        int carPrice = scan.nextInt();

        scan.nextLine(); // 줄바꿈 처리

        System.out.print("자동차 소유자: ");
        String carOwner = scan.nextLine();

        System.out.print("자동차 연식: ");
        int carYear = scan.nextInt();

        scan.nextLine(); // 줄바꿈 처리

        System.out.print("자동차 타입: ");
        String carType = scan.nextLine();

        CarDTO car = new CarDTO();
        car.setCarSn(carSn);
        car.setCarName(carName);
        car.setCarPrice(carPrice);
        car.setCarOwner(carOwner);
        car.setCarYear(carYear);
        car.setCarType(carType);

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        scan.close();

        dao.carSelect();
    }
}
