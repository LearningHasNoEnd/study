import java.util.Scanner;

class MyUtil {
	/* 输入：numbers - 待处理的数组
	 * 返回：返回操作结束之后数组中剩余的数据数量，输入为null则返回-1
	 * 功能：删除数组numbers中的所有偶数，并将余下元素依次前移
	 */
	int deleteEvenNumber(int[] numbers) {
		if (numbers == null)
			return -1;
		else {
			int amnt = numbers.length;
			int freeIdx = -1; // 数组第一个空闲单元的下标
			
			// 遍历数组、判断并删除(覆盖)
			for (int i=0; i<numbers.length; i++) {
				if (numbers[i]%2 == 0) {
					if (freeIdx < 0) freeIdx = i;
					amnt--; // 是偶数则将数据量减1
				}
				else { // 是奇数则前移，填补空缺
					if (freeIdx > -1)
						numbers[freeIdx++] = numbers[i];
				}
			}
			return amnt;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner inputer = new Scanner(System.in);
		MyUtil util = new MyUtil();
		
		int amnt = 0; //.....数据数量
		int[] numbers = null; // 数据集
		for (int cases=0; cases<10; cases++) {
			// 输入测试用例
			amnt = inputer.nextInt();
			if (amnt < 0) amnt = 0;
			numbers = new int[amnt];
			System.out.print("输入：");
			for (int i=0; i<amnt; i++)
				numbers[i] = inputer.nextInt();
			
			// 删除数组中的偶数(奇数前移)
			amnt = util.deleteEvenNumber(numbers);
			
			// 输出操作结果
			System.out.print("输出：");
			for (int i=0; i<amnt; i++)
				System.out.print(numbers[i] + " ");
			System.out.println('\n');
		}
	}
	
}
