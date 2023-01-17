Feature: user tries to login to amazon.in with valid  credentials

  Scenario: Check login page with valid credentials
    Given user open chorme and launch the aplication
    When user enter valid username and password
    And click on login button
    Then user is navigated to the home page

  #Scenario: checking login page with invalid credentials
    #Given user have valid email id
    #When user enter valid username and invalid password
    #And click on login button
    #Then user should not be navigated the to home page
