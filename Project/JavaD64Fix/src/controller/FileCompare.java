package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JCheckBox;

import util.Singleton;

public class FileCompare implements ActionListener {
	
	private File file;

    public FileCompare(File file) {
        this.file = file;
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JCheckBox cb = (JCheckBox) e.getSource();
		if(cb.isSelected())
			Singleton.getInstance().getCompare().setCompare(file);
		else
			Singleton.getInstance().getCompare().deleteCompare(file);
	}
	

}
