import java.text.SimpleDateFormat;
import java.util.Calendar;
 
public class Stage2H {
 
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        
        System.out.println("20秒カウントスタート");
 
        // 時刻を表示
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(cl.getTime())); 
    
        
        // 20秒になるまで続ける
        for (int i = 1; i <= 20; i++){
        
          // 1秒加算する
        cl.add(Calendar.SECOND, 1);
        
        System.out.println(sdf.format(cl.getTime()));}
        
        System.out.println("20秒カウント終わりました");
    }
 
}