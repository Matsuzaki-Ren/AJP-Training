import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

 
public class Stage2GG {
 
    public static void main(String[] args) {
    //Listを初期化
     List<String> week = new ArrayList<String>();
         
                week.add("MONDAY");
                week.add("TUESDAY");
                week.add("WEDNESDAY");
                week.add("THURSDAY");
                week.add("FRIDAY");
                week.add("SATURDAY");
                week.add("SUNDAY");
         
     //Mapを初期化
       Map<String, String> map = new HashMap<>();
		map.put("MONDAY", "(月曜日)");
		map.put("TUESDAY", "(火曜日)");
		map.put("WEDNESDAY", "(水曜日)");
		map.put("THURSDAY", "(木曜日)");
		map.put("FRIDAY", "(金曜日)");
		map.put("SATURDAY", "(土曜日)");
		map.put("SUNDAY", "(日曜日)");
		
		Iterator entries = map.entrySet().iterator();
 
		while(entries.hasNext()){
		    
		     Map.Entry entry = (Map.Entry)entries.next();
		     
		     String keyName = (String)entry.getKey();
		     String valName = (String)entry.getValue();
             System.out.println(keyName + valName);
          
          //to今村さん 昇順にする方法はわかりませんでした。いったん提出させていただきますので、レビューにてご指摘お願い致します。
		}
    }
 
}