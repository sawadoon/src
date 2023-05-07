package basic1.lesson1;

/**
 * Lesson1_15 制御構造 「4 if文(4) equalsメソッド、null」
 * 
 * if文で、文字列を比較する時は、「==」ではなく「equalsメソッド」を使用する。
 * 
 * 例えば、
 *      String str1 = "マリオ";
 *      String str2 = "ワリオ";
 * とする時、str1とstr2が等しいかどうかを比較するには
 *      str1.equals(str2)
 * というように記述する。
 * 
 * ※なぜ「str1==str2」ではだめなのか、というのはややこしいので、
 * 　一旦そういうものなんだ、としておいてください、、
 * 
 * 〜〜話は変わりまして〜〜
 * 
 * nullかどうかのif文を書く時は、「==」を使用すればよい。
 * 
 */

public class Lesson1_15 {

    public static void main(String[] args) {

        // String型の変数str1を宣言して「"あ"」を代入。
        String str1 = "あ";

        // 変数str1の値を、コンソールに出力。
        System.out.println(str1);

        // (記)変数str1が「"あ"」の場合、変数str1に「"い"」を代入するif文を書いてください。
        if (str1=="あ") {
            str1 = "い";
        }

        // 変数str1の値を、コンソールに出力。
        System.out.println(str1);

        // String型の変数str2を宣言して「null」を代入。
        String str2 = null;

        // (記)変数str2が「null」の場合、変数str2の値をコンソールに出力するif文を書いてください。
        if (str2==null) {
            System.out.println(str2);
        }
    }
}
