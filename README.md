# amazon-product-api (Scraper)

Scrap product data from amazon using SpringBoot & Jsoup.

## Features
 
 - Extract products data from search result. 
 - Extract single product by using ASIN.
 - Extract product review by using ASIN.
 - Extract list of categories.

## Endpoints

  - <code><strong>/help</strong> - Opens swagger UI.</code>
  - <code><strong>/categories</strong> - Get list of categories.</code>
  - <code><strong>/products</strong> - Get list of products.</code>
  - <code><strong>/product-details</strong> - Get product details using ASIN.</code>
  - <code><strong>/reviews</strong> - Get product details using ASIN.</code>

## Response

  - /categories

   ```javascript
{
  "categories": {
    "pets": "Pet Supplies",
    "electronics": "Electronics"
  }
}
```

  - /products

   ```javascript
{
  "total": 1,
  "productsList": [
    {
      "asin": "B0932QYBH8",
      "price": {
        "discounted": true,
        "currency": "INR",
        "currentPrice": "42999",
        "beforePrice": "65900",
        "savingsAmount": "22901.00",
        "savingsPercent": "34.75"
      },
      "rating": {
        "totalReview": "19421",
        "reviewRating": "4.6"
      },
      "url": "https://www.amazon.in/dp/B0932QYBH8",
      "sponsored": true,
      "amazonChoice": false,
      "bestSeller": false,
      "prime": true,
      "title": "Apple iPhone 12 (64GB) - Purple",
      "thumbnail": "https://m.media-amazon.com/images/I/71hIfcIPyxS._AC_UY218_.jpg",
      "itemAvailable": true,
      "maxQuantity": 0
    }
  ]
}
```

  - /product-details

   ```javascript
{
  "total": 1,
  "productDetail": {
    "price": {
      "discounted": true,
      "currency": "INR",
      "currentPrice": "89990.00",
      "beforePrice": "99900.00",
      "savingsAmount": "9910.00",
      "savingsPercent": "9.92"
    },
    "rating": {
      "totalReview": "3934",
      "reviewRating": "4.7"
    },
    "sponsored": false,
    "amazonChoice": false,
    "bestSeller": false,
    "prime": false,
    "title": "2020 Apple MacBook Air Laptop: Apple M1 chip, 13.3-inch/33.74 cm Retina Display, 8GB RAM, 256GB SSD Storage, Backlit Keyboard, FaceTime HD Camera, Touch ID. Works with iPhone/iPad; Space Grey",
    "categories": [
      {
        "category": "Apple Products",
        "url": "https://www.amazon.in/stores/page/88D59F86-9161-4804-A524-0A5B39CD714A/?_encoding=UTF8&ref_=topnav_storetab_inappledevicessubnav"
      }
    ],
    "itemAvailable": true,
    "productVariants": [
      {
        "images": [
          {
            "large": "https://m.media-amazon.com/images/I/31ilq3hPhEL.jpg",
            "thumb": "https://m.media-amazon.com/images/I/31ilq3hPhEL._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/71TPda7cwUL._SL1500_.jpg",
            "variant": "MAIN",
            "main": {
              "https://m.media-amazon.com/images/I/71TPda7cwUL._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/71TPda7cwUL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/71TPda7cwUL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/71TPda7cwUL._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/71TPda7cwUL._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/71TPda7cwUL._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/71TPda7cwUL._SX466_.jpg": [
                "466",
                "466"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/41JSzpSRTVL.jpg",
            "thumb": "https://m.media-amazon.com/images/I/41JSzpSRTVL._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/71yCKaQXv+L._SL1500_.jpg",
            "variant": "PT01",
            "main": {
              "https://m.media-amazon.com/images/I/71yCKaQXv+L._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/71yCKaQXv+L._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/71yCKaQXv+L._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/71yCKaQXv+L._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/71yCKaQXv+L._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/71yCKaQXv+L._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/71yCKaQXv+L._SX385_.jpg": [
                "385",
                "385"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/41HAWhp3MSL.jpg",
            "thumb": "https://m.media-amazon.com/images/I/41HAWhp3MSL._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/91KREQM8C6L._SL1500_.jpg",
            "variant": "PT02",
            "main": {
              "https://m.media-amazon.com/images/I/91KREQM8C6L._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/91KREQM8C6L._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/91KREQM8C6L._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/91KREQM8C6L._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/91KREQM8C6L._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/91KREQM8C6L._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/91KREQM8C6L._SX385_.jpg": [
                "385",
                "385"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/21Tj-9egp7L.jpg",
            "thumb": "https://m.media-amazon.com/images/I/21Tj-9egp7L._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/6155Fp7yaSL._SL1500_.jpg",
            "variant": "PT03",
            "main": {
              "https://m.media-amazon.com/images/I/6155Fp7yaSL._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/6155Fp7yaSL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/6155Fp7yaSL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/6155Fp7yaSL._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/6155Fp7yaSL._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/6155Fp7yaSL._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/6155Fp7yaSL._SX569_.jpg": [
                "569",
                "569"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/21A6B-nOF6L.jpg",
            "thumb": "https://m.media-amazon.com/images/I/21A6B-nOF6L._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/61stcFwi0vL._SL1500_.jpg",
            "variant": "PT04",
            "main": {
              "https://m.media-amazon.com/images/I/61stcFwi0vL._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/61stcFwi0vL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/61stcFwi0vL._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/61stcFwi0vL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/61stcFwi0vL._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/61stcFwi0vL._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/61stcFwi0vL._SX679_.jpg": [
                "679",
                "679"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/31pgUJWoVaL.jpg",
            "thumb": "https://m.media-amazon.com/images/I/31pgUJWoVaL._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/71U-3BfjvjL._SL1500_.jpg",
            "variant": "PT05",
            "main": {
              "https://m.media-amazon.com/images/I/71U-3BfjvjL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/71U-3BfjvjL._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/71U-3BfjvjL._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/71U-3BfjvjL._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/71U-3BfjvjL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/71U-3BfjvjL._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/71U-3BfjvjL._SX522_.jpg": [
                "522",
                "522"
              ]
            }
          }
        ],
        "isCurrentProduct": false,
        "link": "https://www.amazon.in/dp/B08N5T6CZ6/?th=1&psc=1",
        "asin": "B08N5T6CZ6",
        "title": "Silver 256 GB"
      },
      {
        "images": [
          {
            "large": "https://m.media-amazon.com/images/I/31+G-o8iK-L.jpg",
            "thumb": "https://m.media-amazon.com/images/I/31+G-o8iK-L._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/71vFKBpKakL._SL1500_.jpg",
            "variant": "MAIN",
            "main": {
              "https://m.media-amazon.com/images/I/71vFKBpKakL._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/71vFKBpKakL._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/71vFKBpKakL._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/71vFKBpKakL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/71vFKBpKakL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/71vFKBpKakL._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/71vFKBpKakL._SX425_.jpg": [
                "425",
                "425"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/41ew5HKA86L.jpg",
            "thumb": "https://m.media-amazon.com/images/I/41ew5HKA86L._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/8134-T9Jf6L._SL1500_.jpg",
            "variant": "PT01",
            "main": {
              "https://m.media-amazon.com/images/I/8134-T9Jf6L._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/8134-T9Jf6L._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/8134-T9Jf6L._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/8134-T9Jf6L._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/8134-T9Jf6L._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/8134-T9Jf6L._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/8134-T9Jf6L._SX385_.jpg": [
                "385",
                "385"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/41y5ymFDnBL.jpg",
            "thumb": "https://m.media-amazon.com/images/I/41y5ymFDnBL._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/81JFWbGkeEL._SL1500_.jpg",
            "variant": "PT02",
            "main": {
              "https://m.media-amazon.com/images/I/81JFWbGkeEL._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/81JFWbGkeEL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/81JFWbGkeEL._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/81JFWbGkeEL._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/81JFWbGkeEL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/81JFWbGkeEL._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/81JFWbGkeEL._SX679_.jpg": [
                "679",
                "679"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/2187LE6wzGL.jpg",
            "thumb": "https://m.media-amazon.com/images/I/2187LE6wzGL._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/61UVTIkDLuL._SL1500_.jpg",
            "variant": "PT03",
            "main": {
              "https://m.media-amazon.com/images/I/61UVTIkDLuL._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/61UVTIkDLuL._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/61UVTIkDLuL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/61UVTIkDLuL._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/61UVTIkDLuL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/61UVTIkDLuL._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/61UVTIkDLuL._SX679_.jpg": [
                "679",
                "679"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/21ltHjqsBEL.jpg",
            "thumb": "https://m.media-amazon.com/images/I/21ltHjqsBEL._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/71hHMsqVzGL._SL1500_.jpg",
            "variant": "PT04",
            "main": {
              "https://m.media-amazon.com/images/I/71hHMsqVzGL._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/71hHMsqVzGL._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/71hHMsqVzGL._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/71hHMsqVzGL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/71hHMsqVzGL._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/71hHMsqVzGL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/71hHMsqVzGL._SX569_.jpg": [
                "569",
                "569"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/31ZlPLZjrwL.jpg",
            "thumb": "https://m.media-amazon.com/images/I/31ZlPLZjrwL._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/71s0pbb7bOL._SL1500_.jpg",
            "variant": "PT05",
            "main": {
              "https://m.media-amazon.com/images/I/71s0pbb7bOL._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/71s0pbb7bOL._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/71s0pbb7bOL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/71s0pbb7bOL._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/71s0pbb7bOL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/71s0pbb7bOL._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/71s0pbb7bOL._SX425_.jpg": [
                "425",
                "425"
              ]
            }
          }
        ],
        "isCurrentProduct": false,
        "link": "https://www.amazon.in/dp/B08N5XSG8Z/?th=1&psc=1",
        "asin": "B08N5XSG8Z",
        "title": "Gold 256 GB"
      },
      {
        "images": [
          {
            "large": "https://m.media-amazon.com/images/I/316ArzLeJ2L.jpg",
            "thumb": "https://m.media-amazon.com/images/I/316ArzLeJ2L._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/71jG+e7roXL._SL1500_.jpg",
            "variant": "MAIN",
            "main": {
              "https://m.media-amazon.com/images/I/71jG+e7roXL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/71jG+e7roXL._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/71jG+e7roXL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/71jG+e7roXL._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/71jG+e7roXL._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/71jG+e7roXL._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/71jG+e7roXL._SX466_.jpg": [
                "466",
                "466"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/410Is8X6jSL.jpg",
            "thumb": "https://m.media-amazon.com/images/I/410Is8X6jSL._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/71-6roO29AL._SL1500_.jpg",
            "variant": "PT01",
            "main": {
              "https://m.media-amazon.com/images/I/71-6roO29AL._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/71-6roO29AL._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/71-6roO29AL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/71-6roO29AL._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/71-6roO29AL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/71-6roO29AL._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/71-6roO29AL._SX522_.jpg": [
                "522",
                "522"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/417bLev2AmL.jpg",
            "thumb": "https://m.media-amazon.com/images/I/417bLev2AmL._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/913iRx-3W-L._SL1500_.jpg",
            "variant": "PT02",
            "main": {
              "https://m.media-amazon.com/images/I/913iRx-3W-L._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/913iRx-3W-L._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/913iRx-3W-L._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/913iRx-3W-L._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/913iRx-3W-L._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/913iRx-3W-L._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/913iRx-3W-L._SX569_.jpg": [
                "569",
                "569"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/21cr-m0oDgL.jpg",
            "thumb": "https://m.media-amazon.com/images/I/21cr-m0oDgL._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/61uNK7su24L._SL1500_.jpg",
            "variant": "PT03",
            "main": {
              "https://m.media-amazon.com/images/I/61uNK7su24L._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/61uNK7su24L._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/61uNK7su24L._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/61uNK7su24L._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/61uNK7su24L._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/61uNK7su24L._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/61uNK7su24L._SX466_.jpg": [
                "466",
                "466"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/21S4-+VSllL.jpg",
            "thumb": "https://m.media-amazon.com/images/I/21S4-+VSllL._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/61ChHwbxObL._SL1500_.jpg",
            "variant": "PT04",
            "main": {
              "https://m.media-amazon.com/images/I/61ChHwbxObL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/61ChHwbxObL._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/61ChHwbxObL._SX425_.jpg": [
                "425",
                "425"
              ],
              "https://m.media-amazon.com/images/I/61ChHwbxObL._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/61ChHwbxObL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/61ChHwbxObL._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/61ChHwbxObL._SX569_.jpg": [
                "569",
                "569"
              ]
            }
          },
          {
            "large": "https://m.media-amazon.com/images/I/31uDXnoCg6L.jpg",
            "thumb": "https://m.media-amazon.com/images/I/31uDXnoCg6L._SX38_SY50_CR,0,0,38,50_.jpg",
            "hiRes": "https://m.media-amazon.com/images/I/71z-1j187cL._SL1500_.jpg",
            "variant": "PT05",
            "main": {
              "https://m.media-amazon.com/images/I/71z-1j187cL._SX466_.jpg": [
                "466",
                "466"
              ],
              "https://m.media-amazon.com/images/I/71z-1j187cL._SX385_.jpg": [
                "385",
                "385"
              ],
              "https://m.media-amazon.com/images/I/71z-1j187cL._SX342_.jpg": [
                "342",
                "342"
              ],
              "https://m.media-amazon.com/images/I/71z-1j187cL._SX679_.jpg": [
                "679",
                "679"
              ],
              "https://m.media-amazon.com/images/I/71z-1j187cL._SX522_.jpg": [
                "522",
                "522"
              ],
              "https://m.media-amazon.com/images/I/71z-1j187cL._SX569_.jpg": [
                "569",
                "569"
              ],
              "https://m.media-amazon.com/images/I/71z-1j187cL._SX425_.jpg": [
                "425",
                "425"
              ]
            }
          }
        ],
        "isCurrentProduct": true,
        "link": "https://www.amazon.in/dp/B08N5W4NNB/?th=1&psc=1",
        "asin": "B08N5W4NNB",
        "title": "Space Grey 256 GB"
      }
    ],
    "videos": [
      {
        "groupType": "IB_G1",
        "offset": "0",
        "thumb": "https://m.media-amazon.com/images/I/61B1rYhCGzL._SX35_SY46._CR0,0,35,46_BG85,85,85_BR-120_PKdp-play-icon-overlay__.jpg",
        "durationSeconds": 62,
        "marketPlaceID": "A21TJRUUN4KGV",
        "isVideo": true,
        "isHeroVideo": false,
        "title": "Apple MacBook Air with Apple M1 Chip",
        "languageCode": "en_IN",
        "holderId": "holder933e1f270226422f8ed9767420914fcf",
        "url": "https://m.media-amazon.com/images/S/vse-vms-transcoding-artifact-eu-west-1-prod/7ee34064-699c-472b-b6a3-6cec7329b56a/default.jobtemplate.mp4.480.mp4",
        "videoHeight": "480",
        "videoWidth": "854",
        "durationTimestamp": "01:02",
        "slateUrl": "https://m.media-amazon.com/images/I/61B1rYhCGzL.SX522_.jpg",
        "minimumAge": 0,
        "variant": "MAIN",
        "slateHash": {
          "extension": "jpg",
          "physicalID": null,
          "width": "1920",
          "height": "1080"
        },
        "mediaObjectId": "933e1f270226422f8ed9767420914fcf",
        "thumbUrl": "https://m.media-amazon.com/images/I/61B1rYhCGzL._SX35_SY46._CR0,0,35,46_BG85,85,85_BR-120_PKdp-play-icon-overlay__.jpg"
      }
    ],
    "featureBullets": [
      "All-Day Battery Life – Go longer than ever with up to 18 hours of battery life.",
      "Powerful Performance – Take on everything from professional-quality editing to action-packed gaming with ease. The Apple M1 chip with an 8-core CPU delivers up to 3.5x faster performance than the previous generation while using way less power.",
      "Superfast Memory – 8GB of unified memory makes your entire system speedy and responsive. That way it can support tasks like memory-hogging multitab browsing and opening a huge graphic file quickly and easily.",
      "Stunning Display – With a 13.3-inch/33.74 cm Retina display, images come alive with new levels of realism. Text is sharp and clear, and colors are more vibrant.",
      "Why Mac – Easy to learn. Easy to set up. Astoundingly powerful. Intuitive. Packed with apps to use right out of the box. Mac is designed to let you work, play, and create like never before.",
      "Simply Compatible – All your existing apps work, including Adobe Creative Cloud, Microsoft 365, and Google Drive. Plus you can use your favorite iPhone and iPad apps directly on macOS. Altogether you’ll have access to the biggest collection of apps ever for Mac. All available on the App Store.",
      "Easy to Learn – If you already have an iPhone, MacBook Air feels familiar from the moment you turn it on. And it works perfectly with all your Apple devices. Use your iPad to extend the workspace of your Mac, answer texts and phone calls directly on your Mac, and more.",
      "Fanless Design – Your MacBook Air stays cool and runs quietly even while tackling intense workloads.",
      "AppleCare – Every Mac comes with a one-year limited warranty and up to 90 days of complimentary technical support. Get AppleCare+ to extend your coverage and reduce the stress and cost of unexpected repairs.",
      "Environmentally Friendly – MacBook Air is made with a 100% recycled aluminum enclosure and uses less energy for a smaller carbon footprint"
    ],
    "maxQuantity": 1,
    "brand": "Apple",
    "techSpecs": {
      "Wireless": "802.11ax Wi-Fi 6 wireless networking; IEEE 802.11a/b/g/n/ac compatible. Bluetooth 5.0 wireless technology",
      "Processor": "System on Chip (SoC), Apple M1 chip, 8-core CPU with 4 performance cores and 4 efficiency cores, 16-core Neural Engine",
      "Warranty": "Apple-branded hardware product and accessories contained in the original packaging (“Apple Product”) come with a One-Year Limited Warranty. See apple.com/in/legal/warranty for more information",
      "Charging and Expansion": "Two Thunderbolt / USB 4 ports with support for: Charging, DisplayPort, Thunderbolt 3 (up to 40 Gbps), USB 3.1 Gen 2 (up to 10 Gbps)",
      "Graphics and Video Support": "Apple 8-core GPU",
      "In the Box": "13-inch MacBook Air, 30W USB-C Power Adapter, USB-C Charge Cable (2 m)",
      "Height": "0.16–0.63 inch (0.41–1.61 cm)",
      "Width": "11.97 inches (30.41 cm)",
      "Depth": "8.36 inches (21.24 cm)",
      "Weight": "2.8 pounds (1.25 kg)",
      "Display": "13.3-inch (diagonal) LED-backlit display with IPS technology; 2560-by-1600 native resolution at 227 pixels per inch with support for millions of colors",
      "Release Date": "Nov 2020"
    }
  }
}
```


  - /reviews

   ```javascript
{
  "totalReview": "2,432",
  "reviewRating": "4.6",
  "limit": 2,
  "reviewList": [
    {
      "id": "R2BYU3Y39QIEQO",
      "rating": "4.0",
      "title": "An overall good premium experience",
      "userName": "Abhishek",
      "date": "4 May 2022",
      "review": "SUMMERY: As a first time iPhone user, I would say one should definitely buy iPhone ONLY for premium built & premium hardware (will talk later) while the whole iOS experience is pretty overrated. iPhones isn't any exceptionally fast with normal apps like YouTube, Insta etc, Android phones are equally snappy with them in 2022. PROS: 1. Impressive hardware, the heptics, the autobrightness & otherwise highly ignored things in Android are way too perfectly executed in iPhone and it DOES make a big difference in user experience!! 2. The screen is AMAZING.. it doesn't have 90 or 120 hz refresh rate but it FEELS better than my Nord with 90 hz!! 3. A14 bionic promises years of performance ahead. 4. Battery life is somewhere in between good & great. 5. 6. The dimensions of phone, it's smaller than usual android phones and feels much more handy along with less weight. 7. Overall build quality is great. 8. Best audio output out there. 9. Long term support. CONS: 1. SLOW CHARGING. 20 W only, you'll be jealous of 1/3rd price phones with 60 W charging. Yes that much high charging will effect health of battery but 20 W is way way too less, if Apple is such a legendary company they should have created a battery that can withstand decently fast charging while instead they just use slow charging to keep their battery's health. 2. Overy exhagerated software experience, reality is that Android is more user friendly with better gesture & commonsense options & settings & steps to do simple things. iOS looks pretty yes but UX engineers at Apple have really done a crappy job.. there's still no notification grouping in correct manner (its executed poorly), no proper homescreen customisation & just so so so many \"commonsense\" things are missing from iOS I can rant all day about it. Everything you can do in Android with a single click or swipe takes 2 swipes and then a click to do in iOS its SOOOOO ANNOYING. Like you want to clear a notification? Swipe and then click on clear. You want to open a notification? Swipe FIRST and then click open.. like wth???????? 3. DON'T believe Apple fanboys who scream about speed, Android phones are equally snappy in performance today. There are split second app loading times in iOS also, just like in Android. And yeah iOS DOES HAVE occasional bugs too, apps taking too much time sometimes etc etc. 4. FaceID is nice but an in-fingerprint reader seems the best ID to me atleast, that's missing. 5. Ridiculously expensive accessories 6. Battery life is above good but not great. In the end I would say iPhone, overall, does provide a better experience (mostly cuz of hardware only) but it's expensive. Do know that you're NOT buying a value-for-money phone at all, so buy it only if you can afford it without much difficulty."
    },
    {
      "id": "R2QIKD9JK6PUU3",
      "rating": "4.0",
      "title": "Pros and cons",
      "userName": "Mohit",
      "date": "8 October 2022",
      "review": "i purchased this mobile in 2022. If you are looking for gaming i phone then go for pro version of i phone 13 and 14 because there are frame drops issue and battery drain is fast like my poco f1 but still you can play bgmi nicely under fast network speed and low room temperature . BTW cemra and display quality is awesome specially video quality is amazing. Battery performance is not so good, overall performance and smoothness Is OP"
    }
  ]
}
```
