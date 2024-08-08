package refactoring_guru.factory_method.example.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Windows button implementation.
 */
public class WindowsButton implements Button {
	public void render() {
		System.out.println("Windows Test Button");
		onClick();
	}

	public void onClick() {
		System.out.println("Click! Windows Button says - 'Hello World!'");
	}
}