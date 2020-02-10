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
     * for file instance
     */
    public File file;

    /**
     * path to where the file is saved
     */
    public final String path;

    /**
     * for new createFile instance
     */
    public boolean fvar;

    /**
     * logged in user (windows logged in user)
     */
    public String currentUser;

//    constructor
    public FileOperations() {
        currentUser = System.getProperty("user.name");
        path = "C:\\Users\\" + currentUser + "\\Documents\\NetBeansProjects\\E_Rights\\src\\file_op\\files\\" + currentUser + ".txt";
        file = new File(path);
    }

    /**
     * Confirms if file exists or not
     *
     * @return boolean
     */
    public boolean fileExists() {
        return file.exists();
    }

    /**
     * Constructs a new file
     *
     * @return boolean
     */
    public boolean createFile() {
        try {
//                file.mkdirs();
//            create new file      
            fvar = file.createNewFile();
            if (fvar) {
                JOptionPane.showMessageDialog(null, "File is ready for processing", "File", JOptionPane.INFORMATION_MESSAGE);
//	          System.out.println("File has been created successfully");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "File already present at the specified location", "File", JOptionPane.INFORMATION_MESSAGE);
//	          System.out.println("File already present at the specified location"); 
                return true;
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Exception Occurred: \n" + e, "File", JOptionPane.ERROR_MESSAGE);
//    		System.out.println("Exception Occurred: "+e);
            return false;
        }

    }

    /**
     * writes to an existing file through an array iteration
     *
     * @param content content to write 
     */
    public void writeToFile(String[] content) {
//        variable declaration
        PrintWriter pw;
        BufferedWriter bw;
        FileWriter fw;
        try {
//          re-create file if doesnt exist
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
//This will add a new line to the file content
            if (file.length() != 0) {
                pw.println("");
            }
//                 use a loop to write to file
            for (String content1 : content) {
//                String string = content[i];
                pw.println(content1); 
                pw.println("_ _ _ _ _ _ _ _ _ _ _ ");
            }
            pw.close();
//            JOptionPane.showMessageDialog(null, "Data successfully appended at the end of file", "File", JOptionPane.INFORMATION_MESSAGE);
//            System.out.println("Data successfully appended at the end of file");

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Exception Occurred: \n" + ioe, "File", JOptionPane.ERROR_MESSAGE);
//            System.out.println("Exception occurred: \n" + ioe);
        }
    }

    /**
     * reads the content of a file
     */
    public void readFile() {

    }

//    public static void main(String[]args){
//        FileOperations fileOperations = new FileOperations("testfile");
//        String [] st = {"game","pick"};
//        fileOperations.writeToFile(st);
//    } 
}
