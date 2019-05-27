package clk;

import java.awt.Adjustable;

import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter.FilterBypass;

public class Moquito {

	public boolean notienesentidoMetodo(FilterBypass filter, Adjustable adjustable) throws BadLocationException {
		if (filter.getDocument().getText(0, 0).compareTo("salesianos") == 0) {
			if (adjustable.hashCode() > 0) {
				return true;
			} else {
				throw new RuntimeException();
			}
		} else {
			throw new RuntimeException();
		}
	}

}
