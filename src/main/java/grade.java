
public class grade {


	    public String getGrade(double mark) {
	    	if(mark > 100) {return "invalid" ;}
	    	else if ( mark == 100 || mark >=90 ) {return "exellent" ;}
	    	else if ( mark >=80 ) {return "very good" ;}
	    	else if ( mark >=70 ) {return "good" ;}
	    	else if ( mark >=60 ) {return "accepted" ;}
	    	else if ( mark >=40 ) {return "failed" ;}
	    	else if ( mark >0 ) {return "failed" ;}
	    	else if ( mark ==0 ) {return "invalid" ;}
	    	else if ( mark <0 ) {return "invalid , please enter positve number" ;}
			return "invalid , please enter number";
		
	    
	}
}
