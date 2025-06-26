package org.example;

public class PerformanceTester {
    public void performTask() {
        try {
            Thread.sleep(500); // simulate a task that takes time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
