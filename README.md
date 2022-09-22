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
[{
    position: { page: 1, position: 1, global_position: 1 },
    asin: 'B07CSLG8ST',
    price: {
        discounted: false,
        current_price: 574,
        currency: 'USD',
        before_price: 0,
        savings_amount: 0,
        savings_percent: 0
    },
    reviews: { total_reviews: 317, rating: 4.6 },
    url: 'https://www.amazon.com/dp/B07CSLG8ST',
    score: '1458.20',
    sponsored: false,
    amazonChoice: false,
    bestSeller: false,
    amazonPrime: false,
    title: 'Newest Flagship Microsoft Xbox One S 1TB HDD Bundle with Two (2X) Wireless Controllers, 1-Month Game Pass Trial, 14-Day Xbox Live Gold Trial - White',
    thumbnail: 'https://m.media-amazon.com/images/I/51-JAEI1jzL._AC_UY218_.jpg'
},...]
```
