package org.test;

import org.edu.hse.seminar10.concurrency.race.condition.DumbCounter;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class DumbCounterTest {
    @Test
    public void IncrementParallelTest() {
        for (int i = 0; i < 5; ++i) {
            DumbCounter counter = new DumbCounter();
            IntStream.range(0, 1000000).parallel().forEach(counter::increment);
            assertEquals(1000000, counter.getCount());
        }
    }
}