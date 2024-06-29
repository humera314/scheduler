package scheduler;

public class UniProgrammingScheduler {
    private Task task;

    public UniProgrammingScheduler(Task task) {
        this.task = task;
    }

    public void schedule() {
        task.execute(task.getBurstTime());
    }
}
