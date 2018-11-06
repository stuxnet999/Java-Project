import java.util.*;
import java.io.*;

public class Achievements extends Achievementsfh implements Serializable{
  String event;
  boolean won;
  int position;
  String prize;

  Achievements(){
    event="";
    won=false;
    position=0;
  }

  public void setEvent(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter event: ");
    event=s.nextLine();
  }

  public void setWon(){
    Scanner s=new Scanner(System.in);
    while(true){
      System.out.print("Did he/she win ?(Y/n) : ");
      String str = s.nextLine();
      str=str.toUpperCase();
      char tmp;
      if(str.length()==0)
        tmp='\n';
      else
        tmp=str.charAt(0);
      if(tmp=='Y'){
        won=true;
        break;
      }
      else if(tmp=='N'){
        won=false;
        break;
      }
      else if(tmp=='\n')
        break;
      else
        System.out.println("Enter Y or N !");
    }
  }

  public void setPosition(){
    System.out.print("Enter Position: ");
    int tmp=Functions.getint();
    if(tmp!=0)
      position=tmp;
  }

  public void setPrize(){
    Scanner s=new Scanner(System.in);
    System.out.print("So..What was the prize ? ");
    prize=s.nextLine();
  }

  public String getEvent(){
    return event;
  }

  public String getPrize(){
    return prize;
  }

  public int getPosition(){
    return position;
  }

  public boolean setDetails(){
    setEvent();
    if(event.length()==0){
      System.out.println("Empty event !");
      return false;
    }
    setWon();
    if(won){
      setPosition();
      setPrize();
    }
    return true;
  }

  public void print(int idx){
    String tmp="";
    for(int i=0;i<100;i++){
      tmp=tmp+'-';
    }
    System.out.println(tmp);
    System.out.println("Sl no. : "+(idx+1));
    System.out.println("Event: "+event);
    if(won){
      System.out.println("Position: "+position);
      System.out.println("Prize: "+prize);
    }
    System.out.println(tmp);
  }


}
