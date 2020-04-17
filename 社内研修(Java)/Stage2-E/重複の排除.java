import java. util.*;
public class Hello7{
    public static void main(String[] args){
        String fruits = "apple/orrange/apple/grape/orrange";
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