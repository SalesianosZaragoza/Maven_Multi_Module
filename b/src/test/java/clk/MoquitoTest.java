package clk;

import static org.mockito.Mockito.when;

import java.awt.Adjustable;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter.FilterBypass;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
public class MoquitoTest {

	@Mock
	Adjustable adjustable;
	@Mock
	FilterBypass filter;

	Moquito moc = new Moquito();

	@Mock
	private Document document;

	@Test
	public void mockito1() throws BadLocationException {
		when(filter.getDocument()).thenReturn(document);
		when(document.getText(0, 0)).thenReturn("salesianos");

		moc.notienesentidoMetodo(filter, adjustable);
	}

}

