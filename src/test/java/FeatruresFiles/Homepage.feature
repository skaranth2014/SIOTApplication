Feature: HomePage Verification
  Verify if user is able to access the URL

  Scenario: Samsung landing Screen 
  	Given user open SIOT Application
  	Then verify current URL
    When user navigates to landing Screen and verify screen with below scenerios 
    Then Verify food pillar
    Then Verify fun pillar
    Then verify family pillar
    And  verify the Title of the page
    
