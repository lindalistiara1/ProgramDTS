Feature: Tambah ke keranjang

  Scenario: user dapat menambah produk ke keranjang
    Given user ada di halaman list produk
    When user klik tombol add to cart
    Then produk tertambah di keranjang

