import java.util.Date;

public class HourContact {
    private Date date;
    private double valuePerHour;
    private Integer hours;    
   
    public HourContact(){        
    }

    public HourContact(Integer hours, Date date){
        this.setValuePerHour(35.45f);       
        this.setHours(hours);  
        this.setDate(date);      
    }
        
    public double totalValue(){
        return this.getValuePerHour() * hours;
    }

    public Date getDate() {
        return date;
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
