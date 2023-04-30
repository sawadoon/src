package basic1.lesson1;

/**
 * Lesson1_04 変数 「3 データ型」
 * 
 * Javaで扱う値には全て「データ型」と呼ばれる型がある。
 * (Lesson1_02 で記載したint型、String型、boolean型など、、)
 * 
 * ex)
 * 「1000」 -> int型のデータ
 * 「"1000"」(ダブルクォーテーションで囲ったもの) -> String型のデータ
 * 「true」「false」 -> boolean型のデータ
 * 
 * 他にも、何もないことを表す「null」という特別なモノも存在する。
 * 
 */

public class Lesson1_04 {

    public static void main(String[] args) {

        // (問題)「1000」のデータ型は何でしょう?? int型?? String型??

        // (見)コメントアウトを外して確認してみてください。
        int x = 1000;
        // String y = 1000;

        // (記)上記の変数を出力してください。
        System.out.println(x);
        // System.out.println(y);


        // (問題)エラーが出てしまった方のデータ型で「1000」を出力するには??

        // (記)エラーにならないように変数に代入し、出力してください。
        String y = "1000";
        System.out.println(y);


        // (参考)double型
        double z = 1000;
        System.out.println(z);
    }
}
