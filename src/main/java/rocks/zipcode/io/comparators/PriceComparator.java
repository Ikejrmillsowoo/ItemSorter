package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }

}
