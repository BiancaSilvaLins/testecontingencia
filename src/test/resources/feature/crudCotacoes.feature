@crudCotacoes
Feature: crud cotacoes

  Scenario Outline: Criar cotacao
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cotacao
    And clico na opcao gerar cotacao
    And clico no botao nova cotacao
    And clico no botao novo produto
    And preencho o campo sku "<sku>"
    And preencho o campo categoria do produto "<categoria>"
    And preencho o campo custo do produto "<preco>"
    And clico no checkbox para adicionar valores padroes
    And clico no botao salvar cotacao
    And preencho o campo loja origem "<loja>"
    And preencho o campo cep de destino "<cepDestino>"
    When clico no botao gerar cotacao
    Then validar a mensagem de sucesso "<mensagemSucesso>"

    Examples:
        |sku       |categoria  |preco |loja |cepDestino |mensagemSucesso             |
        |510000011 |teste      |50    |899  |03918000   |Cotação Gerada com Sucesso! |

  Scenario Outline: Alterar cotacao
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cotacao
    And clico na opcao gerar cotacao
    And clico no botao nova cotacao
    And clico no botao novo produto
    And preencho o campo sku "<sku>"
    And preencho o campo categoria do produto "<categoria>"
    And preencho o campo custo do produto "<preco>"
    And clico no checkbox para adicionar valores padroes
    And clico no botao salvar cotacao
    And preencho o campo loja origem "<loja>"
    And preencho o campo cep de destino "<cepDestino>"
    And clico no botao gerar cotacao
    And validar a mensagem de sucesso "<mensagemSucesso>"
    And clico botao modificar
    And validar a mensagem de confirmacao "<mensagemConfirmacao>"
    And clico na opcao modificar
    And clico no botao novo produto
    And preencho o campo sku "<sku>"
    And preencho o campo categoria do produto "<categoria>"
    And preencho o campo custo do produto "<preco>"
    And clico no botao salvar cotacao
    And preencho o campo cep de destino "<cepDestino>"
    When clico no botao gerar cotacao
    Then validar a mensagem de sucesso "<mensagemSucesso>"

    Examples:
      |mensagemConfirmacao         |sku       |categoria  |preco |loja |cepDestino |mensagemSucesso             |
      |Deseja Modificar a Cotação? |510000012 |Altera     |50    |899  |03918001   |Cotação Gerada com Sucesso! |

  Scenario Outline: Visualizar cotacao
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cotacao
    And clico na opcao gerar cotacao
    And clico no botao nova cotacao
    And clico no botao novo produto
    And preencho o campo sku "<sku>"
    And preencho o campo categoria do produto "<categoria>"
    And preencho o campo custo do produto "<preco>"
    And clico no checkbox para adicionar valores padroes
    And clico no botao salvar cotacao
    And preencho o campo loja origem "<loja>"
    And preencho o campo cep de destino "<cepDestino>"
    And clico no botao gerar cotacao
    And validar a mensagem de sucesso "<mensagemSucesso>"
    And clico no botao fechar
    And clico no botao visualizar
    And valido campo loja "<loja>"
    When valido campo cep de origem "<cepOrigem>"
    Then valido campo cep de destino "<cepDestino>"


    Examples:
      |sku       |categoria  |preco |loja |cepDestino |mensagemSucesso             |cepOrigem |
      |510000011 |teste      |50    |899  |03918000   |Cotação Gerada com Sucesso! |23575-450 |

#  Scenario Outline: Buscar cotacao
#    Given que estou na tela inicial do sistema cockpit
#    And realizo o login
#    And clico no botao Contigencia
#    And clico no botao cotacao
#    And clico na opcao gerar cotacao
#    And clico no botao nova cotacao
#    And clico no botao novo produto
#    And preencho o campo sku "<sku>"
#    And preencho o campo categoria do produto "<categoria>"
#    And preencho o campo custo do produto "<preco>"
#    And clico no checkbox para adicionar valores padroes
#    And clico no botao salvar cotacao
#    And preencho o campo loja origem "<loja>"
#    And preencho o campo cep de destino "<cepDestino>"
#    And clico no botao gerar cotacao
#    And validar a mensagem de sucesso "<mensagemSucesso>"
#    And clico no botao fechar
#    And clico na opcao buscar cotacao
#    And informo o id da cotacao
#    And clico no botao buscar
#    And valido loja "<loja>"
#    When valido cep de origem "<cepOrigem>"
#    Then valido cep de destino "<cepDestino>"
#
#
#    Examples:
#      |sku       |categoria  |preco |loja |cepDestino |mensagemSucesso             |cepOrigem |
#      |510000011 |teste      |50    |899  |03918000   |Cotação Gerada com Sucesso! |23575-450 |