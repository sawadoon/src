package basic1.lesson1;

/**
 * Lesson1_06 変数 「5 変数のスコープ」
 * 
 * 変数には「スコープ」と呼ばれる有効範囲(寿命のようなもの)がある。
 * 変数は宣言したブロック内でのみ使用可能。
 * 
 * このレッスンでは「スコープていうものがあるんだな」と頭に置いておいてもらうだけでOK！
 * 
 */

public class Lesson1_06 {

    public static void main(String[] args) {

        // int型の変数num1 を宣言。
        int num1 = 123;
        
        // この「if文」はまだ学習していないため、分からなくても気にしなくて大丈夫です！
        if(true) {
            // int型の変数num2 を宣言。
            int num2 = 456;

            // ここでは変数num1, num2 どちらも出力できる。
            System.out.println(num1);
            System.out.println(num2);
        }

        // 変数num1 は出力できる。
        System.out.println(num1);

        // 変数num2 は出力できずエラーとなる。
        // (見)コメントアウトを外して確認してみてください。
        // System.out.println(num2);
    }

}
