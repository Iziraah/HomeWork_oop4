package plan;

import java.util.Comparator;

class deadlineComparator implements Comparator<Task> {
 
    public int compare(Task t1, Task t2) {
        if (t1.deadline == t2.deadline) {
            return 0;
        }
        if (t1.deadline > t2.deadline) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
