package w3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", TaskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", TaskStatus.COMPLETED));
    }
    
    public List<TaskItem> getAllTasks() {
        return tasks;
    }

    public List<TaskItem> getByStatus(TaskStatus status) {
        return
            tasks.stream().filter(task ->
                task.getTaskStatus() == status
            )
            .collect(Collectors.toList());
    }

    public List<TaskItem> findTasksByIdGreaterThan(int id) {
        return tasks.stream().filter(task -> task.getTaskId() > id).collect(Collectors.toList());
    }
}
