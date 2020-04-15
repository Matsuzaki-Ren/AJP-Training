public class Hello55 {
    public static void main(String[] args){
        String S = "orange/apple/cherry/grape/apple";
        String H[] = S.split("/");
        for(int i = 1; i < H.length; i++){
        System.out.println(i + ":" + H[i]);
        }
    }
}