package helloWorld;
import java.io.*;//导入io包
public class StreamInTest{
	public static void main(String[] args) {
        String str;
        //创建标准输入流对象stdin来接收键盘System.in输入
        InputStreamReader stdin =new InputStreamReader(System.in);
        //以缓冲流模式来接收stdin
        BufferedReader bufin=new BufferedReader(stdin);
        //使用try,catch机制来处理输入异常
        try{
            System.out.print("input char");
            //用str字符串对象来接收键盘输入的一行数据
            str= bufin.readLine();
            System.out.println("你输入的字符串为："+str);
        }catch(Exception e){
            System.err.println("发生I/O错误");
            e.printStackTrace();
        }
    }
}