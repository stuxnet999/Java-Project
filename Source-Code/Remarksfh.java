import java.util.*;
import java.io.*;

public class Remarksfh{
  public static ArrayList<Remarks> get(String file){
    String filename="../files/Remarks/"+file;
    ArrayList<Remarks> list=new ArrayList<Remarks>();
    try{
      ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
      while(true){
        list.add((Remarks)in.readObject());
      }
    }
    catch(EOFException e){
      return list;
    }
    catch(IOException e){
      System.out.print("  [*] An Error Occured While Reading the Remarks.");
      System.out.println(" Please ensure that you enter Data first!");
      return list;
    }
    catch(ClassNotFoundException e){
      System.out.println("*****Error ! Remarks.java file is missing !*****");
      return list;
    }
  }

  public static void put(ArrayList<Remarks> list,String file){
    String filename="../files/Remarks/"+file;
    try{
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
      for(Remarks obj:list){
        out.writeObject(obj);
      }
    }
    catch(IOException e){
      System.out.print("  [*] An Error Occured While Reading Remarks.");
      System.out.println(" Please ensure that you enter data first!");
    }
  }
}
