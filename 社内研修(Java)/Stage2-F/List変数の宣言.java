import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Hello8{
    public static void main(String[] args){
        List<String> week = new ArrayList<>();
       
        week.add("monday");
        week.add("tuesday");
        week.add("wednesday");
        week.add("thursday");
        week.add("friday");
        week.add("saturday");
        week.add("sunday");
        for(Iterator it = week.iterator(); it.hasNext();)
        System.out.println(it.next());
        
    }
}

