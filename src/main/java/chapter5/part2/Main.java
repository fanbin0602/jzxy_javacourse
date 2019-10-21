package chapter5.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fanbin
 * @date 2019/10/21
 */
public class Main {
    public static void main(String[] args) {
        UniversityClass xinke = new UniversityClass("信科1801");
        List<Student> xinkeStudents = new ArrayList<>();
        xinkeStudents.add(new Student("1806122141", "阎杰"));
        xinkeStudents.add(new Student("1806122128", "任凌燕"));
        xinke.setStudents(xinkeStudents);
        System.out.println(xinke.toString());

        UniversityClass shuju = new UniversityClass("数据1801");
        List<Student> shujuStudents = new ArrayList<>();
        shujuStudents.add(new Student("1806142149", "赵晨"));
        shujuStudents.add(new Student("1806142145", "张浩"));
        shuju.setStudents(shujuStudents);
        System.out.println(shuju);

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits.size() + fruits.toString());

        fruits.remove(1);
        System.out.println(fruits.size() + fruits.toString());

        fruits.add(0, "Banana");
        System.out.println(fruits.size() + fruits.toString());

        System.out.println(fruits.contains("Banana"));
        System.out.println(fruits.indexOf("Banana"));

        fruits.add("Banana");
        System.out.println(fruits.size() + fruits.toString());
        System.out.println(fruits.indexOf("Banana"));
        System.out.println(fruits.lastIndexOf("Banana"));

        // 更多的方法，大家可以自己查阅文档

    }
}
