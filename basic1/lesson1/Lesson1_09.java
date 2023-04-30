package basic1.lesson1;

/**
 * Lesson1_09 演算子 「1 算術演算子」
 * 
 * ・算術演算子
 * 　四則演算をはじめ、主に数学的な演算を行う記号。
 * 
 * ・足し算
 * 「+」 (プラス)
 * 
 * ・引き算
 * 「-」 (マイナス)
 * 
 * ・掛け算
 * 「*」 (アスタリスク)
 * 
 * ・割り算
 * 「/」 (スラッシュ)
 * 
 * ・割り算の余り
 * 「%」 (パーセント)
 * 
 * ・文字列の連結
 * 「+」 (プラス)
 * 
 */

public class Lesson1_09 {
    public static void main(String[] args) {

        // 変数を使用しなくても計算は可能。
        System.out.println(9+4); // 9+4=13
        System.out.println(9-4); // 9-4=5
        System.out.println(9*4); // 9*4=36
        System.out.println(9/4); // 9/4=2 (余り1)
        System.out.println(9%4); // 8を4で割った余りは1

        // int型の変数num1 を宣言。
        int num1 = ９;

        // int型の変数num2 を宣言。
        int num2 = 4;

        // num1 と num2 を使用して計算をしてみましょう。上記の計算と同じになればOK！
        // (記)足し算
        System.out.println(num1 + num2);
        // (記)引き算
        System.out.println(num1 - num2);
        // (記)掛け算
        System.out.println(num1 * num2);
        // (記)割り算
        System.out.println(num1 / num2);
        // (記)num1をnum2で割った余り
        System.out.println(num1 % num2);

        // String型の変数str1 を宣言。
        String str1 = "私は";

        // String型の変数str2 を宣言。
        String str2 = "30歳です。";

        // (記)str1 と str2 を結合して、コンソールに出力してください。
        System.out.println(str1 + str2);

        // int型の値とString型の値も結合可能。
        System.out.println(2023 + "年" + 5 + "月" + 10 + "日");
        System.out.println("令和" + 5 + "年");

        // 途中で計算も可能。
        System.out.println(5 + 30 + "年");

        // でも優先順位や結合規則というのがあるから、思ったように表示されないことも。
        System.out.println("今は平成" + 5 + 30 + "年");

        // そんな時は括弧を使ってみたらいいかも。(この話はまた時間があれば、、)
        System.out.println("今は平成" + (5 + 30) + "年");
    }
}
