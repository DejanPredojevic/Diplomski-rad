package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;

import util.Singleton;

public class FileSave implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(Singleton.getInstance().getFiles().getNewFile() != null) {
			JFileChooser fileChooser = new JFileChooser();
			File dir = new File("C:\\Users\\Dejan\\Desktop\\D64FILES");
			fileChooser.setCurrentDirectory(dir);
			fileChooser.setDialogTitle("Specify a file to save");   
			int userSelection = fileChooser.showSaveDialog(null);
			 
			if (userSelection == JFileChooser.APPROVE_OPTION) {
			    File fileToSave = fileChooser.getSelectedFile();
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
