import java.util.Scanner;
class Point
{
   int x,y;
   
	Point(){
	x=5;
	y=5;
	}   
      
	Point(int p1,int p2){
	x=p1;
	y=p2;
	}
        
	Point(Point P)
	{
		x=P.x;
		y=P.y;
	}

void display()
{
	System.out.println("\nX="+x+" Y="+y);
}
          
	
     public static void main(String args[]){
	System.out.println("Zala Nikunj 240390107058");
	System.out.println("****************");
	System.out.println("  point 1");
	System.out.println("****************");
	

	Point a= new Point();
	a.display();
	System.out.println("****************");
	System.out.println("  point 2");
	System.out.println("****************");
	
	
	 Scanner sc=new Scanner(System.in);
		int p1,p2;
		System.out.println("Enter value of p1:");
		p1=sc.nextInt();
		System.out.println("Enter value of p2:");
		p2=sc.nextInt();

	Point b= new Point(p1,p2);
	b.display();
	System.out.println("****************");
	System.out.println("  point 3 [Copy]");
	System.out.println("****************");
	
	Point c = new Point(b);
	//c.display();

	c.display();	

	

	
}
}