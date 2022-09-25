package org.khasanof;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Task {

    private static final AtomicInteger id_gen = new AtomicInteger();

    private final int id;
    private final int timeMillis;

    protected Task(final int timeMillis) {
        this.id = id_gen.incrementAndGet();
        this.timeMillis = timeMillis;
    }

    public int getId() {
        return id;
    }

    public int getTimeMillis() {
        return timeMillis;
    }

    @Override
    public String toString() {
        return String.format("id=%d time=%d", id, timeMillis);
    }
}
