package plan;

class Task implements Comparable<Task>{
    String name;
    String priority;
    double dateCreate;
    double deadline;

    public Task(String name, String priority, double dateCreate, double deadline){
        this.name = name;
        this.priority = priority;
        this.dateCreate = dateCreate;
        this.deadline = deadline;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Task{");
            sb.append("name=").append(name);
            sb.append(", priority=").append(priority);
            sb.append(", dateCreate='").append(dateCreate).append('\'');
            sb.append(", deadline=").append(deadline);
            sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Task anotherTask)
    {
        if (this.deadline == anotherTask.deadline) {
            return 0;
        } else if (this.deadline < anotherTask.deadline) {
            return -1;
        } else {
            return 1;
        }
    }
}
enum Priority {
    Low, Middle, High
    }
