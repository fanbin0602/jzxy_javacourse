package chapter5.part4;

import java.util.*;

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

        Teacher javaTeacher = new Teacher("Kris Wu");
        Map<String, Teacher> teacherMap = new HashMap<>();
        teacherMap.put("Java", javaTeacher);
        xinke.setTeachers(teacherMap);

        System.out.println(xinke);

        System.out.println(xinke.getTeachers().get("Java"));

    }
}
