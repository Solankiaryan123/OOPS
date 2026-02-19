import java.util.Scanner;
class Time
{
   int hours;
   int minutes;

	void setTime(int h,int m){
		hours=h;
		minutes=m;
		}
	void addTime(Time t1,Time t2){
		hours=t1.hours+t2.hours;
		minutes=t1.minutes+t2.minutes;	
        if(minutes>=60)
	{
	hours=hours+(minutes/60);
	minutes%=60;
	}
}
	void displayTime(){
          System.out.println("Time:"+hours+"h"+minutes+"m");
		}

	public static void main(String args[]){
		
		Time t1=new Time();
		Time t2=new Time();
		Time t3=new Time();
	System.out.println("Zala Nikunj 240390107058");
	System.out.println("-------------");
	System.out.println("  Time 1");
	System.out.println("");
	t1.setTime(12,16);
	t1.displayTime();
	System.out.println("-------------");
	System.out.println("");


	System.out.println("-------------");
	System.out.println("  Time 2");
        System.out.println("");
	t2.setTime(10,56);
	t2.displayTime();
	System.out.println("-------------");

         t3.addTime(t1,t2);
         System.out.print("addTime:");
	t3.displayTime();
		 
		}
	
	}