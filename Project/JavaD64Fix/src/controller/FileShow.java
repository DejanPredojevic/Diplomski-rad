package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import util.Singleton;

public class FileShow implements ActionListener {

	private File file;

    public FileShow(File file) {
        this.file = file;
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Singleton.getInstance().getFiles().setSelected(file);
	}

}