package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Storage {
	String homeDir;
	File save;
	public Storage() {
		homeDir = System.getProperty("user.home");
		save = new File(homeDir+"/save.txt");
	}

	public void storeData(Object ob) {

		FileOutputStream fos = null;
		try {			
			fos = new FileOutputStream(save);		
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ob);
			oos.flush();
			fos.close();
			oos.close();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Event loadData() {
		FileInputStream fis = null;
		Event ev = null;
		try {
			fis = new FileInputStream(save);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ev = (Event) ois.readObject();
			fis.close();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return ev;
	}
}
