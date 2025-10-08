class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){

  }

  void print(String word){
	System.out.println = word;
  }
  Double FtoC(double FRNHT){
	double celc = (FRNHT - 32) * (5.0/9);
	return celc;
  }

  Double sphereVolume(double Radius){
	double volume = (Radius * Radius * Radius) * Math.PI * (4.0/3);
	return volume;
  }
  Double coneValue(double Radius2,Double height){
	double volume2 = Math.PI * (Radius2 * Radius2) * (height/3.0);
	return volume2;
}
	Double distance(double x1, double y1, double x2, double y2){
		double Y = y2 - y2;
		double X = x2 - x1;
		double d = Y/X;
		return d;
	}
}