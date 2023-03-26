package org.edu.hse.seminar10.concurrency.race.condition;

import lombok.Getter;

@Getter
public class DumbCounter {
    private int count;
    public void increment(int v){
        count++;
    }
}
