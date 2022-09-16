import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private Department department;
    private List <HourContact> contract = new ArrayList<>();

    public Worker(){        
    }

    public Worker(String name, WorkerLevel level, Department department){
        this.setName(name);
        this.setLevel(level);
        this.setDepartment(department);
        switch(this.getLevel()){
            case JUNIOR:
                this.setBaseSalary(1.200f);
                break;
            case MID_LEVEL:
                this.setBaseSalary(1.400f);
                break;
            case SENIOR:
                this.setBaseSalary(1.600f);
                break;  
            default:
                break;          
        }
    }

    public void addContract(HourContact contract){
        this.contract.add(contract);
    }

    public void removeContract(HourContact contract){
        this.contract.remove(contract);
    }

    public double incomer(int year, int month){                        
        double incom = this.getBaseSalary();
        incom += totalIncom(contract, year, month);        
        return incom;
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

    public HourContact getContract(int position) {
        return contract.get(position);
    }   

    //Função que retorn a renda de todos os contratos ativos do mês atual
    public double totalIncom(List <HourContact> contract2,int  year,int month){
        Calendar cal = Calendar.getInstance();
        double incom = 0;
        for(HourContact c: contract2){
            cal.setTime(c.getDate());
            int yearContract = cal.get(Calendar.YEAR);
            int monthContract = 1 + cal.get(Calendar.MONTH);
            if(yearContract == year && monthContract == month){
                incom += c.totalValue();                
            }
        }
        return incom;
    }

}
