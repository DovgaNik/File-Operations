//********************
//*DovgaNik 2018-2019*
//********************

/*
This class reads text from file 
To read from file you must type file name in read function arguments. For example:

    import fileOperations.simple.fileRead;
    fileRead reader = new fileRead();
    reader.read("file_name");

If the reading from the file was succesfull function will return the text from file, if there is no file with such name 
function will return "1", if there is IOException function will return "2"
*/
package fileOperations.simple;

import java.io.*;

public class fileRead {
    public String read(String file_name){
        String txt = "";
        String line = null;
            try {
                FileReader read = new FileReader(file_name);
                BufferedReader buffer = new BufferedReader(read);
                while((line = buffer.readLine()) != null){
                    txt = txt + line + "\n";
                }
                buffer.close();
            }catch (FileNotFoundException ex) {
                return("1");
            }catch(IOException ex){
                return("2");
            }
            
        return(txt);
    }
}