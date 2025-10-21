class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }
  String creditCardType(String card){
    String cardType1 = card.subString(0,1);
    String cardType2 = card.subString(0,2);
    String cardType3 = card.Substring(0,5);

    if (cardType1.equals("4"){
      return "Visa";
    }
    else if(cardType2.equals("37")){
      return "America Express";
    }
    else if(cardType2.equals(34)){
      return"America Express";
    }
    else if(cardType2.equals("36")){
      return "Diner Club"
    }
    else if(cardType2.equals("51")){
      return "Mastercard";
    }
    else if(cardType2.equals("55")){
      return "Mastercard";
    }   
    else if(cardType3.equals("6011")){
      return "Discovery";
    }
    else if(cardType2.equals("65")){
      return "Discovery";
    }
    else{
      return "Unkown";
    }
  }

  String pigLatin(String word){
     return word.subString(1), + word.subString(0,1), + "ay";
  }

  String nycLocate(String zipCode){
    String zip = zipCode.subString
  }
  
}