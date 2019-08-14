//********************
//*DovgaNik 2018-2019* 
//********************

/*
This class gives you information about the existant of the folder

Usage:
    import fileOperations.simple.folderExists;
    folderExists checker = new folderExists;
    lister.check(folderName);

If the folder exists function will return true
*/

package fileOperations.simple;

import java.io.File;

public class folderExists {
    public boolean check(String folderName){
        File tmpDir = new File("/var/tmp");
        if(tmpDir.exists())
            if (tmpDir.isDirectory()){
                return true;
            }
        return false;
    }
}
