//********************
//*DovgaNik 2018-2019*
//********************

/*
This class deletes specified file by the name

Usage:
    import fileOperations.fileDelete;
    fileDelete deleter = new fileDelete();
    deleter.delete(fileName);

If the deletion was successful function will return true if it wasn't successful functions will return false
*/

package fileOperations.simple;

import java.io.File;

public class fileDelete {
    public boolean delete(String fileName){
        File file = new File(fileName); 
          
        if(file.delete()){
           return true;
        }else{
            return false;
        }          
    }
}
