package StringsAndBasicsOfTextProcessing_3.workingwithastring;

/*
* 5. Удалить в строке все лишние пробелы,
* то есть серии подряд идущих пробелов заменить
* на одиночные пробелы. Крайние пробелы в строке удалить.
* */
public class Task_5 {
    public static void main(String[] args) {
        String str = "  da     dsae   eqwd eqw    ds d  d d   ";
        System.out.println("string:\n" + str);
        char[] charArray = str.toCharArray();
        String newString = "";
        boolean flag = false;
        for (char c : charArray) {
            if(Character.isSpaceChar(c) && !flag){
                flag = true;
                newString += c;
            }
            else if(!Character.isSpaceChar(c)){
                flag = false;
                newString += c;
            }
        }
        System.out.println("answer:\n" + newString.trim());
    }
}
