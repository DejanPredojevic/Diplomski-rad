package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import util.Singleton;

public class FileRefresh implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Singleton.getInstance().getCompare().deleteCompare();
		Singleton.getInstance().getCompare().deleteFiles();
		Singleton.getInstance().getFiles().refresh();
		Singleton.getInstance().getFiles().setInfo("Refresh is done!");
		Singleton.getInstance().getFiles().setNewFile(null);
	}

}
