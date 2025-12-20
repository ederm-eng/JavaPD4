class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

bld = “”;
String OneOf(String word){
  for (i = 0; i > word.length(); i++){
      int rndm = randint(0,word.length);
	    String Randomiziner = subString.word(rndm, rndm+1);
	    bld1 += Randomiziner
  }

for (j = 0; i < word.length(); j++){
  String ch = subString.bld1(j,j+1);

if (ch.equals('j')){
  subst = 'z';
  bld += substl;
}

else if (ch.equals('z')){
  subst = 'j';
  bld += subst;
}

else if (ch.equals('e')){
  ch = 'a';
  bld += subst;
}

if (ch.equals('a')){
  subst = 'e';
  bld += substl;
}

  else if (ch.equals('l')){
    subst = 't';
    bld += subst;
}

  else if (ch.equals('t')){
    ch = 'l';
 	    bld += subst;
}

  if (ch.equals('J')){
    subst = 'Z';
    bld += substl;
}

  else if (ch.equals('Z')){
    subst = 'J';
 		bld += subst;
}

  else if (ch.equals('E')){
    ch = 'A';
    bld += subst;
}

  if (ch.equals('A')){
    subst = 'E';
    bld += substl;
}

  else if (ch.equals('L')){
    subst = 'T';
    bld += subst;
}

  else if (ch.equals('T')){
    ch = 'L';
    bld += subst;
}

  else{
			bld += ch;
}
}
return bld;
}