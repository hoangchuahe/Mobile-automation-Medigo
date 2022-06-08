Feature:Front site - Login function

  Scenario: Login successfully with valid front account
    Given User navigates to Login page of front site
    When User enters valid account at front site
    And User enters valid password at front site
    And User clicks on Login button at front site
    Then User login successfully into front site
