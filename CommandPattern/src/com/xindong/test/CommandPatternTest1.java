package com.xindong.test;

import com.xindong.version1.Barbecuer;
import com.xindong.version1.KaoShuCaiCommand;
import com.xindong.version1.KaoYangRouCommand;
import com.xindong.version1.KaoyuCommand;
import com.xindong.version1.WaiterInvoker;

public class CommandPatternTest1 {
	public static void main(String[] args) {
		// init
		Barbecuer receiver = new Barbecuer();
		WaiterInvoker invoker = new WaiterInvoker();
		KaoShuCaiCommand ksc = new KaoShuCaiCommand(receiver);
		KaoYangRouCommand kyr = new KaoYangRouCommand(receiver);
		KaoyuCommand ky = new KaoyuCommand(receiver);
		
		invoker.setOrder(ky);
		invoker.setOrder(kyr);
		invoker.setOrder(ksc);
		
		invoker.cancelOrder(ksc);
		
		invoker.waiterNotify();
		
	}
}
