package by.bobruisk.trainingmanual.listener.inputpanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import by.bobruisk.trainingmanual.gui.MainWindow;

public class SectionNameTextFieldListener implements KeyListener {

	private MainWindow mainWindow;

	public SectionNameTextFieldListener(MainWindow mainWindow) {
		this.mainWindow = mainWindow;

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {

		if (!mainWindow.inputNewQuestionPanel.sectionNameTextField.getText().isEmpty()) {
			mainWindow.inputNewQuestionPanel.topicComboBox.setSelectedItem("");
			mainWindow.inputNewQuestionPanel.topicComboBox.setEnabled(false);
			mainWindow.inputNewQuestionPanel.topicNameTextField.setEnabled(true);

		} else {
			if (mainWindow.inputNewQuestionPanel.sectionComboBox.getSelectedItem().equals("")) {
				mainWindow.inputNewQuestionPanel.topicComboBox.setEnabled(true);
				mainWindow.inputNewQuestionPanel.topicNameTextField.setText("");
				mainWindow.inputNewQuestionPanel.topicNameTextField.setEnabled(false);
				mainWindow.inputNewQuestionPanel.questionTextTextField.setText("");
				mainWindow.inputNewQuestionPanel.questionTextTextField.setEnabled(false);
			}
			if (mainWindow.inputNewQuestionPanel.topicNameTextField.getText().isEmpty()) {
				mainWindow.inputNewQuestionPanel.topicComboBox.setEnabled(true);
			}
		}

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
