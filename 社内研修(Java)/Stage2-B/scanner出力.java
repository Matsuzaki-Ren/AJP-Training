import java. util. Scanner;
class hello3 {
    public static void main (String args[]){
        Scanner scanner =new Scanner(System.in);
        String str;
        str = "おつかれさまです";
        String str2 = str. substring(0,1);
        String str3 = str. substring(7,8);
        System.out.println("入力された値は{" + str + "}です");
        System.out.println("桁数{" +str.length() + "}" );
        System.out.println("頭文字：{" +str2+ "}");
        System.out.println("語尾：{" +str3+ "}");
    }
}