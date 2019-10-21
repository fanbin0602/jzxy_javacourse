package chapter5.part3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fanbin
 * @date 2019/10/21
 */
public class Main {
    public static void main(String[] args) {
        Set group = new HashSet<>();
        group.add(new Student("1806122141", "阎杰"));
        System.out.println(group.size() + group.toString());
        group.add(new Student("1806122128", "任凌燕"));
        System.out.println(group.size() + group.toString());
        group.add(new Student("1806122141", "阎杰"));
        System.out.println(group.size() + group.toString());
        group.remove(new Student("1806122141", "阎杰"));
        System.out.println(group.size() + group.toString());

        System.out.println(group.contains(new Student("1806122141", "阎杰")));
        System.out.println(group.contains(new Student("1806122128", "任凌燕")));
    }
}
