package src.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;

import static src.java.log.date;

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

class run extends Thread{
    public void run() {
        System.out.println("Minecraft正在初始化");
        int seed;
        try {
            log.GetBroadcasts();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //TODO 继续写tcp链接还有bug没修
        // 创建TCP客户端并连接到服务器
        String serverAddress = "localhost";
        String $ii;
        try {
            $ii = String.valueOf(api.getUsablePort(1));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File $$ports = new File("../src/temp");
        File $ports = new File("../src/temp",$ii);
        String[] $filename = $$ports.list();
        int serverPort = Integer.parseInt($filename[0]);
        try {
            Socket clientSocket = new Socket(serverAddress, serverPort);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        $ports.delete();
        System.out.println("Minecraft初始化完毕正在生成地形");
        System.out.println("请问是否生成随机种子是/否?");
        seed = api.seed2();

        int[] arr = api.splitInteger(seed);
        String Generate = api.Generate(arr);
        System.out.println("地形生成完毕" + Generate);
        System.out.println("正在加载地形");
    }
}
