
Feature: Verifying Omr Hotel Login moudle
 @login
  Scenario Outline: Verifying login module with valid Credentials
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"

    Examples: 
      | username            | password      |
      | durai8827@gmail.com | NPTIneyveli@3 |

  Scenario Outline: Verifying login module with vaild Credentaials using Enter keyword
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>" with enter key
    Then User should verify after login success message "Welcome SELLA"

    Examples: 
      | username            | password      |
      | durai8827@gmail.com | NPTIneyveli@3 |

  Scenario Outline: Verifying login module with valid Credentials
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify error message after click login button "Invalid login details or your password might have expired."

   Examples:
   |username            | password  |
   |greenstechchennaiomr@gmail.com|Howareyou| 