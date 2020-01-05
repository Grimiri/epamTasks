package tasks.cycles;
/*
* 6. Вывести на экран соответствия между символами и их численными
* обозначениями в памяти компьютера
* */
public class Task_6 {
    public static void main(String[] args) {
        char symbol = 0;
        for (int i = 0; i < 256; i++){
            System.out.println(i + " = " + symbol );
            symbol++;
        }
    }
}
