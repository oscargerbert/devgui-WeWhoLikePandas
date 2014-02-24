package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Storage implements Serializable{
	String homeDir;
	File save;
	public Storage() {
		homeDir = "C:"+System.getProperty("file.separator")+"Users"+System.getProperty("file.separator")+"Bastawi"+System.getProperty("file.separator")+"Desktop"+System.getProperty("file.separator")+"AD2";
		//homeDir = System.getProperty("user.home");
		save = new File(homeDir+System.getProperty("file.separator")+"Group9.txt");
		
	}
	public Storage(String input) {
		homeDir = System.getProperty("user.home");
		save = new File(homeDir+System.getProperty("file.separator")+input);
		try {
			save.setExecutable(true, false);
			save.setReadable(true, false);
			save.setWritable(true, false);
			save.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(save.getPath());
	}

	public void storeData(Object ob) {

		FileOutputStream fos = null;
		System.out.print(save.canWrite());
		try {			
			fos = new FileOutputStream(save);		
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			try {
				oos.writeObject(ob);				
			} catch (Exception e) {
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

