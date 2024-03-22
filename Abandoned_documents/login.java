package lrr.java;

import java.util.Arrays;
import java.util.Scanner;

public class login {
    //登录类
    public class Login{
        //获取用户名方法
        private static String username(){
            Scanner $=new Scanner(System.in);
            String name=$.nextLine();
            return name;
        }
        //获取密码方法
        private static String password(){
            Scanner $=new Scanner(System.in);
            String password=$.nextLine();
            return password;
        }
        //将用户名和密码合并为数组
        public static String[] _return(){
            String[] username={"",""};
            username[0]=Login.username();
            username[1]=Login.password();
            return username;
        }
        //测试方法
        public static void  _return_(){
            String[] username={"",""};
            username[0]=Login.username();
            username[1]=Login.password();
            System.out.println(Arrays.toString(username));
        }
        public static void _print(){
            Login._return_();
        }
        public static boolean If(){
            String[] acc=_return();
            String[] abc= {"lrr","11"};
            if(!Arrays.toString(acc).equals(Arrays.toString(abc))){
                return false;
            }
            return true;
        }
    }
}
