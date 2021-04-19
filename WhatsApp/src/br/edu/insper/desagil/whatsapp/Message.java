package br.edu.insper.desagil.whatsapp;

public class Message {
	private String user;
	private String text;
	
	public Message(String user, String text) {
		super();
		this.user = user;
		this.text = text;
	}
	
	public String getUser() {
		return user;
	}
		
	public String getText() {
		return text;
	}
	
	public String render() {
		return "<p><strong>" + this.user + ":</strong>" + this.text + "</p>";
		
	}

}

