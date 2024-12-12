Feature: Cocktail Ordering
      As Romeo, I want to offer a drink to Juliette so that we can discuss together.

  Scenario Outline: Creating an empty order
    Given "<x>" who wants to buy a drink
    When an order is declared for "<target>"
    Then there are <count> cocktails in the order

    Examples:
      | x      | target   | count       |
      | Romeo  | Juliette |           0 |
      | Ahmad  | Bradley  |           9 |
      | Yannis | Guychel  |          13 |