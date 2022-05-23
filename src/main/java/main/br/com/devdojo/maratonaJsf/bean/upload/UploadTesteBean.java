/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.upload;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class UploadTesteBean implements Serializable{
    private Part arquivo;

    public void upload(){
        try (InputStream is = arquivo.getInputStream()){
            String fileName = arquivo.getSubmittedFileName();
            System.out.println(fileName);
            System.out.println(arquivo.getName());
            System.out.println(arquivo.getSize());
            System.out.println(arquivo.getContentType());
            System.out.println(arquivo.getHeaderNames());
            System.out.println(arquivo.getHeader("content-disposition"));
            System.out.println(arquivo.getHeader(" content-type"));
            Files.copy(is, new File("C:\\Users\\Gestão Tech\\Desktop\\Joao\\JSF\\JSFF",fileName).toPath());
            FacesMessage message= new FacesMessage(FacesMessage.SEVERITY_INFO,"Arquivo Enviado Com sucesso","");
            FacesContext.getCurrentInstance().addMessage(null,message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Part getArquivo() {
        return arquivo;
    }

    public void setArquivo(Part arquivo) {
        this.arquivo = arquivo;
    }
    
    
    
}
