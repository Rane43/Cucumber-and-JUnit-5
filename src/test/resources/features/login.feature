@tag
Feature: Login
  Scenario Outline: Login attempts with different credentials
  Given my username is "<username>"
  And my password is "<password>"
  When I enter login
  Then the method returns <result>

  Examples:
    | username            | password      | result |
    | invalidUsername sfd | validPassword | false  |
    | validUsername       | validPassword | true   |

