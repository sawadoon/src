package basic1.lesson1;

/**
 * Lesson1_12 制御構造 「1 if文(1) if~else」
 * 
 * ・if文
 * if(条件式) {
 *      // 条件式を満たす場合(=true)にのみ実行される処理
 * }
 * 
 * ・if~else
 * if(条件式) {
 *      // 条件式を満たす場合(=true)にのみ実行される処理
 * } else {
 *      // 条件式を満たさない場合(=false)にのみ実行される処理
 * }
 * 
 * ・if~else if~else
 * if(条件式1) {
 *      // 条件式1を満たす場合(=true)にのみ実行される処理
 * } else if(条件式2) {
 *      // 条件式2を満たす場合(=true)にのみ実行される処理
 * } else {
 *      //すべての条件式を満たさない場合(=false)にのみ実行される処理
 * }
 * 
 */

public class Lesson1_12 {

    public static void main(String[] args) {

        // int型の変数a, b, cを宣言。
        // (変)変数の値を変えると、出力結果はどう変わるか確認してみましょう。
        int a = 10;
        int b = 10;
        int c = 20;

        // (記)変数aと変数bが同じ値の場合、コンソールに「"aとbは同じ値です。"」と出力するif文を書いてください。
        if (a==b) {
            System.out.println("aとbは同じ値です。");
        }

        // (記)変数aと変数cが同じ値の場合、コンソールに「"aとcは同じ値です。"」と出力し、
        // (記)変数aと変数cが異なる値の場合、コンソールに「"aとcは異なる値です。"」と出力するif文を書いてください。
        if (a==c) {
            System.out.println("aとcは同じ値です。");
        } else {
            System.out.println("aとcは異なる値です。");
        }

        // (記)変数aが変数bより小さい値の場合、コンソールに「"aはbより小さい値です。"」と出力し、
        // (記)変数aと変数bが同じ値の場合、コンソールに「"aとbは同じ値です。"」と出力し、
        // (記)それ以外(変数aが変数bより大きい値)の場合、コンソールに「"aはbより大きい値です。"」と出力するif文を書いてください。
        if (a<b) {
            System.out.println("aはbより小さい値です。");
        } else if (a==b) {
            System.out.println("aとbは同じ値です。");
        } else {
            System.out.println("aはbより大きい値です。");
        }
    }
}
