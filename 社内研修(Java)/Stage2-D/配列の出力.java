public class Hello5_2 {
    public static void main(String[] args){
        
        //文字列Sを宣言する
        String S = "orange/apple/cherry/grape/apple";
        //文字列SをHに変換する
        String H[] = S.split("/");
        //for文を用いて出力する文字列の長さを決める
        for(int i = 0; i < H.length; i++){
        System.out.println(i + 1 + ":" + H[i]);
        }
    }
}