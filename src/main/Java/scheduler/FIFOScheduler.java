package scheduler;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOScheduler {
    private Queue<Task> queue;

    public FIFOScheduler() {
        this.queue = new LinkedList<>();
    }

    public void addTask(Task task) {
        queue.add(task);
    }

    public void schedule() {
        while (!queue.isEmpty()) {
            Task currentTask = queue.poll();
            currentTask.execute(currentTask.getBurstTime());
        }
    }
}
