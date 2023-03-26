package org.test;

import org.edu.hse.seminar10.concurrency.race.condition.AtomicDumbCounter;
import org.edu.hse.seminar10.concurrency.race.condition.DumbCounter;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class AtomicDumbCounterTest {

    @Test
    public void IncrementParallelTest() {
        for (int i = 0; i < 5; ++i) {
            AtomicDumbCounter counter = new AtomicDumbCounter();
            IntStream.range(0, 1000000).parallel().forEach(counter::increment);
            assertEquals(1000000, counter.getCount().get());
        }
    }
}