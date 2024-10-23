import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();  // 读入输入数字
        int result = 0;  // 最终的二进制转换后的十进制结果
        int power = 1;  // 二进制位值，用于逐步乘以2（1，2，4，8...）
        int position = 1;  // 用于记录当前是第几位，从1开始计数

        while (inputNumber > 0) {
            int digit = inputNumber % 10;  // 当前数位的数字
            inputNumber /= 10;  // 去掉最低位

            // 判断奇偶性
            boolean digitEven = (digit % 2 == 0);
            boolean positionEven = (position % 2 == 0);

            // 如果数字和数位奇偶性一致，记下1
            if (digitEven == positionEven) {
                result += power;
            }

            power *= 2;  // 更新二进制位值（每次乘2）
            position++;  // 更新数位编号
        }

        System.out.println(result);  // 输出结果
    }
}