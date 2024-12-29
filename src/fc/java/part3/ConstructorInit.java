package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO person = new PersonVO(
                "jay", 100, "010-1234-5678"
        );

        System.out.println("person = " + person);
    }
}
