package lrr.java;

/**
*游戏启动文件
*/

//启动线程
public class start{
    public static void main(String[] args) {
        //启动主线程
        new run().start();
        //启动日志线程
        new log().start();
    }
}

class run extends Thread{
    public void run(){
        System.out.println("Minecraft正在初始化");
        int seed;
        System.out.println("请问是否生成随机种子是/否?");
        seed=def.seed2();
        System.out.println("Minecraft初始化完毕正在生成地形");
        int[] arr=def.splitInteger(seed);
        String Generate = def.Generate(arr);
        System.out.println("地形生成完毕"+Generate);
        System.out.println("正在加载地形");
    }
}
