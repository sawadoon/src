package basic1.lesson1;

/**
 * Lesson1_05 変数 「4 型変換」
 * 
 * ・型変換
 * 変数を、宣言した時に定義した型とは別の型に変換すること。
 * 「暗黙的型変換」と「明示的型変換(キャスト)」がある。
 * 
 * 「暗黙的型変換」は明確に記述しなくても、代入や式中で行われる。
 * 代入の際に「=」記号の左辺の型と右辺の型が違う場合、左辺の型に変換される。
 * 
 * ex) double型の変数dbl にint型の値123 を代入
 * double dbl = 123;
 * 
 * ・キャスト
 * (データ型)変数名
 * 
 * ex) int型の変数num に double型の値1.23 をキャストして代入
 * int num = (int)1.23
 * 
 * ・String型からint型へ変換
 * int [変数名] = Integer.parseInt(<String型>);
 * 
 * ・String型からdouble型へ変換
 * double [変数名] = Double.parseDouble(<String型>);
 * 
 * ・int型からString型へ変換
 * String [変数名] = Integer.toString(<int型>);
 * 
 * ・double型からString型へ変換
 * String [変数名] = Double.toString(<double型>);
 */

public class Lesson1_05 {

    public static void main(String[] args) {

        // (記)double型の変数dbl を宣言し、int型の値である「113767」を代入してください。(キャストしない)
        double dbl = 113767;
        
        // (記)変数dbl の値を、コンソールに出力してください。
        System.out.println(dbl);


        // (記)int型の変数num を宣言し、double型の値である「3.14」をキャストして代入してください。
        int num = (int)3.14;
        
        // (記)変数num の値を、コンソールに出力してください。
        System.out.println(num);
        

        // (記)int型の変数を宣言し、String型の値である「"1000"」を、int型に型変換して代入してください。
        int x = Integer.parseInt("1000");
        
        // (記)上記で宣言したint型の変数の値を、コンソールに出力してください。
        System.out.println(x);

        
        // (記)String型の変数を宣言し、int型の値である「1000」を、String型に型変換して代入してください。
        String y = Integer.toString(1000);
        
        // (記)上記で宣言したString型の変数の値を、コンソールに出力してください。
        System.out.println(y);
    }
}
