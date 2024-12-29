package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO(
                "jay", 100, "010-1234-5678"
        );

        vo.setName("Jay");
        vo.setAge(100);
        vo.setPhone("010-1234-5678");

        System.out.println("vo = " + vo);
    }
}
