Feature: Validate the movie release country

  Scenario: Validating the country
    Given open the browser And search the movie name on Google
    When user is on desired movie page And click on wikipedia movie page
    Then capture the release country

  Scenario: Validating the country from IMDB
    Given move to IMDB page
    When user is on page now capture the release country
    Then validate both release country
