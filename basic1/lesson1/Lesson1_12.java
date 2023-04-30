package basic1.lesson1;

/**
 * Lesson1_12 制御構造 「1 if文(1)」
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
        int a = 10;
        int b = 10;
        int c = 20;

        if (a==b) {
            System.out.println("aとbは同じ値です。");
        }

        if (a==c) {
            System.out.println("aとcは同じ値です。");
        } else {
            System.out.println("aとcは異なる値です。");
        }

        if (a<b) {
            System.out.println("aとbより小さい値です。");
        } else if (a==b) {
            System.out.println("aとbは同じ値です。");
        } else {
            System.out.println("aとbより大きい値です。");
        }
    }
}
