package br.edu.insper.desagil.whatsapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChatTest {
	private Chat chat;
	
	@BeforeEach
	public void setUp() {
		chat = new Chat();
	}

	@Test
	public void testNenhum() {
		assertEquals("<main></main>", chat.renderAll());
	}
	
	@Test
	public void tresComuns() {
		chat.post(new Message("maria", "hello world"));
		chat.post(new Message("jose", "goodbye universe"));
		chat.post(new Message("mariana", "something else"));
		assertEquals(
				"<main>" +
				"<p><strong>maria:</strong>hello world</p>" +
				"<p><strong>jose:</strong>goodbye universe</p>" + 
				"<p><strong>mariana:</strong>something else</p>" +
				"</main>",
		chat.renderAll());
		
	}
	
	@Test
	public void tresImagens() {
		chat.post(new ImageMessage("keiya", "jogo", "jogo.png"));
		chat.post(new ImageMessage("obito", "console", "console.jpg"));
		chat.post(new ImageMessage("matheus", "controle", "controle.png"));
		assertEquals(
				"<main>" +
				"<figure><p><strong>keiya:</strong>jogo</p><img src=\"jogo.png\"></figure>" +
				"<figure><p><strong>obito:</strong>console</p><img src=\"console.jpg\"></figure>" +
				"<figure><p><strong>matheus:</strong>controle</p><img src=\"controle.png\"></figure>" +
				"</main>",
		chat.renderAll());
		
	}
	
	@Test
	public void tresVideos() {
		chat.post(new VideoMessage("leo", "computador", "computador.mp4"));
		chat.post(new VideoMessage("lucas", "teclado", "teclado.mp4"));
		chat.post(new VideoMessage("lara", "tela", "tela.mp4"));
		assertEquals(
				"<main>" +
				"<figure><p><strong>leo:</strong>computador</p><video src=\"computador.mp4\"></figure>" +
				"<figure><p><strong>lucas:</strong>teclado</p><video src=\"teclado.mp4\"></figure>" +
				"<figure><p><strong>lara:</strong>tela</p><video src=\"tela.mp4\"></figure>" +
				"</main>",
		chat.renderAll());
	}
	
	@Test
	public void tresCada() {
		chat.post(new Message ("paulo", "fala pessoal"));
		chat.post(new ImageMessage ("bruno", "meme", "meme.png"));
		chat.post(new VideoMessage("keiya", "zoio", "zoio.mp4"));
		assertEquals(
				"<main>" +
				"<p><strong>paulo:</strong>fala pessoal</p>" +
				"<figure><p><strong>bruno:</strong>meme</p><img src=\"meme.png\"></figure>" +
				"<figure><p><strong>keiya:</strong>zoio</p><video src=\"zoio.mp4\"></figure>" +
				"</main>",
		chat.renderAll());
	}

}
