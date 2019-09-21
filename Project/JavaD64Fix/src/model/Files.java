package model;

import java.io.File;
import java.util.Observable;

public class Files extends Observable{
	
	File[] files = null;
	File selected = null;
	byte[] newFile = null;
	String info = "";
	

	public File[] getFiles() {
		return files;
	}

	public void setFiles(File[] files) {
		this.files = files;
		setChanged();
        notifyObservers("FAJLOVI");
	}
	
	public void refresh() {
		setChanged();
        notifyObservers("FAJLOVI");
	}

	public File getSelected() {
		return selected;
	}

	public void setSelected(File selected) {
		this.selected = selected;
		setChanged();
        notifyObservers("FAJL");
	}

	public byte[] getNewFile() {
		return newFile;
	}

	public void setNewFile(byte[] newFile) {
		this.newFile = newFile;
		setChanged();
        notifyObservers("FIX");
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
		setChanged();
        notifyObservers("INFO");
	}
	
	
	
}