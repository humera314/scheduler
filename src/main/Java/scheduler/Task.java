package scheduler;

public class Task {
    private String name;
    private int burstTime;
    private boolean completed;

    public Task(String name, int burstTime) {
        this.name = name;
        this.burstTime = burstTime;
        this.completed = false;
    }

    public void execute(int time) {
        System.out.println("Executing task " + name + " for " + time + " units");
        burstTime -= time;
        if (burstTime <= 0) {
            completed = true;
            System.out.println("Task " + name + " completed");
        }
    }

    public int getBurstTime() {
        return burstTime;
    }

    public boolean isCompleted() {
        return completed;
    }
}
