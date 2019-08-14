//********************
//*DovgaNik 2018-2019* 
//********************

/*
This class gives you information about the existant of the folder

Usage:
    import fileOperations.simple.folderExists;
    folderExists checker = new folderExists;
    lister.check(folderName);
*/

package fileOperations.simple;

import java.io.File;

public class folderExists {
    int check(String folderName){
        File tmpDir = new File("/var/tmp");
        if(tmpDir.exists())
            if (tmpDir.isDirectory()){
                return 0;
            }
        return 1;
    }
}
