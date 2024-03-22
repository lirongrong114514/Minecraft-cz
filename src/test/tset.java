package src.test;


import java.io.IOException;

/**
 * 测试获取可用端口
 */
public class tset {
    public static void main(String[] args) {
        int i= 0;
        try {
            i = src.java.api.getUsablePort(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(i);
    }
}
