import java.io.*;
public class FileWriter{
	//fields
	static String path;
	static String fileName;
	static String fileType;
	static int counter;
	static PrintWriter file;
	static String closeBrack = "}";
	//constructor
	public FileWriter(String path, String fileName, String fileType) throws FileNotFoundException, UnsupportedEncodingException{
		this.path = path;
		this.fileName = fileName;
		this.fileType = fileType;
		counter = 0;
		file = new PrintWriter(path+fileName+"."+fileType, "UTF-8");
	}
	//toString
	public String toString(){
		return "A "+fileType+" FileWriter that writes to "+path+".";
	}
	//other methods
	public void output(String toOutput){
		for(int i=0; i<counter; i++) file.print("\t");
		file.println(toOutput);
		if(toOutput.charAt(toOutput.length()-1) == '{') counter++; //or possibly if it was an endparen?
		else if(toOutput.charAt(toOutput.length()-1) == '}') counter--;
	}
}