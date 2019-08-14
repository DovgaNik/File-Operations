package fileOperations;

//********************
//*DovgaNik 2018-2019*
//********************

/*
This class prints text from file 
To read from file you must type text in print function arguments. For example:

import File_operatons.filePrint;
filePrint printer = new filePrint();
printer.print("file_name");

If the printing from the file was succesfull function will return 0, if there is printer error
function will return "1"
*/

import java.awt.print.PrinterException;
import javax.swing.JTextPane;

public class filePrint {
    public int print(String txt){
        JTextPane textPane = new JTextPane();
        textPane.setText(txt);
        try {
            textPane.print();
        } catch (PrinterException ex) {
            return(1);
        }
        return(0);
    }
}