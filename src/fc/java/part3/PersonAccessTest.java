package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "jay";
        p.age = 10000;
        p.phone = "010-1234-1234";

        System.out.println(p.name + " " + p.age + " " + p.phone);
    }
}
