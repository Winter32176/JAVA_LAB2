package lv.tsi.sync;

public class TaskThread extends Thread{
    private final TaskManager taskManager;
    private final int taskId;
    public TaskThread(String name,int taskId, TaskManager taskManager) {
        super(name);
        this.taskId = taskId;
        this.taskManager = taskManager;
    }

    @Override
    public void run(){
        taskManager.performTask(taskId);
    }
}
