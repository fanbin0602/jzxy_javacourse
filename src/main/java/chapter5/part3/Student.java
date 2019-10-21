package chapter5.part3;

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

    /**
     * 学习写 hashcode 方法（hashcode 相同，
     * @return
     */
    @Override
    public int hashCode() {
        return Integer.parseInt(studentsNo);
    }

    /**
     * 学习写 equals 方法
     * equal()相等的两个对象他们的hashCode()肯定相等，也就是用equal()对比是绝对可靠的；
     * hashCode()相等的两个对象他们的equal()不一定相等，也就是hashCode()不是绝对可靠的。
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Student) {
            Student o = (Student) obj;
            return studentsNo.equals(((Student) obj).studentsNo);
        }
        return false;
    }

    @Override
    public String toString() {
        return name + "(" + studentsNo + ")";
    }
}
