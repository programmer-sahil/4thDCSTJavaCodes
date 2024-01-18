// This is just a Template 

// Indicating the best Code structure 
// Java coders should follow

// We will use such templates in the NEXT COURSE.

for(File f : getFiles()){
    //You might want to open a file and read it
    InputStream fis;
    //You might want to write into a file
    OutputStream fos;
    try{
        handleFile(f);
        fis = new FileInputStream(f);
        fos = new FileOutputStream(f);
    } catch(IOException e){
        //Handle exceptions due to bad IO
    } finally {
        // In fact you should do a try/catch for 
        // each close operation.
        try{
            //If you handle streams, don't forget to close them.
            fis.close();
            fos.close();
        }catch(IOException e){
            //Handle the fact that close didn't work well.
        }
    }
}