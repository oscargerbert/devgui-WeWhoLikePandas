package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Bastawi
 *The object that is to be stored needs to implement Serializable.
 */
public class Storage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4369339121794755806L;
	String homeDir;
	File save;
	public Storage() {
		homeDir = System.getProperty("user.home");
		save = new File(homeDir+System.getProperty("file.separator")+"Group9.txt");		
	}
	
	public Storage(String input) {
		homeDir = System.getProperty("user.home");
		save = new File(homeDir+System.getProperty("file.separator")+input);
	}
	public void createFile() {
		try {
			save.setExecutable(true, false);
			save.setReadable(true, false);
			save.setWritable(true, false);
			save.createNewFile();
		} catch (IOException e) {
			System.out.print("Failed to create new file!");
		}
	}
	public void storeData(Object ob) {
		FileOutputStream fos = null;
		System.out.print(save.canWrite());
		try {			
			fos = new FileOutputStream(save);		
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			try {
				oos.writeObject(ob);				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.print("Fail at writing!;");
			}
			oos.flush();
			fos.close();
			oos.close();
		} catch (IOException e) {
			System.out.print("File not found!");
		}		
	}
	public Object loadData() {
		FileInputStream fis = null;
		Object ev = null;
		try {
			fis = new FileInputStream(save);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ev = ois.readObject();
			fis.close();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
		}
	return ev;
	}
}

