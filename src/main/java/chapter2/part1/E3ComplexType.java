package chapter2.part1;

/**
 * @author fanbin
 * @date 2019/9/2
 */
public class E3ComplexType {

    public static void main(String[] args) {

        Date date = new Date();
        date.year = 2019;
        date.month = 9;
        date.day = 3;

        System.out.println(date);

        System.out.println("今天是" + date.year + "年" + date.month + "月" + date.day + "日");

    }

}

class Date{
    int year;
    int month;
    int day;
}
