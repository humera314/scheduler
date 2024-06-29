package scheduler;

import java.util.PriorityQueue;

public class SJFScheduler {
    private PriorityQueue<Task> queue;

    public SJFScheduler() {
        this.queue = new PriorityQueue<>((a, b) -> a.getBurstTime() - b.getBurstTime());
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
