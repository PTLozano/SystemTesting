@process
Feature: Create a process

  Background:
    Given the user is on Agapito Server page
    And the user clicks on Process menu
    And the user clicks on new process button
    And the user fills "processo_vara" with value equal "001" on the process page
    And the user fills "processo_numero_processo" with value equal "123456" on the process page
    And the user fills "processo_natureza" with value equal "Guarda" on the process page
    And the user fills "processo_partes" with value equal "Jose X Maria" on the process page
    And the user selects urgency with value equal "Sim" on the process page
    And the user clicks on arbitramento equals "Sim"
    And the user fills "processo_assistente_social" with value equal "Projeto Teste" on the process page
    And the user fills "processo_data_entrada" with value equal "04/07/2020" on the process page
    And the user fills "processo_status" with value equal "Em analise" on the process page
    And the user fills "processo_observacao" with value equal "Teste" on the process page
    When the user clicks on save button on the process page

  Scenario: Create a process
    Then the user should see "Processo foi criado com sucesso." into view process page

  Scenario: Check fields on the process grid
    When the user clicks on back button into process show page
    Then the user should see last code on the process grid page
    And the user should see "numero" with value "123456" on the process grid page
    And the user should see "partes" with value "Jose X Maria" on the process grid page
    And the user should see "data-ent" with value "2020-07-04" on the process grid page

  Scenario: Update a process
    When the user clicks on edit button into process show page
    And the user fills "processo_natureza" with value equal "Civil" on the process page
    And the user fills "processo_partes" with value equal "Maria X Jose" on the process page
    And the user clicks on save button on the process page
    Then the user should see "Processo atualizado com sucesso." into view process page
    And the user clicks on back button into process show page

  Scenario: Delete an process
    Given the user backs to the process grid
    When the user clicks on delete button
    And the user confirms delete
    Then the user should not see last user code

  Scenario Outline: Create many process cases
    Given the user should see "Processo foi criado com sucesso." into view process page
    And the user clicks on edit button into process show page
    And the user fills "processo_partes" with value equal "<Partes>" on the process page
    And the user fills "processo_natureza" with value equal "<Natureza>" on the process page
    When the user clicks on save button on the process page
    Then the user should see "Processo atualizado com sucesso." into view process page


    Examples:
      | Partes                              | Natureza                |
      | João X Maria                        | Guarda                  |
      | Pedro X Paulo                       | Pagamento de Aluguel    |
      | Tríplice Entente X Tríplice Aliança | Primeira Guerra Mundial |
      | Aliadas X Eixo                      | Segunda Guerra Mundial  |





