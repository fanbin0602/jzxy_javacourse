package chapter5.part2;

import java.util.List;

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

    public UniversityClass(String name) {
        this.name = name;
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
        return str;
    }
}
