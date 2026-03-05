import java.util.Calendar;
import java.util.Date;

public class Clock {
	int hours;
	int minutes;
	int seconds;
	
	
	public Clock() {
		Date fecha=new Date();
		hours=fecha.getHours();
		minutes=fecha.getMinutes();
		seconds=fecha.getSeconds();
		
	}
	
	public Clock(int hours, int minutes, int seconds) {
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
		
	}
	
	public void setTime(int h, int m, int s) {
		hours=h;
		minutes=m;
		seconds=s;
	}

    public int getHour() {return hours;}
    public int getMinutes() {return minutes;}
    public int getSeconds() {return seconds;}
    
    public void printTime(){
    	System.out.println("Hora: "+hours+" Minutos: "+minutes+" Segundos: "+seconds);
    }
    
    public void incHour() {
    	hours++;
    }
    
    public void incMinutes() {
    	minutes++;
    }
    
    public void incSeconds() {
    	seconds++;
    }
    
    public boolean compareTime(Clock c) {
    	if (c.getHour()==hours && c.getMinutes()==minutes && c.getSeconds()==seconds) {
    		return true;
    	}
    	return false;
    }
    
    public void copyTime(Clock c) {
    	hours=c.getHour();
    	minutes=c.getMinutes();
    	seconds=c.getSeconds();
    }
    
    public Clock returnCopyTime(Clock reloj) {
    	Clock c=new Clock(reloj.getHour(),reloj.getMinutes(),reloj.getSeconds());
    	
    	return c;
    }
	
}
