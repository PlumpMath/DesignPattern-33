package com.design.command.define;

public class Invoker {
	
	public void invoke(Command command){
		command.execute();
	}
}
