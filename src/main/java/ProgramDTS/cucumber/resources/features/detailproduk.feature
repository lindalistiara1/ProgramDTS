Feature: Lihat detail produk

  Scenario: user dapat melihat detail produk
    Given user ada di halaman list produk
    When user klik salah satu produk
    Then user dapat melihat detail produk

