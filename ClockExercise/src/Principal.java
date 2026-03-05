
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock reloj1=new Clock();
		Clock reloj2=new Clock(9,1,30);

		reloj1.printTime();
		reloj2.printTime();
		
		//System.out.println(reloj1.getHour());
		//System.out.println(reloj1.hours);
		
		//System.out.println(reloj1.compareTime(reloj2));
		
		reloj2.copyTime(reloj1);
		
		reloj2.printTime();
	}

}
