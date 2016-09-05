package com.xindong.version1;

public class KaoyuCommand extends Command {
	public KaoyuCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.kaoYu();
	}
}
