package basic1.lesson1;

/**
 * Lesson1_13 制御構造 「2 if文(2) 代入」
 * 
 * if文が条件式を満たす場合(=true)に実行される処理は、
 * 変数への値の代入を行う処理も可能。
 * 
 */

public class Lesson1_13 {

    public static void main(String[] args) {

        // int型の変数a, b, cを宣言。
        // (変)変数の値を変えると、出力結果はどう変わるか確認してみましょう。
        int a = 10;
        int b = 10;
        int c = 20;
        
        // (記)変数aと変数bが同じ値の場合、変数aに変数cの値を代入するif文を書いてください。
        if (a==b) {
            a = c;
        }

        // 変数aの値を、コンソールに出力。
        System.out.println(a);
    }
}
