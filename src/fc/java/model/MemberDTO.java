package fc.java.model;

public class MemberDTO {
    public String name;
    public int age;

    // 정보 은닉
    private String phone;

    public void setPhoneNumber(String phone) {
        this.phone = phone;
    }
}
