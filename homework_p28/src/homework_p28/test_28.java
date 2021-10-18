package homework_p28;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class test_28
{
	public static void main(String[] args)throws IOException 
	{
		System.out.println("請輸入學號");
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		String str1=br1.readLine();
		int num=Integer.parseInt(str1);
		System.out.println("您輸入的學號是:"+num); 
		System.out.println("請輸入字串"); 
		BufferedReader br2 =
				new BufferedReader(new InputStreamReader(System.in));
		String str2=br2.readLine(); 
		System.out.println("剛剛輸入的字串是:"+str2); 
	}
}