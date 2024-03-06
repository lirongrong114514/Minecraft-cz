package lrr.java;
import java.util.Scanner;
import static java.lang.System.exit;
import java.swing.*;
public class start extends JFeram{
    public static void main(String[] args) {
        System.out.println("Minecraft正在初始化");
        int seed;
            System.out.println("请问是否生成随机种子y/n?");
            Scanner _q_ = new Scanner(System.in);
            String __ass__ = _q_.nextLine();
            if(__ass__.equals("n")) {
                try{
                    seed=def.input();
                }catch(){
                    System.exit(130);
                }
            }else {
                seed = def.seed(1000000000,2147483647);
            }
        System.out.println("Minecraft初始化完毕正在生成地形");
        int[] arr=def.splitInteger(seed);
        String Generate = def.Generate(arr);
        System.out.println("地形生成完毕"+Generate);
        System.out.println("正在加载地形");
    }
}
