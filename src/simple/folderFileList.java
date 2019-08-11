//********************
//*DovgaNik 2018-2019* 
//********************

/*
This class helps you getting list of files in the folder

Usage:
    import File_operatons.folderFileList;
    folderFileList lister = new folderFileList;
    lister.folderFileList(folderName);
*/
package simple;

import java.io.File;

public class folderFileList {
    public String[] listFilesInFolder(String folderName){//TESTED This function returns list of files in folder
        File folder = new File(folderName);
        File[] listOfFiles = folder.listFiles();
        
        String[] listFiles = new String[listOfFiles.length];//Creating temporary array of strings
        int i = 0;//Creating integer for 'for' loop
        
        for (File file : listOfFiles) {
            if (file.isFile()) {
                listFiles[i] = file.getName();
                i++;
            }
        }
        return listFiles;
    }
}
