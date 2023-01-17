Feature: user searching the product on amazon website

  Scenario: search a product
    Given user have browser opened and url is navigated
    When user search for product as "Refrigerators double door 5 star"
    Then product lishtshould appear pertaining to the product search as "Refrigerators double door 5 star"
