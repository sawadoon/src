package basic1.lesson1;

/**
 * Lesson1_17 制御構造 「6 while文」
 * 
 * 繰り返しを記述するための基本的な文法がwhile文。
 * 
 * 
 */

public class Lesson1_17 {

    public static void main(String[] args) {

        // (記)コンソールに「"やっほー"」と6回出力してください。ただし、while文を使用すること。
        int i = 0;
        while(i < 6) {
            System.out.println("やっほー" + (i+1) + "回目");
            i++;
        }

        // (記)1行目は「＊」、2行目は「＊＊」、、、というように、順に「＊」を1つずつ増やしながら
        // 10行目までコンソールに出力してください。ただし、for文は使用しないこと。

        // やり方その1
        i = 0;
        String str = "＊";
        while (i < 10) {
            System.out.println(str + (i+1) + "行目");
            str += "＊";
            i++;
        }

        // やり方その2
        i = 0;
        while (i < 10) {
            int j =0;
            while (j < i+1) {
                System.out.print("＊");
                j++;
            }
            System.out.print((i+1) + "行目");
            System.out.println("");
            i ++;
        }

    
    }
}
