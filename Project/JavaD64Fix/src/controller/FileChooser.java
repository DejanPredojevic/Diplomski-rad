package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import util.Singleton;

public class FileChooser implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		File dir = new File("C:\\Users\\Dejan\\Desktop\\D64FILES");
		jfc.setCurrentDirectory(dir);
		//JFileChooser chooser = new JFileChooser();
		jfc.setMultiSelectionEnabled(true);
		
		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);
		
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File[] selectedFile = jfc.getSelectedFiles();
			File[] oldFiles = Singleton.getInstance().getFiles().getFiles();
			File[] newFiles = null;
			if(oldFiles != null) {
				List<File> temp = new ArrayList<File>();
				for (int i = 0; i < oldFiles.length; i++) {
					temp.add(oldFiles[i]);
				}
				for (int i = 0; i < selectedFile.length; i++) {
					if(!temp.contains(selectedFile[i])) {
						temp.add(selectedFile[i]);
					}
				}
				newFiles = new File[temp.size()];
				int i = 0;
				for (File file : temp) {
					newFiles[i] = file;
					i++;
				}
			}else {
				newFiles = selectedFile;
			}
			Singleton.getInstance().getFiles().setFiles(newFiles);
		}
	}

}
