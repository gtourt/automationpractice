Feature: Purchase Feature
  In order to give the customer the possibility to see his orders,
  as a customer,
  I should be able to see my order in the basket.

  Scenario Outline: Ensure that my order is placed.
    Given user navigates to homepage
    And user press Sign In
    And user is authenticated as <username> with password <password>  and has signed in
    And user navigates to the T-SHIRTS section
    When user picks the Faded Short Sleeve T-shirts product of the list
    And user proceeds to checkout
    And user is on summary and proceeds
    And user is on addresses and proceeds
    And user is on shipping and agrees to terms and proceeds
    And user is on payment method and picks pay by bank wire
    And user is on order summary and confirms
    And user navigates to his account page
    And user navigates to his orders
    Then orders page is displayed
    And the order with the current date exist

    Examples:
      | username                    | password    |
      | test@seleniumwebdriver.com  | Password123 |