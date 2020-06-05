import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

 
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
       Map<String, String> map = new LinkedHashMap<>();
		map.put("MONDAY", "(月曜日)");
		map.put("TUESDAY", "(火曜日)");
		map.put("WEDNESDAY", "(水曜日)");
		map.put("THURSDAY", "(木曜日)");
		map.put("FRIDAY", "(金曜日)");
		map.put("SATURDAY", "(土曜日)");
		map.put("SUNDAY", "(日曜日)");
		
		//Iteratorを用いてmapの要素にアクセスする
		Iterator entries = map.entrySet().iterator();
        
        //mapに格納した要素を出力し終わるまでループ処理
		while(entries.hasNext()){
		    
		     Map.Entry entry = (Map.Entry)entries.next();
		     
		     //keyに格納したlistの要素を文字列で出力
		     String keyName = (String)entry.getKey();
		     //valueに格納した要素を文字列で出力
		     String valName = (String)entry.getValue();
		     //key→valueの順に出力する
             System.out.println(keyName + valName);
          
		}
    }
 
}