package org.khasanof;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Thread Pool pattern is where a number of threads are created to perform a number of tasks, which
 * are usually organized in a queue. The results from the tasks being executed might also be placed
 * in a queue, or the tasks might return no result. Typically, there are many more tasks than
 * threads. As soon as a thread completes its task, it will request the next task from the queue
 * until all tasks have been completed. The thread can then terminate, or sleep until there are new
 * tasks available.
 *
 * <p>In this example we create a list of tasks presenting work to be done. Each task is then
 * wrapped into a {@link Worker} object that implements {@link Runnable}. We create an {@link
 * java.util.concurrent.ExecutorService} with fixed number of threads (Thread Pool) and use them to execute the {@link
 * Worker}s.
 */
public class App {
    public static void main(String[] args) {

        // Create a list of tasks to be executed
        List<Task> tasks = List.of(
                new PrepareTacoTask(5),
                new CoffeeMakingTask(3),
                new PrepareTacoTask(8),
                new CoffeeMakingTask(1),
                new PrepareTacoTask(4),
                new CoffeeMakingTask(5),
                new PrepareTacoTask(6),
                new CoffeeMakingTask(7),
                new PrepareTacoTask(4),
                new CoffeeMakingTask(2),
                new PrepareTacoTask(7),
                new CoffeeMakingTask(5)
        );

        // Creates a thread pool that reuses a fixed number of threads operating off a shared
        // unbounded queue. At any point, at most nThreads threads will be active processing
        // tasks. If additional tasks are submitted when all threads are active, they will wait
        // in the queue until a thread is available.
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Allocate new worker for each task
        // The worker is executed when a thread becomes
        // available in the thread pool
        tasks.stream().map(Worker::new).forEach(executorService::execute);

        // All tasks were executed, now shutdown
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            Thread.yield();
        }

        System.out.println("Program finished!");

    }
}
