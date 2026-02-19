class rectangle
{
   
     public static void main(String args[]){

	double height1=40,width1=4;
        double area1=width1*height1;
	double perimeter1= 2*(width1+height1);
	System.out.println("Zala Nikunj 240390107058");
	System.out.println("----------------");
	System.out.println("  rectangle 1");
	System.out.println("----------------");
	System.out.println("Height:"+height1);
	System.out.println("Width:"+width1);
	System.out.println("Area:"+area1);
	System.out.println("Perimeter:"+perimeter1);
	System.out.println("");

	double height2=39.5,width2=3.5;
        double area2=width2*height2;
	double perimeter2= 2*(width2+height2);
	System.out.println("----------------");
	System.out.println("  rectangle 2");
	System.out.println("----------------");
	System.out.println("Height:"+height2);
	System.out.println("Width:"+width2);
	System.out.println("Area:"+area2);
	System.out.println("Perimeter:"+perimeter2);
	System.out.println("");

	if(area1>area2){
	 System.out.println("Rectangle 1 has Larger area");
		}
	else{
	 System.out.println("Rectangle 2 has Larger area");
		}


	
}
}