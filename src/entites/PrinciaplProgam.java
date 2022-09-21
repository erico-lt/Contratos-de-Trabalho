import enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PrinciaplProgam {
    public static void main(String[] args) throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Worker worker1;               
        
        System.out.printf("Entre com o seu departamento:");
        String departmentName = sc.nextLine();              
        Department department = new Department(departmentName);
        System.out.println("-----------------------------------");       
        System.out.println("Enter worker dice:");
        System.out.printf("Name:");
        String name = sc.nextLine();       
        System.out.printf("Level:");
        String level = sc.nextLine();     
        worker1 = new Worker(name,WorkerLevel.valueOf(level), department);

        System.out.printf("How many contrcts to this worker?");  
        int qunatCont = sc.nextInt(); 
        for(int cont = 0; cont < qunatCont; cont++){
            SimpleDateFormat fdt = new SimpleDateFormat("dd/MM/yyyy");
            sc.nextLine();
            System.out.println("Enter contract " + (cont +1) + " dice");
            System.out.printf("Date (DD/MM/YYYY): ");
            Date date = fdt.parse(sc.next());
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Hour jober for day: ");
            Integer hours = sc.nextInt();
            HourContact contract = new HourContact(valuePerHour, hours, date);
            worker1.addContract(contract);
        }            

        
        worker1.removeContract(2022, 05);
           
        

        sc.close();
    }
}
