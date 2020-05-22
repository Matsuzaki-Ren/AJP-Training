import java.util.*;
import java.util.jar.*;

public class S3dBean {
    public static void main(String[] args) {

    Name id = new Name();
    id.setName("agilejp"); 
    
    Name name = new Name();
    name.setName("松﨑廉");
    
    Name pass = new Name();
    pass.setName("agile702");
    
    Date birth = new Date();
    birth.setDate("1996年10月31日");
    
    Age age = new Age();
    age.setAge(23);
    
    System.out.println(id.getName()); 
    System.out.println(name.getName());
    System.out.println(pass.getName());
    System.out.println(birth.getDate());
    System.out.println(age.getAge());

    }
    
    
    public class Name{
     
    private String name; 
    
    Name(){}; 
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
    
}

public class Age{
    
    private int age;
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class Date{
    
    private String birth;
    
    Date(){}; 
    
    public String getDate() {
        return birth;
    }
    public void setDate(String birth) {
        this.birth = birth;
    }
}