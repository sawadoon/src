package basic1.lesson1;

/**
 * Lesson1_10 演算子 「2 代入演算子」
 * 
 * ・代入演算子
 * 　変数に値を代入する。
 * 
 * ( ..)φ_int型の変数num に代入演算子を使っていろいろ代入してみよう。
 * 
 * numに「10」を代入。
 * num = 10;
 * 
 * numに「5」を足した値を代入。(num = num + 5; と同じ)
 * num += 5;
 * 
 * numから「5」を引いた値を代入。(num = num - 5; と同じ)
 * num -= 5;
 * 
 * numに「5」を掛けた値を代入。(num = num * 5; と同じ)
 * num *= 5;
 * 
 * numを「5」で割った値を代入。(num = num / 5; と同じ)
 * num /= 5;
 * 
 * numを「5」で割った値の余りを代入。(num = num % 5; と同じ)
 * num %= 5;
 * 
 */

public class Lesson1_10 {
    public static void main(String[] args) {

        // int型, Stringの変数を宣言。
        int a1 = 10;
        int a2 = 10;
        int a3 = 10;
        int a4 = 10;
        int a5 = 10;
        int a6 = 10;
        String a7 = "文字列も";

        // 代入演算子を使用して値を代入してみましょう。
        // (記)変数に20を代入。(上書き)
        a1 = 20;
        // (記)変数に「5」を足した値を代入。
        a2 += 5;
        // (記)変数から「5」を引いた値を代入。
        a3 -= 5;
        // (記)変数に「5」を掛けた値を代入。
        a4 *= 5;
        // (記)変数を「5」で割った値を代入。
        a5 /= 5;
        // (記)変数を「5」で割った値の余りを代入。
        a6 %= 5;
        // (記)文字列にも同じように使うことが可能。「"同じです。"」を結合してみよう。
        a7 += "同じです。";

        // 上記の変数をコンソールに出力。
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
    }
}
