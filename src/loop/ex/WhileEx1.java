package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int count = 1;

//        while(count <= 10) {
//            System.out.println(count);
//            count++;
//        }

        for(int i = 1; count <= 10; i++) {
            System.out.println(count);
            count++;
        }
    }
}
