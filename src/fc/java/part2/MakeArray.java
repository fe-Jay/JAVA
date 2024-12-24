package fc.java.part2;

public class MakeArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        // a[0] = 1;
        // a[1] = 2;
        // a[2] = 3;
        // a[3] = 4;
        // a[4] = 5;
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.println("i = " + a[i]);
        }


        float[] f = new float[5]; // 길이 고정
        for (int i = 0; i < f.length; i++) {
            f[i] = i + 1;
            System.out.println("f[" + i + "] = " + f[i]);
        }


        Book b1, b2, b3;
        Book[] b = new Book[3]; // 책 3권을 저장

        for (int i = 0; i < b.length; i++) {
            b[i] = new Book();
            b[i].title = "title" + i;
            b[i].author = "author" + i;

            System.out.println(b[i].title + " " + b[i].author);
        }

    }
}
