package org.selenide.exemplos.paginas;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PaginaInicial {


    public PaginaInicial navegar() throws InterruptedException{
        open("https://oms-tester-machine-dev.eastus.cloudapp.azure.com/cockpit");
        return this;
    }

    public void login() throws InterruptedException {
        $(byXpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div/div[1]/form/div[1]/div/div[1]/div[1]/input")).shouldBe(visible).sendKeys("broker.admin");
        $(byXpath("//*[@id='password']")).shouldBe(visible).sendKeys("broker@admin2021");
        $(byXpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div/div[2]/button/div")).shouldBe(visible).click();
    }

    public void clicarBotaoContingencia() {
        $(byXpath("//*[@id='appDrawer']/section/div[1]/div[2]/div[1]/div[1]/div")).shouldBe(visible).click();
    }

    public void clicarBotaoCadastro() throws InterruptedException {
        $(byXpath("//*[@id='appDrawer']/section/div[1]/div[2]/div[2]/div[3]/a/div[2]/div")).shouldBe(visible).click();
    }

    public void clicarBotaoUpload() throws InterruptedException {
        $(byXpath("//*[@id='app']/div/label/div/span")).shouldBe(visible).click();
    }

    public void clicarBotaoUplodDeArquivo() throws InterruptedException {
        $(byXpath("//*[@id='appDrawer']/section/div[1]/div[2]/div[2]/div[3]")).shouldBe(visible).click();
    }

    public void clicarBotaoCotacao() throws InterruptedException {
        $(byXpath("//*[@id='appDrawer']/section/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div")).shouldBe(visible).click();
    }

    public void clicarOpcaoCotacao() throws InterruptedException {
        $(byXpath("//*[@id='appDrawer']/section/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/a/div[1]/div")).shouldBe(visible).click();
    }

    public void clicarBotaoTransportadora() {
        $(byXpath("//*[@id='appDrawer']/section/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/a/div[1]/div")).shouldBe(visible).click();
    }

    public void clicarBotaoModal() {
        $(byXpath("//*[@id='appDrawer']/section/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/a/div[1]/div")).shouldBe(visible).click();
    }

    public void clicarBotaoNovaCotacao(){
        $(byXpath("//*[@id='pageTable']/div/div/div[1]/div[1]/button/div")).shouldBe(visible).click();
    }

    public void clicarBotaoNovoProduto(){
        $(byXpath("//*[@id='inspire']/div[2]/div/div/div/div/div[2]/div/div[1]/nav/div/button[2]/div/i")).shouldBe(visible).click();
    }

    public void preencherCampoSku(String sku){
        $(byXpath("//*[@id='inspire']/div[5]/div/div/div[2]/form/div/div/div[1]/div/div/div[1]/div/input")).shouldBe(visible).sendKeys(sku);
    }

    public void preencherCampoCategoria(String categoria){
        $(byXpath("//*[@id='inspire']/div[5]/div/div/div[2]/form/div/div/div[2]/div/div/div[1]/div/input")).shouldBe(visible).sendKeys(categoria);
    }

    public void preencherCampoCusto(String custo){
        $(byXpath("//*[@id='inspire']/div[5]/div/div/div[2]/form/div/div/div[3]/div/div/div[1]/div/input")).shouldBe(visible).sendKeys(custo);
    }

    public void clicarNoCheckbox(){
        $(byXpath("//*[@id='inspire']/div[5]/div/div/div[1]/nav/div/div[3]/div/div/label")).shouldBe(visible).click();
    }

    public void clicarBotaoSalvarCotacao(){
        $(byXpath("//*[@id='inspire']/div[5]/div/div/div[3]/button[2]/div/i")).shouldBe(visible).click();
    }

    public void preencherCampoLoja(String loja) throws InterruptedException {
        $(byXpath("//*[@id='inspire']/div[2]/div/div/div/div/div[1]/div/div[2]/form/div/div/div[1]/div/div/div/div[1]/input")).shouldBe(visible).sendKeys(loja);
        Thread.sleep(3000);
        $(byXpath("//*[@id='inspire']/div[6]/div/div/div/a/div/div")).shouldBe(visible).click();
    }

    public void preencherCampoCepDestino(String cepDestino){
        $(byXpath("//*[@id='inspire']/div[2]/div/div/div/div/div[1]/div/div[2]/form/div/div/div[3]/div/div/div[1]/div/input")).shouldBe(visible).sendKeys(cepDestino);
    }

    public void clicarBotaoGerarCotacao(){
        $(byXpath("//*[@id='inspire']/div[2]/div/div/nav/div/div[3]/button")).shouldBe(visible).click();
    }

    public String validarCampoProduto(String produto){
        return $(byXpath("//*[@id='inspire']/div[2]/div/div/div/div/div[2]/div/div[2]/div/div[1]/table/tbody/tr/td[1]")).shouldBe(visible).getText();
         }

         public void clicarBotaoModificar(){
        $(byXpath("//*[@id='pageTable']/div/div/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[6]/button[2]")).shouldBe(visible).click();
         }

         public String validarMensagemConfirmacao(String string){
          return $(byXpath("//*[@id='swal2-title']")).shouldBe(visible).getText();
         }

         public void clicarOpcaoModificar() throws InterruptedException {
        Thread.sleep(4000);
        $(byXpath("/html/body/div[5]/div/div[3]/button[2]")).shouldBe(visible).click();
         }

         public String copiarIdCotacao(){
        return $(byXpath("//*[@id='inspire']/div[1]/div/div/div/div/div[1]/div[1]/div[2]")).shouldBe(visible).getText();
         }

         public void clicarBotaoFechar(){
             $(byXpath("//*[@id='inspire']/div[1]/div/div/nav/div/button/div/i")).shouldBe(visible).click();
         }

         public void clicarBotaoVisualizar(){
        $(byXpath("//*[@id='pageTable']/div/div/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[6]/button[1]")).shouldBe(visible).click();
         }


    public String validarLoja(String string){
        return $(byXpath("//*[@id='inspire']/div[1]/div/div/div/div/div[1]/div[2]/div[2]")).shouldBe(visible).getText();
    }

    public String validarCepOrigem(String string){
        return $(byXpath("//*[@id='inspire']/div[1]/div/div/div/div/div[1]/div[3]/div[2]")).shouldBe(visible).getText();
    }

    public String validarCepDestino(String string){
        return $(byXpath("//*[@id='inspire']/div[1]/div/div/div/div/div[1]/div[4]/div[2]")).shouldBe(visible).getText();
    }

    public void clicarOpcaoBuscarCotacao() throws InterruptedException {
        $(byXpath("//*[@id='appDrawer']/section/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/a/div[1]/div")).shouldBe(visible).click();
    }

    public void digitarId(String string){
        $(byXpath("//*[@id='pageTable']/div/div/div/div[1]/nav/div/div/div[2]/div/div/input")).shouldBe(visible).sendKeys(string);
    }

    public void clicarBotaoBuscarCotacao(){
        $(byXpath("//*[@id='pageTable']/div/div/div/div[1]/nav/div/button")).shouldBe(visible).click();
    }

    public String validarLojaOrigem(String string){
        return $(byXpath("//*[@id='pageTable']/div/div/div/div[2]/div[1]/div[2]/div[2]")).shouldBe(visible).getText();
    }

    public String validarOrigem(String string){
        return $(byXpath("//*[@id='pageTable']/div/div/div/div[2]/div[1]/div[3]/div[2]")).shouldBe(visible).getText();
    }

    public String validarDestino(String string){
        return $(byXpath("//*[@id='pageTable']/div/div/div/div[2]/div[1]/div[4]/div[2]")).shouldBe(visible).getText();
    }

    public void clicarBotaoNovaModal(){
        $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/nav/div/button[1]/div")).shouldBe(visible).click();
    }

    public void selecionarTransportadora() throws InterruptedException {
        $(byXpath("//*[@id='inspire']/div[3]/div/div/div/div/div/div[1]/div[1]/div/div[1]/div[1]/div[1]")).shouldBe(visible).click();
        Thread.sleep(2000);
        $(byXpath("//*[@id='inspire']/div[5]/div/div/div[2]/a/div/div")).shouldBe(visible).click();
    }

    public void selecionarTipoEntrega1() throws InterruptedException {
        $(byXpath("//*[@id='inspire']/div[3]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[1]")).shouldBe(visible).click();
        Thread.sleep(2000);
        $(byXpath("//*[@id='inspire']/div[4]/div/div/div[1]/a/div/div")).shouldBe(visible).click();
    }

    public void selecionarTipoEntrega2() throws InterruptedException {
        $(byXpath("//*[@id='inspire']/div[3]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[1]")).shouldBe(visible).click();
        Thread.sleep(2000);
        $(byXpath("//*[@id='inspire']/div[4]/div/div/div[2]/a/div/div")).shouldBe(visible).click();
    }

    public void preencherCodExterno(String codExterno) {
        $(byXpath("//*[@id='inspire']/div[3]/div/div/div/div/div/div[1]/div[3]/div/div[1]/div/input")).shouldBe(visible).sendKeys(codExterno);
    }

    public void preencherNome(String nome) {
        $(byXpath("//*[@id='inspire']/div[3]/div/div/div/div/div/div[1]/div[4]/div/div/div/input")).shouldBe(visible).sendKeys(nome);
    }

    public void selecionarTransportadoraConsult() throws InterruptedException {
        $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/nav/div/div[1]/div/div/div[1]")).shouldBe(visible).click();
        Thread.sleep(2000);
        $(byXpath("//*[@id='inspire']/div[6]/div/div/div[2]/a/div/div")).shouldBe(visible).click();
    }

    public String validarCodExterno(String codExterno) {
        return $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[2]")).shouldBe(visible).getText();
    }

    public String validarNome(String nome) {
        return $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[3]")).shouldBe(visible).getText();
    }

    public String validarTransportadora(String transportadora) {
        return $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[4]")).shouldBe(visible).getText();
    }

    public void clicarExcluir(){
        $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[6]/button[2]"))
                .shouldBe(visible).click();
    }

    public void clicarAlterar(){
        $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[6]/button[1]"))
                .shouldBe(visible).click();
    }

    public void clicarExcluirNaModal() throws InterruptedException {

        $(byXpath("/html/body/div[5]/div/div[3]/button[3]")).shouldBe(visible).click();
    }

    public void clicarExcluirDaModal() throws InterruptedException {

        $(byXpath("/html/body/div[3]/div/div[3]/button[3]")).shouldBe(visible).click();
    }

    public void clicarBotaoNovaTrans() {

        $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/nav/div/button/div")).shouldBe(visible).click();
    }

    public void preencherCampoCodExterno(String codExterno) {
        $(byXpath("/html/body/div[1]/div/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[1]/div/input")).shouldBe(visible).sendKeys(codExterno);
    }

    public void preencherCampoNome(String nome) {
        $(byXpath("/html/body/div[1]/div/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[1]/div/input")).shouldBe(visible).sendKeys(nome);
    }

    public void preencherCampoDescricao(String descricao) {
        $(byXpath("/html/body/div[1]/div/div/div/div[3]/div/div/div/div/div/div/div[3]/div/div[1]/div/input")).shouldBe(visible).sendKeys(descricao);
    }

    public void clicarBotaoSalvar(){
        $(byXpath("/html/body/div[1]/div/div/div/div[3]/div/div/nav/div/div[3]/button[2]")).shouldBe(visible).click();
    }

    public void pesquisaTransportadora(String transportadora){
        $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/nav/div/div[1]/div[2]/div/div/input")).shouldBe(visible).sendKeys(transportadora);
    }

    public void clicarBotaoAlterar(){
        $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[5]/button[1]")).shouldBe(visible).click();
    }

    public void clicarBotaoExcluir(){
        $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[5]/button[2]")).shouldBe(visible).click();
    }

    public void clicarBotaoAtualizar(){
        $(byXpath("//*[@id='inspire']/div[3]/div/div/nav/div/div[3]/button[2]")).shouldBe(visible).click();
    }

    public void clicarBotaoExcluirConfirmacao(){
        $(byXpath("/html/body/div[5]/div/div[3]/button[3]")).shouldBe(visible).click();
    }


    public String mensagemSucesso(String msg) throws InterruptedException {
        return $(byXpath("/html/body/div[4]/div/p")).shouldBe(visible).getText();
    }

    public String validarCampoCodExterno(String codExterno) {
        return $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[2]")).shouldBe(visible).getText();
    }

    public String validarCampoNome(String nome) {
        return $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[3]")).shouldBe(visible).getText();
    }

    public String validarCampoDescricao(String descricao) {
        return $(byXpath("//*[@id='pageTable']/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[4]")).shouldBe(visible).getText();
    }

    public String mensagemConfirmacao(String msg) {
        return $(byXpath("//*[@id='swal2-title']")).shouldBe(visible).getText();
    }

    public String mensagemSucessoExcluir(String msg) {
        return $(byXpath("/html/body/div[4]/div/p")).shouldBe(visible).getText();
    }

    public String mensagemErro(String msg) {
        return $(byXpath("/html/body/div[3]/div/p")).shouldBe(visible).getText();
    }

    public void UploadFile() {
        $(byXpath("//*[@id='app']/div/label/div/span")).shouldBe(visible).sendKeys("C:/Users/bianca.lins/Tabela_Carriers.xlsx");
    }
}