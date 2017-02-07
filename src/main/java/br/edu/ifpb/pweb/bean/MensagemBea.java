package br.edu.ifpb.pweb.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="msgBean")
public class MensagemBea {
	
	private String mensagem = "Bem vindo ao JSF";

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
