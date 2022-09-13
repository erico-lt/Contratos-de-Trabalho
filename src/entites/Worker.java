import java.util.ArrayList;
import java.util.List;

import enums.WorkerLevel;;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private Department department;
    private List <HourContact> contract = new ArrayList<>();

    public void addContract(List <HourContact > contract){
        this.setContract(contract);
    }

    public void removeContract(int position){
        this.getContract(position).remove(position);
    }

    public double incomer(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List <HourContact> getContract(int position) {
        return getContract(position);
    }

    public void setContract(List <HourContact> contract) {
        this.contract.add((HourContact)contract);
    }

}
