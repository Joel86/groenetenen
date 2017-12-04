package be.vdab.jms;


import java.util.logging.Logger;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
class JmsListeners {
	private static final Logger LOGGER = 
			Logger.getLogger(JmsListeners.class.getName());
	@JmsListener(destination = JmsConfig.QUEUE_NAME)
	void ontvangMessage(String boodschap) {
		LOGGER.info(boodschap);
	}
}
