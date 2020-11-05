package fr.ptc.test;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Partition<T> {

    public Collection<List<T>> createPartition(List<T> list, int size) {
        AtomicInteger i = new AtomicInteger();
        return list.stream()
                .collect(Collectors.groupingBy(elt -> i.getAndIncrement() / size))
                .values();
    }

}
