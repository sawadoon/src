package basic1.lesson1;

/**
 * Lesson1_16 制御構造 「5 for文」
 * 
 * 初期化式，継続条件式，反復式をセミコロン（;）で区切る。
 * 
 *  for(int i = 0; i < 10; i++){
 *      iが0から9までこの処理を繰り返す
 *  }
 * 
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
