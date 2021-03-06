package br.edu.ifpb.emailsharedpod;

import java.io.Serializable;

/**
 *
 * @author FILIPE
 */
public class Email implements Serializable {

    private Integer id;
    private String remetente;
    private String destinatarios;
    private String assunto;
    private String mensagem;
    private String ipServidor;
    private boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(String destinatarios) {
        this.destinatarios = destinatarios;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getIpServidor() {
        return ipServidor;
    }

    public void setIpServidor(String ipServidor) {
        this.ipServidor = ipServidor;
    }
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Email{" + "id=" + id + ", remetente=" + remetente + ", destinatarios=" + destinatarios + ", assunto=" + assunto + ", mensagem=" + mensagem + ", status=" + status + '}';
    }

}
