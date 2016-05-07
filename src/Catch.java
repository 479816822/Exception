import java.util.InputMismatchException;
import java.util.Scanner;

public class Catch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] name = { "name", "ad", "fkkfdsn" };
		try {
			int a = input.nextInt();
			int b = input.nextInt();
				
			System.out.println(a / b);
			for (int i = 0; i < 6; i++) {
				if(i==3)
				throw new ArrayIndexOutOfBoundsException("jjj");
				System.out.println(name[i]);
			}

		} catch (NullPointerException e) {
		//	 TODO: handle exception
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			System.out.println("数组下标越界");
			
	}catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("输入的类型不符！");
	}catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println("输入的类型不符！");
	}
		finally {
			System.out.println("关闭异常2");
		}

		System.out.println("程序正常运行");
	}
}
