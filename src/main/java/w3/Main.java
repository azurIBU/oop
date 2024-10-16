package w3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void printTaskDetails(List<TaskItem> tasks) {
        for (TaskItem task : tasks) {
            System.out.print(task.getTaskId() + " ");
            System.out.print(task.getTaskDescription() + " ");
            System.out.print(task.getTaskStatus());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DataStructures dataStructures = new DataStructures();
        List<TaskItem> allTasks = dataStructures.getAllTasks();

        printTaskDetails(allTasks);

        System.out.println("----------");
        List<TaskItem> tasksInProgress = dataStructures.getByStatus(TaskStatus.IN_PROGRESS);

        printTaskDetails(tasksInProgress);

        System.out.println("----------");
        List<TaskItem> taskWithIdAbove1 = dataStructures.findTasksByIdGreaterThan(1);

        printTaskDetails(taskWithIdAbove1);
    }
}

