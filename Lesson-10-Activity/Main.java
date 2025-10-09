
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
  
	Double gpa(double GPA){
		if (GPA > 90){
			double newgpa = GPA * 1.1;
			return newgpa;
		}
		else{
			return GPA;
		}
	}
    Boolean isGraduating(int gradeLevel, int credits){
		if (gradeLevel == 4 && credits >= 44){
			return true;
		}
		else{
			return false;
		}
	}
	String BMI(double lbs, double in){
		double bmi = lbs / in^2.0 * 703.0;

		if (bmi >= 18.4){
			return "Underweight";
		}
		else if(bmi >=  18.5 && bmi <= 24.9){
			return "Normal";
		}
		else if(bmi >= 25.0 && bmi <= 39.9){
			return "Overweight";
		}
		else{
			return "Obese"
		}
	}
	
  }

 
  
}