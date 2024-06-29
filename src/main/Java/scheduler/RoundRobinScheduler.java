package scheduler;

import java.util.LinkedList;
import java.util.Queue;

public class RoundRobinScheduler {
    private Queue<Task> queue;
    private int quantum;

    public RoundRobinScheduler(int quantum) {
        this.queue = new LinkedList<>();
        this.quantum = quantum;
    }

    public void addTask(Task task) {
        queue.add(task);
    }

    public void schedule() {
        while (!queue.isEmpty()) {
            Task currentTask = queue.poll();
            int timeLeft = Math.min(currentTask.getBurstTime(), quantum);
            currentTask.execute(timeLeft);
            if (!currentTask.isCompleted()) {
                queue.add(currentTask);
            }
        }
    }
}
