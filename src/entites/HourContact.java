import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HourContact {
    private LocalDate date;
    private double valuePerHour;
    private Integer hours;    
   
    public HourContact(){        
    }

    public HourContact(double valuePerHour, Integer hours,String date){   
        DateTimeFormatter dateForm = DateTimeFormatter.ofPattern("dd/MM/yyyy");            
        this.setValuePerHour(valuePerHour);       
        this.setHours(hours);       
        LocalDate date2 = LocalDate.parse(date, dateForm);
        this.setDate(date2);
    }
        
    public double totalValue(){
        return this.getValuePerHour() * (hours * 22);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Override
    public String toString(){
        return "Date: " + this.getDate() +
        "\nValue Per Hour: " + this.getValuePerHour() +
        "\nHours: " + this.getHours();
    }
}
