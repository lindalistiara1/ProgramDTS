Feature: masuk ke aplikasi

  Scenario: masuk ke aplikasi dengan user yang valid
    Given Halaman login saucedemo
    When user input username yang valid
    And user input password yang valid
    And klik tombol login
    Then user dapat login ke aplikasi

  Scenario: masuk ke aplikasi dengan user yang tidak valid
    Given Halaman login saucedemo
    When user input username yang tidak valid
    And user input password yang tidak valid
    And klik tombol login
    Then user tdk dapat login ke aplikasi dan memunculkan error message