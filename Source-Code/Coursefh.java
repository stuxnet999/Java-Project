import java.util.*;
import java.io.*;
public class Coursefh{
  public static ArrayList<Course> get(){
    ArrayList<Course> list=new ArrayList<Course>();
    try{
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("../files/Courses"));
      while(true){
        list.add((Course)in.readObject());
      }
    }
    catch(EOFException e){
      return list;
    }
    catch(IOException e){
      System.out.print("  [*] An Error Occured While Reading the Courses.");
      System.out.println(" Please ensure that you enter names first!");
      return list;
    }
    catch(ClassNotFoundException e){
      System.out.println("*****Error ! Course.java file is missing !*****");
      return list;
    }
  }

  public static void put(ArrayList<Course> list){
    try{
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("../files/Courses"));
      for(Course obj:list){
        out.writeObject(obj);
      }
    }
    catch(IOException e){
      System.out.print("  [*] An Error Occured While Reading File.");
      System.out.println(" Please ensure that you enter Names first!");
    }
  }
}
