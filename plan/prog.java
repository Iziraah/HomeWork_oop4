package plan;

import java.util.ArrayList;

public class prog {
    
    public static void main(String args[]){
          
    ArrayList<Task> myTask = new ArrayList<Task>();
 
    Task firstTask = new Task("vaccinate the cat", "High", 10.03, 14.04);
    Task secondTask = new Task("clean the beadroom", "Middle", 10.03, 12.03);
    Task thirdTask = new Task("visit the office", "High", 25.02, 5.03);
    Task fourthTask = new Task("buy a pineapple", "Low", 29.02, 3.03);
    myTask.add(firstTask);
    myTask.add(secondTask);
    myTask.add(thirdTask);
    myTask.add(fourthTask);

    // for (Task t: myTask) {
    //     System.out.println(t);
    // }
    // }    
    deadlineComparator deadlineComparator = new deadlineComparator();
    myTask.sort(deadlineComparator);
 
    System.out.println("Sorted: ");
    for (Task t: myTask) {
        System.out.println(t);
    }
    
    System.out.println("hi");
}
}

