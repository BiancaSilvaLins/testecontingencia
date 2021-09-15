@crudCotacoes
Feature: crud cotacoes

  Scenario Outline: Criar cotacao
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao Upload de Arquivo
    And clico para enviar um arquivo
    When valido mensagem de carregamento "<msgCarregando>"
    Then valido mensagem de inserido com sucesso "<msgSucesso>"

    Examples:
        |msgCarregando                   | msgSucesso                  |
        |Enviando arquivo para validação |Arquivo validado e inserido! |