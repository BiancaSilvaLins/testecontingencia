package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaInicial;

public class crudModal {

    private PaginaInicial paginaInicial = new PaginaInicial();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("clico no botao Modal de Entregas")
    public void clico_no_botao_Modal_de_Entregas() {
        paginaInicial.clicarBotaoModal();
    }

    @Given("clico no botao Novo Modal de Entrega")
    public void clico_no_botao_Novo_Modal_de_Entrega() throws InterruptedException {
        Thread.sleep(3000);
        paginaInicial.clicarBotaoNovaModal();
    }

    @Given("seleciono uma Transportadora")
    public void seleciono_uma_Transportadora() throws InterruptedException {
        Thread.sleep(2000);
        paginaInicial.selecionarTransportadora();
    }

    @Given("seleciono um Tipo de Entrega1")
    public void seleciono_um_Tipo_de_Entrega1() throws InterruptedException {
        Thread.sleep(2000);
        paginaInicial.selecionarTipoEntrega1();
    }

    @Given("seleciono um Tipo de Entrega2")
    public void seleciono_um_Tipo_de_Entrega2() throws InterruptedException {
        paginaInicial.selecionarTipoEntrega2();
    }

    @Given("preencher o campo Codigo Externo {string}")
    public void preencher_o_campo_Codigo_Externo(String string) {
        paginaInicial.preencherCodExterno(string);
    }

    @Given("preencher o campo Nome {string}")
    public void preencher_o_campo_Nome(String string) {
        paginaInicial.preencherNome(string);
    }


    @Given("clico no botao alterar Modal de Entrega")
    public void clico_no_botao_alterar_Modal_de_Entrega() {
        paginaInicial.clicarAlterar();
    }

    @Given("clico para seleciona transportadora")
    public void clico_para_seleciona_transportadora() throws InterruptedException {
        paginaInicial.selecionarTransportadoraConsult();
    }

    @Given("validar campo codigo externo {string}")
    public void validar_campo_codigo_externo(String string) {
        paginaInicial.validarCodExterno(string);
    }

    @When("validar campo nome {string}")
    public void validar_campo_nome(String string) {
        paginaInicial.validarNome(string);
    }

    @Then("validar campo transportadora {string}")
    public void validar_campo_transportadora(String string) {
        paginaInicial.validarTransportadora(string);
    }

    @Given("clico no botao excluir")
    public void clico_no_botao_excluir() {
        paginaInicial.clicarExcluir();
    }

    @When("clicar no botao excluir da modal")
    public void clicar_no_botao_excluir_da_modal() throws InterruptedException {
        paginaInicial.clicarExcluirDaModal();
    }

    @When("clicar no botao excluir na modal")
    public void clicar_no_botao_excluir_na_modal() throws InterruptedException {
        paginaInicial.clicarExcluirNaModal();
    }

    @Then("validar mensagem de sucesso {string}")
    public void validar_mensagem_de_sucesso(String string) throws InterruptedException {
        Assert.assertEquals(paginaInicial.mensagemSucesso(string), string);
    }

    @Then("validar mensagem de sucesso da exclusao {string}")
    public void validar_mensagem_de_sucesso_da_exclusao(String string) {
        Assert.assertEquals(paginaInicial.mensagemSucessoExcluir(string), string);
    }

    @Then("validar mensagem de erro {string}")
    public void validar_mensagem_de_erro(String string) {
        Assert.assertEquals(paginaInicial.mensagemErro(string), string);
    }

    @Then("validar a mensagem de erro de Modal ja cadastrada {string}")
    public void validar_a_mensagem_de_erro_de_Modal_ja_cadastrada(String string) throws InterruptedException {
        Assert.assertEquals(paginaInicial.mensagemSucesso(string), string);
    }

}