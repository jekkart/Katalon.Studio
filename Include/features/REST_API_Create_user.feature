Feature: Rest API - Create user

  Scenario Outline: Successful user creation
    Given user name is <name>
    And user email is <email>
    And user gender is <gender>
    And user status is <status>
    Then perform user successful creation test case

    Examples: 
      | name             | email                         | gender | status |
      | Katalon Cucumber1 | katalon.cucumber7@test15ce.com | male   | active |
      | Katalon Cucumber2 | katalon.cucumber8@test15ce.com | male   | inactive |

  Scenario: Unsuccessful user creation (user email already registered)
    Given user name is Tenali Ramakrishna
    And user gender is female
    And user email is tenali.ramakrishna@test.com
    And user status is active
    Then perform user unsuccessful creation test case
