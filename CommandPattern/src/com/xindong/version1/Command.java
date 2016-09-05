package com.xindong.version1;

public abstract class Command {
	protected Barbecuer receiver = null;
	
	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}
	
	public abstract void execute();
}
