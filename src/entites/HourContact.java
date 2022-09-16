import java.util.Date;

public class HourContact {
    private Date date;
    private double valuePerHour;
    private Integer hours;    
   
    public HourContact(){        
    }

    public HourContact(double valuePerHour, Integer hours, Date date){               
        this.setValuePerHour(valuePerHour);       
        this.setHours(hours);       
        this.setDate(date);      
    }
        
    public double totalValue(){
        return this.getValuePerHour() * (hours * 22);
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

    @Override
    public String toString(){
        return "Date: " + this.getDate() +
        "\nValue Per Hour: " + this.getValuePerHour() +
        "\nHours: " + this.getHours();
    }
}
