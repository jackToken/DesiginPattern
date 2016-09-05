package com.xindong.version1;

public class KaoShuCaiCommand extends Command {
	public KaoShuCaiCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.kaoShuCai();
	}
}
