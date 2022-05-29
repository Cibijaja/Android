Feature: Amazon search

  Scenario: Searching a product
    Given i have a search field on amazon page
    When i search a product with name <"product"> and price <"value">;
    |"product"|"value"|
    |"Apple"|1000|
    |"Android"|5000|
    
    Then Product with name "Apple MacBook Pro" should be shown
