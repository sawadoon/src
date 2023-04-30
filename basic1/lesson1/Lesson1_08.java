package basic1.lesson1;

/**
 * Lesson1_08 定数
 * 
 * 定数は一度宣言すると、値を変更(上書き)することができない。
 * 
 * 定数の宣言は、変数の宣言とほぼ同じだが、以下の点が異なる。
 * (1) 先頭に「final」というキーワードを付与する
 * (2) すべて大文字
 * (3) 区切りをアンダースコア(_)で結合する
 * 
 * (2)のルールは大文字でなければエラーが出る、というわけではないが、
 * Javaプログラムを書く上でのルールとして覚えておくこと！
 * 
 * ( ..)φ_ついでに、、
 * 他にも以下のようなルールがある。
 * 
 * ・クラス名 -> 先頭を大文字、それ以外は小文字、区切りは大文字
 * 　ex) LessonJava
 * 
 * ・メソッド名 -> 先頭を小文字、以降も小文字、ただし区切りは大文字
 * 　ex) lessonJava
 * 
 * ・変数 -> すべて小文字、区切りは大文字
 * 　ex) userName, resultValue, phoneNumber
 * 
 */

public class Lesson1_08 {

    // double型の定数を宣言する。定数名は「PI」、値は「3.1415926」 (static の意味はまだ気にしなくて大丈夫)
    static final double PI = 3.1415926;

    public static void main(String[] args) {

        // (見)定数PI の値を上書きしようとすると、エラーとなることをコメントアウトを外して確認してみてください。
        // PI = 3.14;

        // boolean型の定数を宣言する。定数名は「LESSON_FLG」、値は「true」
        final boolean LESSON_FLG = true;

        // (見)定数LESSON_FLG の値を上書きしようとすると、エラーとなることをコメントアウトを外して確認してみてください。
        // LESSON_FLG = false;


        System.out.println("円周率は" + PI + "です。");
        System.out.print("私はJavaの学習をしていますか?");
        System.out.println(LESSON_FLG);
    }
}
