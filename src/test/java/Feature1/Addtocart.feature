@AddToCart
Feature: This feature will be used to test the addto cart functionlity of SwagsLab

  Background: 
    Given I have launched the application
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And Click on login

  Scenario: Add  the product to cart
    When I click Add to cart in "Sauce Labs BackPack"
    And I click add to cart
    And I click on shopping cart link
    Then I should be able to see the product as "Sauce Labs Backpack"
