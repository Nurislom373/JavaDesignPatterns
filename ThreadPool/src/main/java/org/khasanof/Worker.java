package org.khasanof;

import lombok.extern.slf4j.Slf4j;

public class Worker implements Runnable {

    private final Task task;

    public Worker(Task task) {
        this.task = task;
    }


    @Override
    public void run() {
        System.out.println(String.format("%s processing %s", Thread.currentThread().getName(), task.toString()));
        try {
            Thread.sleep(task.getTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
