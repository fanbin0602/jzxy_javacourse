package chapter5.part6;

/**
 * @author fanbin
 * @date 2019/10/21
 */
public class Main {
    public static void main(String[] args) {

        Student renlinyan = new Student("1806122128", "任凌燕", Gender.GIRL);

        renlinyan.setScoreByCourse(Course.MATH, 0.0);
        renlinyan.setScoreByCourse(Course.ENGLISH, 0.0);
        renlinyan.setScoreByCourse(Course.JAVA, 100.0);

        System.out.println("任凌燕的数学成绩是：" + renlinyan.getScoreByCourse(Course.MATH));
        System.out.println("任凌燕的英语成绩是：" + renlinyan.getScoreByCourse(Course.ENGLISH));
        System.out.println("任凌燕的编程成绩是：" + renlinyan.getScoreByCourse(Course.JAVA));

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        int a = Integer.valueOf("1234");
        int b = Integer.parseInt("1234");

        Integer i = 1;
        int j = i;

    }
}
