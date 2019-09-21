package util;

import model.Compare;
import model.Files;
import view.MainWindow;

//Lazy Initialization
public class Singleton{

	// Static attribute.
	private static Singleton instance = null;
	
	//Instances
	MainWindow window = null;
	Files files = null;
	Compare compare = null;
	
	// Private constructor.
	private Singleton() {
	}
	
	// Static function.
	public static Singleton getInstance() {
	    // If there is no instance available, create new one (i.e. lazy initialization).
	    if (instance == null) {
	        instance = new Singleton();
	    }
	    return instance;
	}

	public MainWindow getWindow() {
		if(window == null) {
			window = new MainWindow();
		}
		return window;
	}


	public Files getFiles() {
		if(files == null) {
			files = new Files();
			files.addObserver(this.window);
		}
		return files;
	}

	public Compare getCompare() {
		if(compare == null) {
			compare = new Compare();
		}
		return compare;
	}



}
