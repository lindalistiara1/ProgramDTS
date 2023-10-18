Feature: checkout

  Scenario: user dapat melakukan checkout
    Given user berada di halaman keranjang
    When user klik tombol checkout
    Then user dapat melihat halaman checkout information

