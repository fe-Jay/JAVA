package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO member = new MemberDTO();

        member.name = "jay";
        member.age = 12;




        System.out.println(member.age + member.name);
    }
}
