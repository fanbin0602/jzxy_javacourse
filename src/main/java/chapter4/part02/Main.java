package chapter4.part02;

import chapter4.part02.components.Chip;
import chapter4.part02.components.Mainboard;
import chapter4.part02.components.Memory;
import chapter4.part02.components.Storage;

/**
 * @author fanbin
 * @date 2019/10/7
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.model = "iPhone 11";
        phone.brand = "苹果";
        phone.color = "白色";
        phone.price = 5499;

        Mainboard mainboard = new Mainboard();

        Chip chip = new Chip();
        chip.model = "A13";
        chip.producer = "Apple";

        Memory memory = new Memory();
        memory.size = 3;
        memory.producer = "Samsung";

        Storage storage = new Storage();
        storage.size = 64;
        storage.producer = "Samsung";

        mainboard.chip = chip;
        mainboard.storage = storage;
        mainboard.memory = memory;

        phone.mainboard = mainboard;

        String describeString = phone.getDescribeString(true);

        System.out.println(describeString);
    }
}
