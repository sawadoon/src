package basic1.lesson1;

public class Lesson1_16 {
    public static void main(String[] args) {
        for(int i=0; i<6; i++) {
            System.out.println("やっほー");
        }

        String str = "＊";
        for(int i=0; i<10; i++) {
            System.out.println(str);
            str += "＊";
        }
    }
}
