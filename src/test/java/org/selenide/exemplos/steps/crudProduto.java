package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaInicial;

public class crudProduto {

    private PaginaInicial paginaInicial = new PaginaInicial();

    @After
    public void tearDown() {
        Selenide.close();
    }

    @Given("clicar no botao cotacao")
    public void clicar_no_botao_cotacao() throws InterruptedException {
        paginaInicial.clicarBotaoCotacao();
    }

    @Given("clicar na opcao gerar cotacao")
    public void clicar_na_opcao_gerar_cotacao() throws InterruptedException {
        paginaInicial.clicarOpcaoCotacao();
    }

    @Given("clicar no botao nova cotacao")
    public void clicar_no_botao_nova_cotacao() {
        paginaInicial.clicarBotaoNovaCotacao();
    }

    @Given("clicar no botao novo produto")
    public void clicar_no_botao_novo_produto() {
        paginaInicial.clicarBotaoNovoProduto();
    }

    @Given("preencher o campo sku {string}")
    public void preencher_o_campo_sku(String string) {
        paginaInicial.preencherCampoSku(string);
    }

    @Given("preencher o campo categoria do produto {string}")
    public void preencher_o_campo_categoria_do_produto(String string) {
        paginaInicial.preencherCampoCategoria(string);
    }

    @Given("preencher o campo custo do produto {string}")
    public void preencher_o_campo_custo_do_produto(String string) {
        paginaInicial.preencherCampoCusto(string);
    }

    @Given("clicar no checkbox para adicionar valores padroes")
    public void clicar_no_checkbox_para_adicionar_valores_padroes() {
        paginaInicial.clicarNoCheckbox();
    }

    @Given("clicar no botao salvar cotacao")
    public void clicar_no_botao_salvar_cotacao() {
        paginaInicial.clicarBotaoSalvarCotacao();
    }

        @Then("validar produto incluso {string}")
        public void validar_produto_incluso(String string){
            Assert.assertEquals(paginaInicial.validarCampoProduto(string),string);
        }
    }