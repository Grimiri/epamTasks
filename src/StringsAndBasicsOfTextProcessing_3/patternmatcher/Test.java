package StringsAndBasicsOfTextProcessing_3.patternmatcher;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("subscribe.Shuting");
            Method[] methods = c.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m.getReturnType().getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
