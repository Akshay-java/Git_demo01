Feature: Greencart

Background: 
Given Chrome browser should be launched
And Greencart Website should be opened

@GreencartTesting1
Scenario Outline:: Validate the Search field
Given I should see Greencart homepage
When I enter <Vegitable_name> in search box
And I should see vegitable with name <Vegitable_name>
Examples:
|Vegitable_name|
|Brocolli|
|Cucumber|
|Beans|
|Potato|

@GreencartTesting
Scenario Outline:: Add vagitables in cart
Given I should see Greencart homepage
When I enter <Vegitable_name> in search box
And I should see vegitable with name <Vegitable_name>
And I add count of vegitables
And I click on "Add_To_Cart" button
And I navigate to shopping cart
And I click on "Proceed_to_checkout" button
And I see <Vegitable_name> vegitable in cart
Then I click on "Place_Order" button

Examples:
|Vegitable_name|
|Cucumber|
|Apple|
|Brocoli|
|Potato|
|Corn|