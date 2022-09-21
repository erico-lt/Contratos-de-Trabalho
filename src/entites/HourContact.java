import java.text.ParseException;
import java.util.Date;

public class HourContact {
    private Date date;
    private double valuePerHour;
    private Integer hours;    
   
    public HourContact(){        
    }

    public HourContact(double valuePerHour, Integer hours,Date date) throws ParseException{         
        this.setDate(date);         
        this.setValuePerHour(valuePerHour);       
        this.setHours(hours);
                                
    }
        
    public double totalValue(){
        return this.getValuePerHour() * (hours * 22);
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
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
   
}
