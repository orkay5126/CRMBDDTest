Feature: Login to CRM site

  Scenario: Login to CRM site
    Given User already on the login page
    When User enters the username and password
    Then user successfully logged into the CRM site
