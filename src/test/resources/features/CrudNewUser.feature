@ignore
Feature:  CRUD User

  Scenario: Create a new user

    Given the is on Agapito Server page
    And the user clicks on user menu
    And the user clicks on new user button
    And the user fill "login" with value equal "joao"
    And the user fill "fullName" with value equal "Joao Bosco de Sousa"
    And the user fill "email" with value equal "joaobosco@hotmail.com"
    And the user fill "age" with value equal "30"
    When the user clicks on save button
    Then the user should see "Usuario foi criado com sucesso." into view user page
