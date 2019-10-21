package chapter5.part6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fanbin
 * @date 2019/10/20
 */
public class UniversityClass {

    /**
     * 班级名称
     */
    private String name;

    /**
     * 学生名单
     */
    private List<Student> students;

    private Map<String, Teacher> teachers;

    public UniversityClass(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Map<String, Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Map<String, Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        String str = "这是" + name + "班，班里有" + students.size() + "名同学，他们是：";
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            str += student.getName();
            if (i != students.size() - 1) {
                str += "、";
            }
        }
        str += "\n";
        for (Map.Entry<String, Teacher> entry : teachers.entrySet()) {
            str += entry.getKey() + "老师是" + entry.getValue();
        }
        return str;
    }

    public int countStudents() {
        return students.size();
    }

    public int countStudentsByGender(Gender gender) {
        int count = 0;
        for (Student student : students) {
            if (student.getGender() == gender) {
                count++;
            }
        }
        return count;
    }
}
