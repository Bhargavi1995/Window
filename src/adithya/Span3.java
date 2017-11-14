package adithya;

import adithya.Span2.Arthematicops;

public class Span3 {

	public static void main(String[] args) {
		Arthematicops obj= new Arthematicops();
		int x= 500;
		int y= 1000;
		int exp =x-y;
		int act= obj.sub(x,y);
	    if(exp!=act)
	    {
	    	System.out.println("pass");
	    }
	    else
	    {
	    	System.out.println("fail");
	    }
	    
		
	}

}
