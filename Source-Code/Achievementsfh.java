import java.util.*;
import java.io.*;

public class Achievementsfh{
  public static ArrayList<Achievements> get(String file){
    String filename="../files/Achievements/"+file;
    ArrayList<Achievements> list=new ArrayList<Achievements>();
    try{
      ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
      while(true){
        list.add((Achievements)in.readObject());
      }
    }
    catch(EOFException e){
      return list;
    }
    catch(IOException e){
      System.out.print("  [*] An Error Occured While Reading the Achievements.");
      System.out.println(" Please ensure that you enter Data first!");
      return list;
    }
    catch(ClassNotFoundException e){
      System.out.println("*****Error ! Achievements.java file is missing !*****");
      return list;
    }
  }

  public static void put(ArrayList<Achievements> list,String file){
    String filename="../files/Achievements/"+file;
    try{
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
      for(Achievements obj:list){
        out.writeObject(obj);
      }
    }
    catch(IOException e){
      System.out.print("  [*] An Error Occured While Reading Achievements.");
      System.out.println(" Please ensure that you enter data first!");
    }
  }
}
