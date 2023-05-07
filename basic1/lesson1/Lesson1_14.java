package basic1.lesson1;

/**
 * Lesson1_14 制御構造 「3 if文(3) boolean型」
 * 
 * boolean型は「true」か「false」しか格納できない。
 * また、if文の条件式は、booleanだけを受け取る。
 * 【Lesson1_12の復習】
 * ・if~else
 * if(条件式) {
 *      // 条件式を満たす場合(=true)にのみ実行される処理
 * } else {
 *      // 条件式を満たさない場合(=false)にのみ実行される処理
 * }
 * 
 * ...上記のことを踏まえると、
 * 
 * if(true) {
 *      なにかしらの処理
 * }
 * 
 * というif文は条件式を満たすため、なにかしらの処理が実行される。
 * (Lesson1_06の途中で出てきたif文はこれです！)
 * 
 */

public class Lesson1_14 {

    public static void main(String[] args) {

        // boolean型の変数flgに「true」を代入。
        // (変)変数の値を変えると、出力結果はどう変わるか確認してみましょう。
        boolean flg = true;

        // (記)変数flgが「true」の場合、変数flgに「false」を代入するif文を書いてください。
        if (flg) {
            flg = false;
        }

        // 変数flgの値を、コンソールに出力。
        System.out.println(flg);

        // int型の変数a, bを宣言。
        // (変)変数の値を変えると、出力結果はどう変わるか確認してみましょう。
        int a = 10;
        int b = 10;

        // (記)変数flgに「a==b」の結果を代入してください。
        flg = (a==b);

        // 変数flgの値を、コンソールに出力。
        System.out.println(flg);
    }
}
