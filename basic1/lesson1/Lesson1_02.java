package basic1.lesson1;

/**
 * Lesson1_02 変数 「1 変数とは」
 * 
 * 変数とは、「データを入れるための箱」につけたラベルのようなもの。
 * ※とりあえずJavaⅠでは、
 * 　変数 = 値を入れる入れ物
 * 　と考えてもらえたらOKです！
 * 
 * 変数を使うには、変数を宣言する必要がある。
 * 変数の宣言は、「変数のデータ型 変数名;」の形式で行う。
 * 
 * ex1) int型の変数num を宣言して「1」を代入する場合
 * int num;
 * num = 1;
 * 
 * ex2) String型の変数str を宣言して「"あ"」を代入する場合
 * String str;
 * str = "あ";
 * 
 * また、変数の宣言と同時に値を代入することもできる。
 * その場合は、「変数のデータ型 変数名 = 変数に代入する値;」の形式で行う。
 * 
 * ex1+) int型の変数num を宣言して「1」を代入する場合
 * int num = 1;
 * 
 * ex2+) String型の変数str を宣言して「"あ"」を代入する場合
 * String str = "あ";
 * 
 */

public class Lesson1_02 {
    
    public static void main(String[] args) {

        // (記)int型の変数num を宣言して「123」を代入してください。
        int num;
        num = 123;
        // int num = 123;

        // (記)String型の変数str を宣言して「"文字列"」を代入してください。
        String str;
        str = "文字列";
        // String str = "文字列";

        // (記)boolean型の変数flg を宣言して「false」を代入してください。
        boolean flg;
        flg = false;
        // boolean flg = false;

        // (記)上記で宣言した変数num, str, flg の値を、それぞれコンソールに出力してください。
        System.out.println(num);
        System.out.println(str);
        System.out.println(flg);
    }
}
