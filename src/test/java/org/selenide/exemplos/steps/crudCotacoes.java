package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaInicial;

public class crudCotacoes {

    private PaginaInicial paginaInicial = new PaginaInicial();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("clico no botao cotacao")
    public void clico_no_botao_cotacao() throws InterruptedException {
        paginaInicial.clicarBotaoCotacao();
    }

    @Given("clico na opcao gerar cotacao")
    public void clico_na_opcao_gerar_cotacao() throws InterruptedException {
        paginaInicial.clicarOpcaoCotacao();
    }

    @Given("clico no botao nova cotacao")
    public void clico_no_botao_nova_cotacao() {
        paginaInicial.clicarBotaoNovaCotacao();
    }

    @Given("clico no botao novo produto")
    public void clico_no_botao_novo_produto() {
        paginaInicial.clicarBotaoNovoProduto();
    }

    @Given("preencho o campo sku {string}")
    public void preencho_o_campo_sku(String string) {
        paginaInicial.preencherCampoSku(string);
    }

    @Given("preencho o campo categoria do produto {string}")
    public void preencho_o_campo_categoria_do_produto(String string) {
        paginaInicial.preencherCampoCategoria(string);
    }

    @Given("preencho o campo custo do produto {string}")
    public void preencho_o_campo_custo_do_produto(String string) {
        paginaInicial.preencherCampoCusto(string);
    }

    @Given("clico no checkbox para adicionar valores padroes")
    public void clico_no_checkbox_para_adicionar_valores_padroes() {
        paginaInicial.clicarNoCheckbox();
    }

    @Given("clico no botao salvar cotacao")
    public void clico_no_botao_salvar_cotacao() {
        paginaInicial.clicarBotaoSalvarCotacao();
    }

    @Given("preencho o campo loja origem {string}")
    public void preencho_o_campo_loja_origem(String string) throws InterruptedException {
        paginaInicial.preencherCampoLoja(string);
    }

    @Given("preencho o campo cep de destino {string}")
    public void preencho_o_campo_cep_de_destino(String string) {
        paginaInicial.preencherCampoCepDestino(string);
    }

    @When("clico no botao gerar cotacao")
    public void clico_no_botao_gerar_cotacao() {
        paginaInicial.clicarBotaoGerarCotacao();
    }

    @Given("clico botao modificar")
    public void clico_botao_modificar() {
        paginaInicial.clicarBotaoModificar();
    }

    @Given("validar a mensagem de confirmacao {string}")
    public void validar_a_mensagem_de_confirmacao(String string) {
        Assert.assertEquals(paginaInicial.validarMensagemConfirmacao(string),string);
    }

    @Given("clico na opcao modificar")
    public void clico_na_opcao_modificar() throws InterruptedException {
        paginaInicial.clicarOpcaoModificar();
    }


    @Given("clico no botao visualizar")
    public void clico_no_botao_visualizar() {
        paginaInicial.clicarBotaoVisualizar();
    }


    @Given("valido campo loja {string}")
    public void valido_campo_loja(String string) {
        paginaInicial.validarLoja(string);
    }

    @When("valido campo cep de origem {string}")
    public void valido_campo_cep_de_origem(String string) {

    }

    @Then("valido campo cep de destino {string}")
    public void valido_campo_cep_de_destino(String string) {

    }

    @Given("valido loja {string}")
    public void valido_loja(String string) {
        paginaInicial.validarLojaOrigem(string);
    }

    @When("valido cep de origem {string}")
    public void valido_cep_de_origem(String string) {
        paginaInicial.validarCepOrigem(string);
    }

    @Then("valido cep de destino {string}")
    public void valido_cep_de_destino(String string) {
        paginaInicial.validarCepDestino(string);
    }

    @Given("clico no botao fechar")
    public void clico_no_botao_fechar() {
        paginaInicial.copiarIdCotacao();
        paginaInicial.clicarBotaoFechar();
    }

    @Given("clico na opcao buscar cotacao")
    public void clico_na_opcao_buscar_cotacao() throws InterruptedException {
        paginaInicial.clicarOpcaoBuscarCotacao();
    }

    @Given("informo o id da cotacao")
    public void informo_o_id_da_cotacao() {
        paginaInicial.digitarId(toString());
    }

    @Given("clico no botao buscar")
    public void clico_no_botao_buscar() {
        paginaInicial.clicarBotaoBuscarCotacao();
    }
}