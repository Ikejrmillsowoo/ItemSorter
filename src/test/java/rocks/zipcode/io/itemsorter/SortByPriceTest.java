package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {

    @Test
    public void test1() {
        Item item3 = new Item(0L, "Apple", 1.0);
        Item item2 = new Item(1L, "Banana", 1.5);
        Item item1 = new Item(2L, "Cherry", 2.0);
        Item[] itemsToSort = {item1, item2, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Item item3 = new Item(0L, "Razor", 1.0);
        Item item2 = new Item(1L, "Sharp", 3.5);
        Item item1 = new Item(2L, "Tapestry", 2.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item1, item2};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        Item item3 = new Item(0L, "Leon", 1.0);
        Item item2 = new Item(1L, "Nhu", 1.5);
        Item item1 = new Item(2L, "Wilhem", 2.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
