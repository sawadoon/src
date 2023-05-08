package basic1.lesson1;

/**
 * Lesson1_16 制御構造 「5 for文」
 * 
 * for文は、Javaで繰り返し処理を行うための構文。
 * 
 * for (①初期化式; ②条件式; ④反復式) {
 *      // ③処理部
 * }
 * 
 * for文は、
 * ①初期化式->②条件式->③処理部->④反復式
 * ->②条件式->③処理部->④反復式->、、、
 * の順序で実行される。複雑なfor文でも、この流れは絶対に守られる。
 * 
 * ①初期化式 
 * 　for文が実行される際、最初に「1回だけ」実行。
 * 
 * ②条件式
 * 　繰り返し時に「毎回必ず実行」される。
 * 　 true -> ③処理部が実行、   false -> for文終了
 * 
 * ③処理部
 * 　②条件式がtrueの時のみ実行。for文の本体。
 * 
 * ④反復式
 * 　③処理部の処理が終わった時に必ず呼び出される。その後、②条件式が実行される。
 * 
 * 【ここが大切！】
 * ②条件式が「true」「false」のどちらであるかで、繰り返しが続くかどうか決まる。
 * 
 * 
 * ex) 以下のようにfor文は記述する。
 * for (int i=0; i<2; i++) {
 *      System.out.println(i);
 * }
 * 
 * ①初期化式　int i=0
 * ②条件式　　i<2
 * ③処理部　　System.out.println(i);
 * ④反復式　　i++
 * 
 */

public class Lesson1_16 {

    public static void main(String[] args) {

        // (記)コンソールに「"やっほー"」と6回出力してください。ただし、for文を使用すること。
        for(int i=0; i<6; i++) {
            System.out.println("やっほー" + (i+1) + "回目");
        }
        
        // (記)1行目は「＊」、2行目は「＊＊」、、、というように、順に「＊」を1つずつ増やしながら
        // 10行目までコンソールに出力してください。ただし、for文を使用すること。

        // やり方その1
        String str = "＊";
        for(int i=0; i<10; i++) {
            System.out.println(str + (i+1) + "行目");
            str += "＊";
        }

        // やり方その2
        for(int i=0; i<10; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print("＊" );
            }
            System.out.print((i+1) + "行目");
            System.out.println("");
        }

    }
}
