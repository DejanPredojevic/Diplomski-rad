package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import util.Singleton;

public class FileSave implements ActionListener{
	
	String temp = "";

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(Singleton.getInstance().getFiles().getNewFile() != null) {
			JFileChooser fileChooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter(".d64", "d64");
			fileChooser.setFileFilter(filter);
			if(!temp.equals("")) {
				File dir = new File(temp);
				fileChooser.setCurrentDirectory(dir);
			}
			fileChooser.setDialogTitle("Specify a file to save");   
			int userSelection = fileChooser.showSaveDialog(null);
			 
			if (userSelection == JFileChooser.APPROVE_OPTION) {
			    File fileToSave = fileChooser.getSelectedFile();
			    temp = fileToSave.getParentFile().toString();
			    try (FileOutputStream stream = new FileOutputStream(fileToSave.getPath())) {
				    try {
				    	if(Singleton.getInstance().getFiles().getNewFile() != null)
				    		stream.write(Singleton.getInstance().getFiles().getNewFile());
					} catch (IOException e) {
						e.printStackTrace();
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}else {
			Singleton.getInstance().getFiles().setInfo("First you need to select and then fix selected files!");
		}
		
		
	}

}
