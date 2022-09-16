import enums.WorkerLevel;

public class PrinciaplProgam {
    public static void main(String[] args){
        Department department = new Department("Developer");
        Worker worker1 = new Worker("Érico",WorkerLevel.JUNIOR, department);
        System.out.println(worker1.getDepartment().getName());
    }
}
