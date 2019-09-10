package chapter2.part3;

/**
 * @author fanbin
 * @date 2019/9/9
 */
public class E07PrintChar {
    public static void main(String[] args) {
        char ch = 'A';
        int startNum = ch;
        for (int i = 0; i < 26; i++) {
            int newNum = startNum + i;
            System.out.println(newNum + "\t" + ((char) newNum));
        }
    }
}
