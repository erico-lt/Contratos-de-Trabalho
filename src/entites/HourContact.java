import java.util.Date;

public class HourContact {
    private Date date;
    private double valuePerHour;
    private int hours;
   
    public HourContact(){        
    }

    public HourContact(int hours){
        this.setValuePerHour(35.45f);
        this.setDate(date = new Date());
        this.setHours(hours);
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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

}
