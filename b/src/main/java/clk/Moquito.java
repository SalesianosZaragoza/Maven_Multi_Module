package clk;

import java.awt.Adjustable;

import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter.FilterBypass;

public class Moquito {

	public boolean notienesentidoMetodo(FilterBypass filter, Adjustable adjustable) throws BadLocationException {
		if (filter.getDocument().getText(1000, 10000).compareTo("salesianos") == 0) {
			if (adjustable.getMaximum() > 0) {
				return true;
			} else {
				throw new RuntimeException();
			}
		} else {
			throw new RuntimeException();
		}
	}

}
