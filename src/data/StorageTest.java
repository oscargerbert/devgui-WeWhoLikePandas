package data;

import java.io.Serializable;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
@RunWith(JUnit4.class)

public class StorageTest extends TestCase implements Serializable{
	Storage store = new Storage("testing.txt");
	public class Dummy implements Serializable{
		//private static final long serialVersionUID = -6784450006103669111L;
		int x;
		int s;
		public Dummy(int xy, int st) {
			this.x = xy;
			this.s = st;
		}
		public int getX() {
			return this.x;
		}
		public int getS() {
			return this.s;
		}
	}
	Dummy testDummy = new Dummy(5,4);
	Dummy testDummy2 = new Dummy(20,9);

	@Test
	public void sanityTest() {
		store.storeData((Object) testDummy);
		store.storeData((Object) testDummy2);
		testDummy = (Dummy) store.loadData();
		testDummy2 = (Dummy) store.loadData();
		testDummy.equals(testDummy2);
		System.out.print(testDummy.getS());
	}
}
