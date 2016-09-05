package com.xindong.version1;

public class KaoYangRouCommand extends Command {
	public KaoYangRouCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.kaoYangrou();
	}
}
