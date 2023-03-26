package org.test;

import org.edu.hse.seminar2.oop.Human;
import org.edu.hse.seminar2.oop.Worker;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    @Test
    void testToString() {
        Worker worker = new Worker("Jeffrey", LocalDate.of(1999, 10, 5));
        assertEquals(((Human)worker).toString(), "My name is Jeffrey\n" +
                "I was born in 05 October 1999, I'm 24 years old.");
    }
}