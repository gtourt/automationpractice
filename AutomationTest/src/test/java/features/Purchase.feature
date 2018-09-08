Feature: Purchase Feature
  Make a purchase when logged in

  Scenario: Login as an autheticated user and make an t-shirt order
    Given user navigates to homepage
    And user press Sign In
    And user is authenticated and has signed in
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
#    Then order page is displayed