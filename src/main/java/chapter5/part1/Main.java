package chapter5.part1;

/**
 * @author fanbin
 * @date 2019/10/21
 */
public class Main {
    public static void main(String[] args) {
        UniversityClass xinke = new UniversityClass("信科1801");
        Student[] xinkeStudents = {
                new Student("1806122141", "阎杰"),
                new Student("1806122128", "任凌燕")
        };
        xinke.setStudents(xinkeStudents);
        System.out.println(xinke.toString());

        UniversityClass shuju = new UniversityClass("数据1801");
        Student[] shujuStudents = {
                new Student("1806142149", "赵晨"),
                new Student("1806142145", "张浩")
        };
        shuju.setStudents(shujuStudents);
        System.out.println(shuju);
    }
}
