
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
  int X1 = Input.readInt();
  int Eq1 = X1 * X1 * X1 * X1 * X1 * X1 * X1;
  System.out.println("Your answer for equation 1 is:" + Eq1);
/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/

  double Z1 = Input.readDouble(); 
  double Eq1_1 = Math.pow(Z1, 3);
  System.out.println("Your answer for equation 1.1 is:" + Eq1_1); 
/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
    double T1 = Input.readDouble();
    double R1 = Input.readDouble();
    double r = R1 + 2;
    double Eq2 = (Math.pow(T1, 5)) * (Math.pow(r,4));
    System.out.println("Your answer for equation 2 is" + Eq2);
 

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/

    double A2  = Input.readDouble();
    double B1 = Input.readDouble();
    double Eq3 = Math.sqrt((B1 + A2) );
    System.out.println("Your answer for Equation 3 is:" + Eq3);


/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
    double X3 = Input.readDouble();
    double X4 = Input.readDouble();
    double Y1 = Input.readDouble();
    double Y2 = Input.readDouble();
    double Eq4 = Math.sqrt((Math.pow((X4-X3),2)+ (Math.pow(Y2-Y1),2)))
    System.out.println("Your answer for equation 4 is:" + Eq4)



/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/





/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/




/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}