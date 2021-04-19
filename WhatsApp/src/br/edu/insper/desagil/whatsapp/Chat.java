package br.edu.insper.desagil.whatsapp;

import java.util.ArrayList;
import java.util.List;

public class Chat {
	private List<Message> messages;

	public Chat() {
		super();
		this.messages = new ArrayList<>();
	}
	
	public void post(Message mensagem) {
		this.messages.add(mensagem);
		
	}
	
	public String renderAll() {
		String s = "<main>";
		for (Message message: this.messages) {
			s+=message.render();
		}
		return s + "</main>";
	}

	public List<Message> getMessages() {
		return messages;
	}
	

}
