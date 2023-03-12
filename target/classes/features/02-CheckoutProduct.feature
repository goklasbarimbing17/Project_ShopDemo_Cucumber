Feature: Checkout Product
  Scenario: User successful checkout product
    Given User login into web shop demo
    When User click feature Cart
    And User click button proceed to checkout
    And User enter firstname as "Bimo" and lastname as "Sakti"
    And User enter company name as "Juara Coding"
    And User select country or region as "Indonesia"
    And User enter Street address as "Jl.Titik koma" and "Home"
    And User enter city as "Bekasi"
    And User select and enter province as "Jawa Barat"
    And User enter post code as "255123"
    And User enter phone number as "081283475412"
    And User enter order notes as "notes order"
    And User agree to the website terms and conditions
    And User click button place order
    Then User can view messages success checkout product "Thank you. Your order has been received."
