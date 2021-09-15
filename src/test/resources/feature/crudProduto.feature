@crudProduto
Feature: crud produto

  Scenario Outline: Criar produto
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clicar no botao cotacao
    And clicar na opcao gerar cotacao
    And clicar no botao nova cotacao
    And clicar no botao novo produto
    And preencher o campo sku "<sku>"
    And preencher o campo categoria do produto "<categoria>"
    And preencher o campo custo do produto "<preco>"
    And clicar no checkbox para adicionar valores padroes
    When clicar no botao salvar cotacao
    Then validar produto incluso "<produto>"

    Examples:
        |sku       |categoria  |preco |produto   |
        |510000011 |teste      |50    |510000011 |

  Scenario Outline: Alterar produto
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clicar no botao cotacao
    And clicar na opcao gerar cotacao
    And clicar no botao nova cotacao
    And clicar no botao novo produto
    And preencher o campo sku "<sku>"
    And preencher o campo categoria do produto "<categoria>"
    And preencher o campo custo do produto "<preco>"
    And clicar no checkbox para adicionar valores padroes
    When clicar no botao salvar cotacao
    Then validar produto incluso "<produto>"

    Examples:
      |sku       |categoria  |preco |produto   |
      |510000011 |teste      |50    |510000011 |