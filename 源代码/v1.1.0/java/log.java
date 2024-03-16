package lrr.java;

import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.*;
public class log extends Thread {
    private String Error = "[BUG!]";
    private String error = "[ERROR]";
    private String warn = "[WARN]";
    private String info = "[INFO]";
    private String debug = "[DERBUG]";
    public static void log() {
        //获取时间戳并进行分割处理
        String $croute = date();
        String[] $arr = $croute.split(" ");
        //创建文件对象
        File log = new File("../lrr/log/", $arr[0] + "LOG.log");
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

    public static void GetBroadcasts() {
        int port = 54188;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    public static void temp(){
        String $c=;
        File log=new File("../lrr/temp/",);
        if(log.exists()){

        }
    }*/
    public void run(){
        lrr.java.log.log();
    }
}

