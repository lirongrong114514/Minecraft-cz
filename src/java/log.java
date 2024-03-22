package src.java;

import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

public class log{
    //初始化方法
    public static void initlog() {
        //获取时间戳并进行分割处理
        String $croute = date();
        String[] $arr = $croute.split(" ");
        //创建文件对象
        File log = new File("../src/log/", $arr[0] + "LOG.log");
        //判断文件是否存在
        if (log.exists()) {
        } else {
            //没有则创建
            try {
                log.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //转换时间戳
    public static String date() {
        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        return sd;
    }

    public static void GetBroadcasts() throws IOException {
        int port;
        port=api.getUsablePort(1);
        ServerSocket serverSocket = new ServerSocket(port);
        String $$$aaa = Integer.toString(port);
        File $$log = new File("../src/temp",$$$aaa);
        $$log.createNewFile();
    }
    //TODO tempTEST
    /*
    public static void temp(){
        String $c=;
        File log=new File("../src/temp/",);
        if(log.exists()){
        }
    }
    */
    //报废代码
    /*
    public static void write(String info, int level) throws IOException{
        System.out.println("111");
        String $croute = date();
        String[] $arr = $croute.split(" ");
        File log = new File("../src/log/", $arr[0] + "LOG.log");
        FileWriter out= new FileWriter(log);
        String Bug = "[BUG!]";
        String Error = "[ERROR]";
        String Warn = "[WARN]";
        String Info = "[INFO]";
        String Debug = "[DERBUG]";
        if(level==1){
            try {
                info = $arr[0]+Bug+info;
                out.write(info);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (level==2) {
            try {
                info = $arr[0]+Error+info;
                out.write(info);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (level==3) {
            try {
                info = $arr[0]+Warn+info;
                out.write(info);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (level==4) {
            try {
                out.write(info);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (level==5) {
            try {
                info = $arr[0]+Debug+info;
                out.write(info);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    */
}
