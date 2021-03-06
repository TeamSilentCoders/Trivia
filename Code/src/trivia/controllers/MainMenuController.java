/*
 * The MIT License
 *
 * Copyright 2015 Team Silent Coders.
 * Application developed for Amsterdam University of Applied Sciences and Amsta.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package trivia.controllers;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import trivia.Trivia;

/**
 * This class handles the player's main menu.
 *
 * @author Team Silent Coders
 * @version 1.0
 */
public class MainMenuController extends Trivia implements Initializable {

	@FXML
	private Button startGame;

	@FXML
	private Button gameSetUp;

	@FXML
	private Label explanationA;

	@FXML
	private Label explanationB;

	@FXML
	private Label explanationC;

	@FXML
	private Label explanationD;

	List<Label> helpItems;

	/**
	 * Initializes the controller class.
	 *
	 * @param url
	 * @param rb
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		helpItems = Arrays.asList(explanationA, explanationB, explanationC, explanationD);
		startGame.setOnAction(this::loadView);
		gameSetUp.setOnAction(this::loadView);
	}

	/**
	 * If isVisible() is false, then set true & vice versa.
	 */
	@FXML
	private void toggleHelp() {
		for (Label a : helpItems) {
			a.setVisible(!a.isVisible());
		}
	}

	/**
	 * Triggers a confirmation dialog for quitting the app.
	 */
	@FXML
	private void exit() {
		if (alertDialog(Alert.AlertType.CONFIRMATION, "Afsluiten",
				"Weet u zeker dat u wilt afsluiten?",
				"Hiermee wordt het programma afgesloten.")) {
			System.exit(0);
		}
	}

}
