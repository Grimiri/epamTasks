package StringsAndBasicsOfTextProcessing_3.stringlikeobject;
/*
* 2. В строке вставить после каждого символа 'a' символ 'b'.
* */
public class Task_2 {
    public static void main(String[] args) {
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        System.out.println("\n" + string);

        StringBuffer stringBuffer = new StringBuffer(string);

        System.out.println("answer:");
        for (int i = 0; i < stringBuffer.length(); i++) {
            if(stringBuffer.charAt(i) == 'a'){
                stringBuffer.insert(i+1, 'b');
            }
        }
        System.out.println(stringBuffer);


    }
}
