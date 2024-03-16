package lrr.java;

import java.io.IOException;
import java.net.*;
import java.io.*;

import static lrr.java.log.logNoError;

/**
*游戏启动文件
*/

//启动线程
public class start{
    public static void main(String[] args) {
        //启动主线程
        new run().start();
    }
}

class run extends Thread {
    public void run() {
        System.out.println("Minecraft正在初始化");
        int seed;
        int level;
        String info;
        info = "初始化";
        level = 4;
        logNoError(info,level);
        System.out.println("请问是否生成随机种子是/否?");
        seed = api.seed2();
        info = Integer.toString(seed);
        info="seed:"+info;
        level = 4;
        logNoError(info,level);
        System.out.println("Minecraft初始化完毕正在生成地形");
        int[] arr = api.splitInteger(seed);
        String Generate = api.Generate(arr);
        System.out.println("地形生成完毕" + Generate);
        System.out.println("正在加载地形");
        info = Generate;
        level = 4;
        logNoError(info,level);
        info="加载地形";
        level=4;
        logNoError(info,level);
    }
}
