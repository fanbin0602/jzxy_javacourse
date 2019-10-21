package chapter5.part1;

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
    private Student[] students;

    public UniversityClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        String str = "这是" + name + "班，班里有" + students.length + "名同学，他们是：";
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            str += student.getName();
            if (i != students.length - 1) {
                str += "、";
            }
        }
        return str;
    }
}
