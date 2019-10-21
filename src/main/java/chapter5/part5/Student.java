package chapter5.part5;

/**
 * @author fanbin
 * @date 2019/10/20
 */
public class Student {

    private String studentsNo;

    private String name;

    private Gender gender;

    public Student(String studentNo, String name, Gender gender) {
        this.studentsNo = studentNo;
        this.name = name;
        this.gender = gender;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
