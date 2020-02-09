package file_op;

/**
 * @author Emmanuel Amanga
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FileOperations {

    /**
     * variable declaration
     */
    public File file;
    public String path;
    public boolean fvar;
//    constructor

    public FileOperations(String fn) {
        path = "C:\\Users\\Doreen Midecha\\Documents\\NetBeansProjects\\E_Rights\\src\\file_op\\files\\" + fn + ".txt";
        file = new File(path);
    }

    /**
     * Constructs a new file
     *
     */
    public void createFile() {
        try {
//            create new file      
            fvar = file.createNewFile();
            if (fvar) {
                JOptionPane.showMessageDialog(null, "File is ready for processing", "File", JOptionPane.INFORMATION_MESSAGE);
//	          System.out.println("File has been created successfully");
            } else {
                JOptionPane.showMessageDialog(null, "File already present at the specified location", "File", JOptionPane.WARNING_MESSAGE);
//	          System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Exception Occurred: \n" + e, "File", JOptionPane.ERROR_MESSAGE);
//    		System.out.println("Exception Occurred: "+e);
        }
    }

    /**
     * writes to an existing file through an array iteration
     *
     * @param content
     */
    public void writeToFile(String[] content) {
        try {
//          re-create file if doesnt exist
            if (!file.exists()) {
                file.createNewFile();
            }            
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            //This will add a new line to the file content
            try (PrintWriter pw = new PrintWriter(bw)) {
//                 use a loop to write to file
                for (int i = 0; i < content.length; i++) {
                    String string = content[i];
                   pw.println(string); 
                }               
                
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Exception Occurred: \n" + e, "File", JOptionPane.ERROR_MESSAGE);
            }
             JOptionPane.showMessageDialog(null,"Data successfully appended at the end of file" , "File", JOptionPane.INFORMATION_MESSAGE);
//            System.out.println("Data successfully appended at the end of file");
            
        } catch (IOException ioe) {
             JOptionPane.showMessageDialog(null, "Exception Occurred: \n" + ioe, "File", JOptionPane.ERROR_MESSAGE);
//            System.out.println("Exception occurred: \n" + ioe);
        }
    }
    
    public void readFile(){
        
    }

//    public static void main(String[]args){
//        FileOperations fileOperations = new FileOperations("testfile");
//        String [] st = {"game","pick"};
//        fileOperations.writeToFile(st);
//    } 
}
