class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

        
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */
  Double groupSavings(double tickets){
   
    if (tickets < 8 && 1 < tickets){
      double total = 11 * tickets
      return total
    }
    else if ( tickets < 18 && 9 < tickets){
      double total = tickets * 10.50
      return total
    }
    else{
      double total = tickets * 8.50
      return total
    }
  }
  
  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */
  Double groceryDiscount(double subtotal, double cannedBeans){
    if (subtotal < 200 && subtotal < 100 && cannedBeans <= 3){
    double discount = 10
    return discount 
    }
  }
    if (subtotal > 200 && cannedBeans > 4){
      double discount = 25
    }
    else{
      double discount = 0
      return discount
    }

}