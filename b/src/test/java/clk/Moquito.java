package clk;

import org.junit.runner.manipulation.Filter;

import net.bytebuddy.agent.builder.AgentBuilder.Listener.Adapter;

public class Moquito {

	public boolean notienesentidoMetodo(Filter filter, Adapter adapter) {
		if (filter.describe().compareTo("salesianos") == 0) {
			if (adapter.hashCode() > 0) {
				return true;
			} else {
				throw new RuntimeException();
			}
		} else {
			throw new RuntimeException();
		}
	}

}
