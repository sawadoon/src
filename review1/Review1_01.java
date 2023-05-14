package basic1.review1;

/**
 * Review1_01 Java1 の先週までの復習
 * 
 * 
 * 
 * 
 */

public class Review1_01 {

    public static void main(String[] args) {

        // 「20230515」という数値をコンソールに出力してください。
        // 数値はint型、「""(ダブルクォーテーション)」で囲む必要はない！


        // 「HelloWorld」という文字列をコンソールに出力してください。
        // 文字列はString型、「""(ダブルクォーテーション)」では囲おう！


        // これって何が違うのかな？コメントアウトを外して確認してみよう。
        // System.out.print("たんたんたぬき");
        // System.out.println("ぽんぽこりん");

        // 知ってました？同じ型ならこんなふうに1行でできます！
        int a = 1, b = 2, c = 3, d = 4, e = 5;

        // 算術演算子
        a = a + 2; // aに2を加える
        b = b - 1; // bから1を引く
        c = c * 3; // cに3をかける
        d = d / 2; // dを2で割る
        e = e % 2; // eに、eを2で割った余りを代入する
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // そういえば、「代入演算子」ってLesson1_10で学びましたね。
        // 上記の5つの計算を、代入演算子を使って結果が全く同じになるように書いてみよう！
        // +=

        // -=

        // *=

        // /=

        // %=

        // ちゃんと書けたかな？
        System.out.println("代入演算子");
        System.out.println("+= " + "a = " + a);
        System.out.println("-= " + "b = " + b);
        System.out.println("*= " + "c = " + c);
        System.out.println("/= " + "d = " + d);
        System.out.println("%= " + "e = " + e);

        /*
         * 比較演算子
         * 「>」 より大きい
         * ex) num > 0 (変数numが「0」より大きい場合)
         * 
         * 「>=」 以上
         * ex) num >= 0 (変数numが「0」以上の場合 ≒ 0は含む)
         * 
         * 「<」 より小さい
         * ex) num > 0 (変数numが「0」より小さい場合)
         * 
         * 「<=」 以下
         * ex) num <= 0 (変数numが「0」以下の場合 ≒ 0は含む)
         * 
         * 「==」 等しい
         * ex) num == 0 (変数numが「0」である場合)
         * 
         * 「!=」 等しくない
         * ex) num != 0 (変数numが「0」ではない場合)
         */

        /*
         * 論理演算子
         * 「&&」 論理積（ろんりせき） AND（アンド）
         * ex) a == 0 && b == 0 (変数aが「0」かつ、変数bが「0」の場合)
         * 
         * 「||」 論理和（ろんりわ） OR(オア)
         * ex) a == 0 | a == 1 (変数aが「0」か「1」の場合)
         * 
         * 「!」 否定（ひてい） NOT（ノット）
         * ex) !(a == 0) (「a==0」でない場合、真(true)となる)
         */


        /*
         * 乱数（でたらめな数）
         * ・0からn-1までの乱数を発生させる方法
         * (int)(Math.random()*n);
         * 
         * ・1からnまでの乱数を発生させる方法
         * (int)(Math.random()*n)+1;
         */

        // 以下のように書けば、1から6までの乱数を発生させられる！
        int num = (int)(Math.random()*6)+1;
        // コンソールに出力して確認してみよう。
        System.out.println("実行ごとに1〜6のいずれかの値が表示されます: " + num);
        // これって、サイコロを振った時に出た目、、というのをプログラム上で再現できてるのでは？

        



    }

}
