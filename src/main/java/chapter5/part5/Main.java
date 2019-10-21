package chapter5.part5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fanbin
 * @date 2019/10/21
 */
public class Main {
    public static void main(String[] args) {

        UniversityClass xinke = new UniversityClass("信科1801");
        List<Student> xinkeStudents = new ArrayList<>();
        xinkeStudents.add(new Student("1806122141", "阎杰", Gender.BOY));
        xinkeStudents.add(new Student("1806122128", "任凌燕", Gender.GIRL));
        xinke.setStudents(xinkeStudents);

        Teacher javaTeacher = new Teacher("Kris Wu");
        Map<String, Teacher> teacherMap = new HashMap<>();
        teacherMap.put("Java", javaTeacher);
        xinke.setTeachers(teacherMap);

        System.out.println(xinke);

        // 我们统计一下班里有多少个男同学，多少个女同学
        System.out.println("一共有"+xinke.countStudents()+"名同学");
        System.out.println("一共有"+xinke.countStudentsByGender(Gender.BOY)+"名男同学");
        System.out.println("一共有"+xinke.countStudentsByGender(Gender.GIRL)+"名女同学");


    }
}
