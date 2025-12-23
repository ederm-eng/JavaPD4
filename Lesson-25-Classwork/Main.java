import java.util.Random;
class Main {
    public static void main(String[] args) {
        (new Main()).init();
 }

void init(){
System.out.println("hello");
}

String OneOf(){
  String loolite = "hello";
  String bld1 = "";
  for (int i = 0; i < loolite.length(); i++){
    int rndm = (int)(Math.random() * loolite.length());
    String Randomiziner = loolite.substring(rndm, rndm + 1);

   bld1 += Randomiziner;
}
                                            
  String bld = "";
  for (int j = 0; j < loolite.length(); j++){
  String ch = bld1.substring(j, j + 1);
  if  (ch.equals("j"))
    subst = 'z';
    bld += subst;
  }
  else if (ch.equals("z")) {
  subst = 'j';
  bld += subst;
  }

  else if (ch == 'e') {
  subst = 'a';
  bld += subst;
  }
  else if (ch == 'a') {
  subst = 'e';
  bld += subst;
  } 

  else if (ch == 'l'){
    subst = 't';
    bld += subst;
  } 

  else if (ch == 't'){
    subst = 'l';
    bld += subst;
  } 

  else if (ch == 'J'){
    subst = 'Z';
    bld += subst;
  } 

  else if (ch == 'Z'){
    subst = 'J';
    bld += subst;
  } 

  else if (ch == 'E'){
    subst = 'A';
    bld += subst;
  } 

  else if (ch == 'A'){
    subst = 'E';
    bld += subst;
  } 

  else if (ch == 'L'){
    subst = 'T';
    bld += subst;
  }

  else if (ch == 'T'){
    subst = 'L';
    bld += subst;
  }

  else{
    bld += ch;
  }
}
return bld;

}
}
