package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaInicial;

public class uploadDeArquivos {

    private PaginaInicial paginaInicial = new PaginaInicial();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("clico no botao Upload de Arquivo")
    public void clico_no_botao_Upload_de_Arquivo() throws InterruptedException {
        paginaInicial.clicarBotaoUplodDeArquivo();
    }

    @Given("clico para enviar um arquivo")
    public void clico_para_enviar_um_arquivo() throws InterruptedException {
        paginaInicial.clicarBotaoUpload();
    }

    @When("valido mensagem de carregamento {string}")
    public void valido_mensagem_de_carregamento(String string) throws InterruptedException {
        Assert.assertEquals(paginaInicial.mensagemSucesso(string),string);
    }

    @Then("valido mensagem de inserido com sucesso {string}")
    public void valido_mensagem_de_inserido_com_sucesso(String string) throws InterruptedException {
        Assert.assertEquals(paginaInicial.mensagemSucesso(string),string);
    }
}