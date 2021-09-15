@crudModal
Feature: crud Modal de Entrega

  Scenario Outline: Incluir Modal de Entrega
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cadastro
    And clico no botao Modal de Entregas
    And clico no botao Novo Modal de Entrega
    And seleciono uma Transportadora
    And seleciono um Tipo de Entrega1
    And preencher o campo Codigo Externo "<CodigoExterno>"
    And preencher o campo Nome "<Nome>"
    When clico no botao salvar
    Then validar a mensagem de sucesso "<mensagemSucesso>"

    Examples:
        |CodigoExterno |Nome   |mensagemSucesso                     |
        |0101          |ateste |Modal de Entrega Salva com Sucesso! |


  Scenario Outline: Incluir Modal de Entrega já cadastrada
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cadastro
    And clico no botao Modal de Entregas
    And clico no botao Novo Modal de Entrega
    And seleciono uma Transportadora
    And seleciono um Tipo de Entrega1
    And preencher o campo Codigo Externo "<CodigoExterno>"
    And preencher o campo Nome "<Nome>"
    When clico no botao salvar
    Then validar a mensagem de erro de Modal ja cadastrada "<mensagemErro>"


    Examples:
      |CodigoExterno |Nome   |mensagemErro                                                             |
      |0101          |ateste |Delivery type has already been registered, try to update the information |

  Scenario Outline: Incluir Modal de Entrega
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cadastro
    And clico no botao Modal de Entregas
    And clico no botao Novo Modal de Entrega
    And seleciono uma Transportadora
    And seleciono um Tipo de Entrega2
    And preencher o campo Codigo Externo "<CodigoExterno>"
    And preencher o campo Nome "<Nome>"
    When clico no botao salvar
    Then validar a mensagem de sucesso "<mensagemSucesso>"

    Examples:
      |CodigoExterno |Nome    |mensagemSucesso                     |
      |0102          |ateste2 |Modal de Entrega Salva com Sucesso! |



  Scenario Outline: Alterar Modal de Entrega
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cadastro
    And clico no botao Modal de Entregas
    And clico no botao alterar Modal de Entrega
    And preencher o campo Nome "<Nome>"
    When clico no botao salvar
    Then validar a mensagem de sucesso "<mensagemSucesso>"

    Examples:
      |Nome |mensagemSucesso                          |
      |1    |Modal de Entrega Atualizado com Sucesso! |
      |2    |Modal de Entrega Atualizado com Sucesso! |


  Scenario Outline: Consultar Modal de Entrega
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cadastro
    And clico no botao Modal de Entregas
    And clico para seleciona transportadora
    And validar campo codigo externo "<codExterno>"
    When validar campo nome "<nome>"
    Then validar campo transportadora "<transportadora>"

    Examples:
      |codExterno |nome    |transportadora |
      |0101       |ateste1 |Correios       |

  Scenario Outline: Excluir Modal de Entrega
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cadastro
    And clico no botao Modal de Entregas
    And clico para seleciona transportadora
    And clico no botao excluir
    And validar mensagem de confirmacao "<mensagemConfirmacao>"
    When clicar no botao excluir da modal
    Then validar mensagem de sucesso da exclusao "<mensagemSucesso>"

    Examples:
      |mensagemConfirmacao                                  |mensagemSucesso                        |
      |Deseja Mesmo Deletar esse Modal de Entrega ateste12? |Modal de Entrega Excluída com Sucesso! |
      |Deseja Mesmo Deletar esse Modal de Entrega ateste2?  |Modal de Entrega Excluída com Sucesso! |

    Scenario Outline: Excluir Transportadora vinculada à uma modal
      Given que estou na tela inicial do sistema cockpit
      And realizo o login
      And clico no botao Contigencia
      And clico no botao cadastro
      And clico no botao Modal de Entregas
      And clico no botao Novo Modal de Entrega
      And seleciono uma Transportadora
      And seleciono um Tipo de Entrega1
      And preencher o campo Codigo Externo "<CodigoExterno>"
      And preencher o campo Nome "<Nome>"
      And clico no botao salvar
      And validar a mensagem de sucesso "<mensagemSucesso>"
      And clico no botao Transportadora
      And procuro por transportadora "<transportadora>"
      And clicar no botao Excluir
      And validar mensagem de confirmacao "<mensagemConfirmacao>"
      And clicar no botao Excluir de confirmacao
      And validar mensagem de erro "<mensagemDeErro>"
      And clico no botao excluir
      When validar mensagem de confirmacao "<mensagemConfirmacaoModal>"
      Then clicar no botao excluir na modal

      Examples:
        |CodigoExterno |Nome   |mensagemSucesso                     |transportadora |mensagemConfirmacao                                         |mensagemDeErro                                                        |mensagemConfirmacaoModal                            |
        |0101          |ateste |Modal de Entrega Salva com Sucesso! |1616           |Deseja Mesmo Deletar a Transportadora Transportadora teste? |Impossível excluir Transportadora 1616 com Modal de Entrega Vinculado |Deseja Mesmo Deletar esse Modal de Entrega ateste?  |





