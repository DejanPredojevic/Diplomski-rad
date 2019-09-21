package model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Compare {
	List<File> compare = new ArrayList<File>();
	List<byte[]> files = new ArrayList<byte[]>();
	
	public List<File> getCompare() {
		return compare;
	}

	public void setCompare(File compare) {
		if(!this.compare.contains(compare)) {
			this.compare.add(compare);
		}
	}
	
	public void deleteCompare(File compare) {
		this.compare.remove(compare);
	}
	
	public void deleteCompare() {
		this.compare = new ArrayList<File>();
	}

	public List<byte[]> getFiles() {
		return files;
	}

	public void setFiles(byte[] file) {
		this.files.add(file);
	}
	
	public void deleteFiles() {
		this.files = new ArrayList<byte[]>();
	}
	
	
}
