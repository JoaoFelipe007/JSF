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
public class newRegistrationFlowBuilder implements Serializable {

    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        String flowId = "newregistration";
        flowBuilder.id("", flowId);
        flowBuilder.viewNode(flowId, "/newregistration/newregistration.xhtml").markAsStartNode();
        flowBuilder.viewNode(flowId, "/newregistration/newregistration2.xhtml");
        flowBuilder.viewNode(flowId, "/newregistration/newregistration3.xhtml");
        flowBuilder.switchNode("newRegistrationPage2")
                .defaultOutcome(flowId)
                .switchCase()
                .condition("#{not empty testeFlowBuilderBean.nome and not empty testeFlowBuilderBean.sobrenome}")
                .fromOutcome("newregistration2");
        flowBuilder.returnNode("exitToInicio").fromOutcome("/inicioFlow.xhtml");
        flowBuilder.returnNode("exitToIndex").fromOutcome("/index.xhtml");

        flowBuilder.flowCallNode("callNewPendencies")
                .flowReference("", "newpendencies")
                .outboundParameter("userName", "#{testeFlowBuilderBean.nome}");

        flowBuilder.flowCallNode("callNewPendencies")
                .flowReference("", "newpendencies")
                .outboundParameter("userSurname", "#{testeFlowBuilderBean.sobrenome}");
        return flowBuilder.getFlow();
    }

}
