package src.java;

import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

public class log extends Thread{
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
    public void run() {
        int port;
        try {
            //获取可用端口
            port=api.getUsablePort(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ServerSocket serverSocket;
        try {
            //创建套接字
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String $$lj = (date().split(" "))[0];

        File file = new File("../src/log",$$lj+"LOG.log");
        String Bug = "[BUG!]";
        String Error = "[ERROR]";
        String Warn = "[WARN]";
        String Info = "[INFO]";
        String Debug = "[DERBUG]";
        while (true){
            Socket client;
            try {
                client = serverSocket.accept();
                //创建输入输出流
                InputStream inputStream = client.getInputStream();
                OutputStream outputStream = client.getOutputStream();
                //读取信息
                byte[] buffer = new byte[2048];
                if(buffer.equals(null)){
                    continue;
                }
                FileWriter writer = new FileWriter(file,true);
                //解析数据
                int bytesRead = inputStream.read(buffer);
                String $$msg = new String(buffer,0,bytesRead);
                //拆分数据
                String[] $$arr = $$msg.split(" ");
                String $msg = $$arr[1];

                //向客户端发送数据
                outputStream.write($msg.getBytes());

                String $level = $$arr[0];
                String level;
                String $i = date();
                String[] $$a = $i.split(" ");
                String time = $$a[1];
                //判断日志等级写入文件
                if($level=="1"){
                    level = Bug;
                    writer.write(time+level+$msg+'\n');
                } else if ($level=="2") {
                    level = Error;
                    writer.write(time+level+$msg+'\n');
                }else if($level=="3"){
                    level = Warn;
                    writer.write(time+level+$msg+'\n');
                } else if ($level=="4") {
                    level = Info;
                    writer.write(time+level+$msg+'\n');
                } else if ($level=="5") {
                    level = Debug;
                    writer.write(time+level+$msg+'\n');
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
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
