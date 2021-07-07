import java. util.*;
public class Stage2E{
    public static void main(String[] args){
        //文字列変数fruitsを宣言
        String fruits = "apple/orrange/apple/grape/orrange";
        //配列変数fruitsnameに変換
        String[] fruitsname = fruits.split("/", 0);
        List<String> fruitsList = new ArrayList<>();
        //文字列の長さを取得する
         for (int i = 0; fruitsname.length > i ; i++){
             //文字列の中にfruitsnameの文字が存在するかを確認(文字列の1番目と同じもの)
             if (!fruitsList.contains(fruitsname[i])){
                 //文字列の中にfruitsnameの文字が存在するかを確認(文字列の2番目と同じもの)
                 for (int n = i + 1; fruitsname.length > n; n++){
                     if (fruitsname[i].equals(fruitsname[n])){
                         fruitsList.add(fruitsname[i]);
                         System.out.println(i + 1 + ":" + fruitsname[i]);
                         
                     }
                 }
             }
         }
    }
}
 