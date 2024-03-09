package lrr.java;

import java.io.File;
import java.util.Scanner;
import java.util.*;
public class def {
    //手动输入种子方法
    public static int input() {
        System.out.println("请输入一个十位数以内种子：");
        byte __a__ = 0;
        int seed = 0;
        Scanner _seed_ = new Scanner(System.in);
        seed = _seed_.nextInt();
        __a__ = 1;
        return seed;
    }
    //生成十位整数种子
    public static int seed1(int begin, int end) {
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
    //根据种子生成地形
    public static String Generate(int[] seed){
        String a,b,c,d,f;
        int i= (int) (Math.random()*10);
        if(i<5){
            a="出生在海洋";
            if(seed[1]==0){
                b="的温带海洋";
            }else if(seed[1] == 1) {
                b="的热带海洋";
            }else{
                b = "的寒带海洋";
            }
        }else {
            a = "出生在陆地";
            switch (seed[1]) {
                case 0:
                    b = "的沙漠群系";
                    break;
                case 1:
                    b = "的高山群系";
                    break;
                case 2:
                    b = "的金合欢群系";
                    break;
                case 3:
                    b = "的热带雨林群系";
                    break;
                case 4:
                    b = "的高原山地群系";
                    break;
                case 5:
                    b = "的热带草原群系";
                    break;
                case 6:
                    b = "的粘土山群系";
                    break;
                case 7:
                    b = "的恶地群系";
                    break;
                case 8:
                    b = "的雪原群系";
                    break;
                case 9:
                    b = "的蘑菇岛群系";
                    break;
                default:
                    b = "的未知群系";
                    break;

            }
        }
        String terrain= a+b;
        return terrain;
    }
    public static int seed2() {
        //判断是否需要生成随机种子
        Scanner _q_ = new Scanner(System.in);
        String __ass__ = _q_.next();
        int seed;
        if (__ass__.equals("否")) {
            try {
                seed = def.input();
                System.out.println("seed:" + seed);
                return seed;
            } catch (Exception e) {
                e.printStackTrace();
                log.log();
                System.gc();
                System.exit(210);
            }
        } else {
            seed = def.seed1(1000000000, 2147483647);
            System.out.println("seed:" + seed);
            return seed;
        }
        //这行没用，废物代码但如果没用编译会出错
        return 1;
    }
}
