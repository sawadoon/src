package basic1.lesson1;

/**
 * Lesson1_11 演算子 「3 インクリメント、デクリメント」
 * 
 * ・インクリメント演算子 ++
 * 　対象の値を1つ増やす。
 * 　変数value において、 以下の二つの式は同じ結果となる。
 * 　value++;
 * 　value = value + 1;
 * 
 * ・デクリメント演算子 --
 * 　対象の値を1つ減らす。
 * 　変数value において、 以下の二つの式は同じ結果となる。
 * 　value--;
 * 　value = value - 1;
 * 
 * 【補足】
 * これらは、演算の対象となる変数の前に置くか、後ろに置くかで意味合いが変わる。
 * (ややこしいのでとりあえず、Java1では深く考えずに後置してください。)
 * 
 */

public class Lesson1_11 {
    public static void main(String[] args) {

        // int型の変数a, bを宣言。
        int a = 10;
        int b = 10;

        // インクリメント
        a++;

        // デクリメント
        b--;

        // コンソールに出力。
        System.out.println(a);
        System.out.println(b);

        // インクリメントを3回してみる。
        a++;
        a++;
        a++;

        // どうなるかな?? コンソールに出力。
        System.out.println(a);
    }
}
