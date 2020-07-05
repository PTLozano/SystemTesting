@ignore
Feature: Login access

  Background:
    Given user would like to log in application

  Scenario: User valid and password invalid
    Given user informs login with value equal "robson" with id
    And user informs password with value equal "GFT"
    When user clicks on login button
    Then user should see fail page with "Fail Login!" message

  Scenario Outline: User and password with data table with examples
    Given user informs login with value equal "<User>" with name
    And user informs password with value equal "<Password>"
    When user clicks on login button
    Then user should see success page with "<Result>" message

    Examples:
      | User   | Password | Result         |
      | robson | GFT      | Fail Login!    |
      | GFT    | agapito  | Fail Login!    |
      | GFT    | GFT      | Fail Login!    |
      | robson | agapito  | Success Login! |

