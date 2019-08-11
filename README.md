File operations
===

Reader class
---

This class reads text from file.
To read from file you must type file name in read function arguments. For example:

    import File_operatons.file_read;
    file_read reader = new file_read();
    reader.read("file_name");

If the reading from the file was succesfull function will return the text from file, if there is no file with such name function will return "1", if there is IOException function will return "2"

Writer class
---

This class writes text to file. To write text to file you must type text and file name in function arguments. For example 

    import File_operatons.file_write;
    file_write writer = new file_write();
    writer.write("text", "file_name");
If the writing was succesfull function will return null, if there is IOException function will return 1

Printer class
---

This class prints text from file 
To read from file you must type text in print function arguments. For example:

    import File_operatons.file_print;
    file_print printer = new file_print();
    printer.print("file_name");

If the printing from the file was succesfull function will return 0, if there is printer error
function will return "1"
