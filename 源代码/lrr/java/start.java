package lrr.java;

public class start {
    public static void main(String[] args) {
        System.out.println("Minecraft正在初始化");
        int seed = def.seed(1000000000,2147483647);
        int[] arr=def.splitInteger(seed);
        String Generate = def.Generate(arr);
        System.out.println(Generate);
        System.out.println("Minecraft初始化完毕正在加载地形");
        System.out.println();
    }
}
