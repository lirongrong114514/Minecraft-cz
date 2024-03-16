package lrr.java;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Thread;
public class log{
    public static void logNoError(String info,int level){
        try {
            log.log(info, level);
        } catch (Exception e) {
            info="日志系统出现错误";
            level=1;
            try {
                log.log(info,level);
            } catch (IOException ex) {
            }
        }
    }
    public static void loger() {
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
    public static String date() {
        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        return sd;
    }
    public static void log(String info,int level) throws IOException {
        //日志事件等级
        String Bug = "[BUG!]";
        String Error = "[ERROR]";
        String Warn = "[WARN]";
        String Info = "[INFO]";
        String Debug = "[DERBUG]";

        log.loger();
        //等级数字
        int levels;
        //根据等级数字判断日志等级
        String leveles;
        //最终写入信息
        String infos;
            try {
                //获取时间戳并进行分割处理
                String date=log.date();
                String[] $arr = date.split(" ");
                date=$arr[0];
                String lujing="../lrr/log/"+date+"LOG.log";
                File log=new File("../lrr/log",date+"LOG.log");
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
                OutputStream writer = new FileOutputStream(lujing,true);
                if(level==1){
                    levels=1;
                    leveles=Bug;
                    infos=api.time()+leveles+info;
                    writer.write(infos.getBytes());
                    writer.write('\n');
                } else if (level==2) {
                    levels=2;
                    leveles=Error;
                    infos=api.time()+leveles+info;
                    writer.write(infos.getBytes());
                    writer.write('\n');
                } else if (level==3) {
                    levels=3;
                    leveles=Warn;
                    infos=api.time()+leveles+info;
                    writer.write(infos.getBytes());
                    writer.write('\n');
                } else if (level==4) {
                    levels=4;
                    leveles=Info;
                    infos=api.time()+leveles+info;
                    writer.write(infos.getBytes());
                    writer.write('\n');
                } else if (level==5) {
                    levels=5;
                    leveles=Debug;
                    infos=api.time()+leveles+info;
                    writer.write(infos.getBytes());
                    writer.write('\n');
                }

            }catch (IOException e){
                System.out.println("日志系统出现未知错误！！！");
                e.printStackTrace();
                System.gc();
                System.exit(105);
            }
    }
}
