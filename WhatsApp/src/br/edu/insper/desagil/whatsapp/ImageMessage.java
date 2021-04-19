package br.edu.insper.desagil.whatsapp;

public class ImageMessage extends MediaMessage {
	public ImageMessage(String user, String text, String src) {
		super(user, text, src);
	}	
	
	@Override
	public String preRender() {
		return "<img src=\"" + getSrc() + "\">";
	}
	

}
