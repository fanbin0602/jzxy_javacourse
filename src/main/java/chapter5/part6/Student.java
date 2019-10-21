package chapter5.part6;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fanbin
 * @date 2019/10/20
 */
public class Student {

    private String studentsNo;

    private String name;

    private Gender gender;

    private Map<Course, Double> score;

    public Student(String studentNo, String name, Gender gender) {
        this.studentsNo = studentNo;
        this.name = name;
        this.gender = gender;
        this.score = new HashMap<>();
    }

    public void setScoreByCourse(Course course, Double score) {
        this.score.put(course, score);
    }

    public double getScoreByCourse(Course course) {
        return score.get(course);
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

    public Map<Course, Double> getScore() {
        return score;
    }

    public void setScore(Map<Course, Double> score) {
        this.score = score;
    }
}
