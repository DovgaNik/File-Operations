//********************
//*DovgaNik 2018-2019* 
//********************

/*
This class will create new folder

Usage:
    import fileOperations.simple.folderCreate;
    folderCreate checker = new folderCreate;
    create(folderName);
*/

package fileOperations.simple;

import java.io.File;

public class folderCreate {
    public void create(String newFolderName){
        new File(newFolderName).mkdirs();
    }
}
