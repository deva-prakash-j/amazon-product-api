# amazon-product-api

Scrap product data from amazon using SpringBoot & Jsoup.

## Features
 
 - Extract products data from search result. 
 - Extract single product by using ASIN.
 - Extract product review by using ASIN.
 - Extract ist of categories.

## Endpoints

  - <code><strong>/help</strong> - Opens swagger UI.</code>
  - <code><strong>/categories</strong> - Get list of categories.</code>
  - <code><strong>/products</strong> - Get list of products.</code>
  - <code><strong>/product-details</strong> - Get product details using ASIN.</code>

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
Download
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
