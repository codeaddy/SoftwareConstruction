package org.test;

import org.edu.hse.seminar2.oop.Worker;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    void eatTest() {
        Worker worker = new Worker("Jeffrey", LocalDate.of(1999, 10, 5));
        assertEquals("Worker ate: Apple, Potato, Strawberry", worker.eat(new String[]{"Apple", "Potato",
                "Strawberry"}));
    }

    @Test
    void getAgeTest() {
        Worker worker1 = new Worker("Jeffrey", LocalDate.of(1999, 10, 5));
        assertEquals(24, worker1.getAge());

        Worker worker2 = new Worker("Jeffrey", LocalDate.of(2005, 04, 10));
        assertEquals(18, worker2.getAge());
    }

    @Test
    void getAgeFromTest() {
        Worker worker1 = new Worker("Jeffrey", LocalDate.of(1999, 10, 5));
        assertEquals(1, worker1.getAge(LocalDate.of(2000, 11, 5)));

        Worker worker2 = new Worker("Jeffrey", LocalDate.of(2010, 10, 5));
        assertEquals(10, worker2.getAge(LocalDate.of(2020, 9, 5)));
    }
}