package com.xindong.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * request invoke
 * @author wangjinliang
 *
 */
public class WaiterInvoker {
	private List<Command> list = new ArrayList<Command>();
	
	public void setOrder(Command command) {
		if (command instanceof KaoyuCommand){
			System.out.println("waiter: kao yu mei le");
		} else {
			list.add(command);
		}
	}
	
	public void cancelOrder(Command command) {
		if (list.contains(command)) {
			list.remove(command);
		} else {
			System.out.println("you did not order this");
		}
	}
	
	public void waiterNotify() {
		for (Command command : list) {
			command.execute();
		}
		list.clear();
	}
}
