package src.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

import static src.java.log.date;
import static src.java.log.initlog;

/**
*游戏启动文件
*/

//启动线程
public class start{
    public static void main(String[] args) {
        //启动日志线程
        new log().start();
        TimeUnit.SECONDS(15);
    }
}

class run extends Thread{
    public void run() {
        System.out.println("Minecraft正在初始化");
        int seed;
        //初始化日志系统

        //初始化日志文件
        initlog();
        //TODO 继续写tcp链接还有bug没修
        // 创建TCP客户端并连接到服务器
        String serverAddress = "localhost";
        String $ii;
        try {
            //获取可用端口
            $ii = String.valueOf(api.getUsablePort(1));
            int serverPort = Integer.parseInt($ii);
            Socket clientSocket;
            clientSocket = new Socket(serverAddress, serverPort);
            OutputStream outputStream = null;
            outputStream = clientSocket.getOutputStream();
            String message = "5 TESTLOG";
            outputStream.write(message.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Minecraft初始化完毕正在生成地形");
        System.out.println("请问是否生成随机种子是/否?");
        seed = api.seed2();

        int[] arr = api.splitInteger(seed);
        String Generate = api.Generate(arr);
        System.out.println("地形生成完毕" + Generate);
        System.out.println("正在加载地形");
    }
}
