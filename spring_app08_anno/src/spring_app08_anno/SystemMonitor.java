package spring_app08_anno;

import org.springframework.beans.factory.annotation.Autowired;

public class SystemMonitor implements Monitor {
	Sender sender;
	
	@Autowired
	public void setSender(Sender sender) {
		this.sender = sender;
		
	}
	
	public void showMonitor() {
		if(sender != null) sender.show();
		else System.out.println("sender is null");
	}
	
	
	
}
