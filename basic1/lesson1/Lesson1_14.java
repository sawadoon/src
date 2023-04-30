package basic1.lesson1;

public class Lesson1_14 {
    public static void main(String[] args) {
        boolean flg = true;

        if (flg==true) {
            flg = false;
        }
        System.out.println(flg);

        int a = 10;
        int b = 10;
        flg = (a==b);
        System.out.println(flg);
    }
}
