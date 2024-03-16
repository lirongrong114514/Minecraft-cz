package lrr.java;
public class def {
    //生成十位整数种子
    public static int seed(int begin, int end) {
        int between = end - begin;
        double random = Math.random();
        int randomBetween = new Double(random * between).intValue();
        int result = begin + randomBetween;
        return result;
    }
    //将种子转为数组以根据种子生成地形
    public static int[] splitInteger(int seed){
        String str=Integer.toString(seed);
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }
        return arr;
    }
    public static String Generate(int[] seed){
        String a,b,c,d,f;
        if(seed[0]==1){
            a="出生在海洋";
        }else if(seed[0]==2){
            a="出生在陆地";
        }else {
            a="出生失败";
        }
        if(seed[1]==0){
            b="的温带海洋";
        } else if (seed[1] == 1) {
            b="的热带海洋";
        }else {
            b="的寒带海洋";
        }
        String terrain=a+b;
        return terrain;
    }
}
