//Alex Winstanley 10/21/2016
//Make Rhyme

import java.util.Scanner;
class OneTwoBuck{

public static void main(String [] args){
int tempo;
String output="";

Scanner num = new Scanner(System.in);
System.out.print("Enter a number 1-10 (or 0 to quit): ");
tempo = num.nextInt();

switch(tempo) {
 case 0: output= "Good bye";
 break;
 case 1: output="Buckle your shoe";
  break;
 case 2: output="Buckle your shoe";
  break;
 case 3: output="Shut the door";
  break;
 case 4: output="Shut the door";
  break;
 case 5: output="Pick up sticks";
  break;
 case 6: output="Pick up sticks";
  break;
 case 7: output="Lay them straight";
  break;
 case 8: output="Lay them straight";
  break;
 case 9: output="A big fat hen";
  break;
 case 10: output="A big fat hen";
  break;
}

System.out.println(output);


}

}