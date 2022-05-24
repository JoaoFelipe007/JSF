/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.bean.taglibfunction;

import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import static java.util.Arrays.asList;
import org.apache.commons.lang3.text.WordUtils;

/**
 *
 * @author Gestão Tech
 */
@Named
@ViewScoped
public class TaglibFunctionTesteBean implements Serializable {

    private List<String> names = asList("Homem Aranha","Laterna Verde", "Garota Esquilo");

    public void init(){
        names.forEach(name ->System.out.println(WordUtils.capitalizeFully(name)));
    }
    
    
    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

}
