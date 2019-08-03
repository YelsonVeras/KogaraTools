package edu.utesa.lib.panel;

import edu.utesa.lib.statistics.Statistics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Box {
    private List<Item> items = Arrays.asList(
            new Item(1, "BLANCO"),
            new Item(2, "NEGRO"),
            new Item(3, "ROJO"),
            new Item(4, "AZUL"),
            new Item(5, "MORADO")
    );

    public Item get() {
        Item item = Statistics.uniformProbability(items);
        items = items.stream().filter(item1 -> item1.getId() != item.getId()).collect(Collectors.toList());
        return item;
    }
}
