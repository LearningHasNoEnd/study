import java.util.Scanner;

class MyUtil {
	// 输入：int型的数组
	// 返回：若数组为null则返回false，否则返回true
	// 功能：删除数组numbers中的所有偶数 (置为-1)
	boolean deleteEvenNumber(int[] numbers) {
		if (numbers == null)
			return false;
		else {
			// 遍历数组、判断并删除
			for (int i=0; i<numbers.length; i++)
				if (numbers[i]%2 == 0)
					numbers[i] = -1; 
			return true;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner inputer = new Scanner(System.in);
		MyUtil util = new MyUtil();
		
		int size = 0; //.........数据数量
		int[] numbers = null; // 数据集
		for (int cases=0; cases<10; cases++) {
			// 输入测试用例
			size = inputer.nextInt();
			if (size < 0) size = 0;
			numbers = new int[size];
			System.out.print("输入：");
			for (int i=0; i<size; i++)
				numbers[i] = inputer.nextInt();
			
			// 删除数组中的偶数(置为-1)
			util.deleteEvenNumber(numbers);
			
			// 输出操作结果
			System.out.print("输出：");
			for (int n : numbers) {
				if (n!=-1) System.out.print(n + " ");
			}
			System.out.println('\n');
		}
	}
	
}
