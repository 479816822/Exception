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
			System.out.println("�����±�Խ��");
			
	}catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("��������Ͳ�����");
	}catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println("��������Ͳ�����");
	}
		finally {
			System.out.println("�ر��쳣2");
		}

		System.out.println("������������");
	}
}
