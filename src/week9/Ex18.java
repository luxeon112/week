import week9.mooving.domain.Item;
import week9.mooving.domain.Thing;
import week9.mooving.domain.Box;
import week9.mooving.logic.Packer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex18 {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("passport", 2));
        items.add(new Item("toothbrash", 1));
        items.add(new Item("circular saw", 100));
        // the things we want to pack
        List<Thing> things = new ArrayList<Thing>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrash", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));
        things.add(new Item("passport", 2));

        // we create a packer which uses boxes whose valume is 10
        Packer packer = new Packer(10);

        // we ask our packer to pack things into boxes
        List<Box> boxes = packer.packThings( things );

        System.out.println("number of boxes: "+boxes.size());

        Collections.sort(items);
        System.out.println(items);
        for (Box box : boxes) {
            System.out.println("  things in the box: "+box.getVolume()+" dm^3");
            System.out.println(box);
        }
    }
}