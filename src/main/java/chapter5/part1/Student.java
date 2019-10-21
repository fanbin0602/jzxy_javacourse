package chapter5.part1;

/**
 * @author fanbin
 * @date 2019/10/20
 */
public class Student {

    private String studentsNo;

    private String name;

    public Student(String studentNo, String name) {
        this.studentsNo = studentNo;
        this.name = name;
    }

    public String getStudentsNo() {
        return studentsNo;
    }

    public void setStudentsNo(String studentsNo) {
        this.studentsNo = studentsNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
