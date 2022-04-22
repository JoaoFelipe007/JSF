/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.flowbuilder;

import java.io.Serializable;
import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;

/**
 *
 * @author Gestão Tech
 */
public class newPendednciesFlowBuilder implements Serializable{
    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder){
    String flowId ="newpendencies";
    flowBuilder.id("",flowId);
    flowBuilder.viewNode(flowId,"/newpendencies/newpendencies.xhtml").markAsStartNode();
    flowBuilder.returnNode("goToNewRegistration3").fromOutcome("/newregistration/newregistration3.xhtml");
    flowBuilder.returnNode("exitToNewInicio").fromOutcome("/newregistration/newregistration.xhtml");
    
    flowBuilder.inboundParameter("userName", "#{testeFlowBuilderNestedBean.userName}");
    flowBuilder.inboundParameter("userSurname", "#{testeFlowBuilderNestedBean.userSurname}");
    return flowBuilder.getFlow();
    }
}
