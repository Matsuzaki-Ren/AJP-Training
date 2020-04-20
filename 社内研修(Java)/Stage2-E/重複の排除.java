import java. util.*;
public class Hello7{
    public static void main(String[] args){
        //文字列変数fruitsを宣言。
        String fruits = "apple/orrange/apple/grape/orrange";
        //splitを使用し分割する。
        String[] fruitsname = fruits.split("/", 0);
        List<String> fruitsList = new ArrayList<>();
         for (int i = 0; fruitsname.length > i ; i++){
             if (!fruitsList.contains(fruitsname[i])){
                 for (int n = i + 1; fruitsname.length > n; n++){
                     if (fruitsname[i].equals(fruitsname[n])){
                         fruitsList.add(fruitsname[i]);
                         System.out.println(fruitsname[i]);
                         
                     }
                 }
             }
         }
    }
}