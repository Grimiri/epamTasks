package BasicsOfSoftwareCodeDevelopment_1.linearprogramms;

import java.util.Scanner;
/*
* 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
* 𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦 /𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦 ∗ 𝑡𝑔 𝑥y
* */
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x.. ");
        int x = scanner.nextInt();
        System.out.println("enter y.. ");
        int y = scanner.nextInt();

        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) * Math.tan(x * y);

        System.out.printf("Third task answer = %.4f", z);

    }
}
