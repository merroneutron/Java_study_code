package helloWorld;
import java.io.*;//����io��
public class StreamInTest{
	public static void main(String[] args) {
        String str;
        //������׼����������stdin�����ռ���System.in����
        InputStreamReader stdin =new InputStreamReader(System.in);
        //�Ի�����ģʽ������stdin
        BufferedReader bufin=new BufferedReader(stdin);
        //ʹ��try,catch���������������쳣
        try{
            System.out.print("input char");
            //��str�ַ������������ռ��������һ������
            str= bufin.readLine();
            System.out.println("��������ַ���Ϊ��"+str);
        }catch(Exception e){
            System.err.println("����I/O����");
            e.printStackTrace();
        }
    }
}