package lrr.java;
import java.util.Scanner;
import static java.lang.System.exit;

public class start {
    public static void main(String[] args) {
        System.out.println("请登录!");
        BQ:if(login.Login.If()){
            System.out.println("Minecraft正在初始化");
            int seed;
            System.out.println("请问是否生成随机种子y/n?");
            Scanner _q_ = new Scanner(System.in);
            String __ass__ = _q_.nextLine();
            if(__ass__.equals("n")) {
                seed=def.input();
            }else {
                seed = def.seed(1000000000,2147483647);
            }
            System.out.println("Minecraft初始化完毕正在生成地形");
            int[] arr=def.splitInteger(seed);
            String Generate = def.Generate(arr);
            System.out.println("地形生成完毕"+Generate);
            System.out.println("正在加载地形");
        }else {
            System.out.println("账号或密码错误！程序结束");
            System.exit(130);
        }
    }
}
