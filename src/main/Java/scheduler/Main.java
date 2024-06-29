package scheduler;

public class Main {
    public static void main(String[] args) {
        // Example usage of schedulers
        RoundRobinScheduler rrScheduler = new RoundRobinScheduler(3);
        FIFOScheduler fifoScheduler = new FIFOScheduler();
        SJFScheduler sjfScheduler = new SJFScheduler();
        UniProgrammingScheduler uniScheduler = new UniProgrammingScheduler(new Task("Task A", 5));

        // Adding tasks to schedulers
        rrScheduler.addTask(new Task("Task 1", 6));
        rrScheduler.addTask(new Task("Task 2", 3));
        fifoScheduler.addTask(new Task("Task 3", 4));
        sjfScheduler.addTask(new Task("Task 4", 2));

        // Running schedulers
        System.out.println("Running Round Robin Scheduler:");
        rrScheduler.schedule();
        
        System.out.println("Running FIFO Scheduler:");
        fifoScheduler.schedule();
        
        System.out.println("Running SJF Scheduler:");
        sjfScheduler.schedule();
        
        System.out.println("Running Uni-programming Scheduler:");
        uniScheduler.schedule();
    }
}
