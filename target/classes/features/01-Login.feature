Feature: Login User
  Scenario: User successful login into web ShopDemo
    Given User open browser and url shop demo
    When User enter username as "bimosakti"
    And User enter password as "BimoSakti123$"
    And User click button login
    Then User go to page Dashboard "Hello bimosakti (not bimosakti? Log out)"
    When User click button logout
    Then User can view title login page "LOGIN"


 Scenario Outline: User invalid login into web ShopDemo
   Given User enter username as "<Username>"
   And User enter password as "<Password>"
   And User click button login
   Then User can view messages error "<MsgError>"

   Examples:
   |Username|Password|MsgError|
   |bimosakti|BimoSakti11@|ERROR: The username or password you entered is incorrect. Lost your password?|
   |bimosakt|BimoSakti123#|ERROR: The username or password you entered is incorrect. Lost your password?|
   |bimosakti|            |Error: The password field is empty.|
   |         |BimoSakti123#|Error: Username is required.      |
   |         |             |Error: Username is required.      |