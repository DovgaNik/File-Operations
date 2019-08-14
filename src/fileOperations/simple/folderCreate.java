//********************
//*DovgaNik 2018-2019* 
//********************

/*
This class will create new folder
*/

package fileOperations.simple;

import java.io.File;

public class folderCreate {
    void create(String newFolderName){
        new File(newFolderName).mkdirs();
    }
}
