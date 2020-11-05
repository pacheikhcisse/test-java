package fr.ptc.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PartitionTest {

    @Test
    public void should_return_a_partition_of_integer_list() {
        //Given
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int partitionSize = 3;

        //When
        Partition<Integer> p = new Partition<>();
        Collection<List<Integer>> result = p.createPartition(list, partitionSize);

        //Then
        assertNotNull(result);
        int expectedResultSize = list.size() / partitionSize + (list.size() % partitionSize == 0 ? 0 : 1);
        assertEquals(expectedResultSize, result.size());
    }

    @Test
    public void should_return_a_partition_of_string_list() {
        //Given
        List<String> list = Arrays.asList("abc","def","ghi","jkl");
        int partitionSize = 4;

        //When
        Partition<String> p = new Partition<>();
        Collection<List<String>> result = p.createPartition(list, partitionSize);

        //Then
        assertNotNull(result);
        int expectedResultSize = list.size() / partitionSize + (list.size() % partitionSize == 0 ? 0 : 1);
        assertEquals(expectedResultSize, result.size());
    }

}
