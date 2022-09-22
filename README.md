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
    "electronics": "Electronics",
    "beauty": "Beauty",
    "software": "Software",
    "appliances": "Appliances",
    "collectibles": "Collectibles",
    "apparel": "Clothing & Accessories",
    "todays-deals": "Deals",
    "digital-text": "Kindle Store",
    "home-improvement": "Tools & Home Improvement",
    "lawngarden": "Garden & Outdoors",
    "dvd": "Movies & TV Shows",
    "mobile-apps": "Apps & Games",
    "furniture": "Furniture",
    "gift-cards": "Gift Cards",
    "luggage": "Luggage & Bags",
    "hpc": "Health & Personal Care",
    "kitchen": "Home & Kitchen",
    "mi": "Musical Instruments",
    "popular": "Music",
    "instant-video": "Prime Video",
    "computers": "Computers & Accessories",
    "videogames": "Video Games",
    "jewelry": "Jewellery",
    "watches": "Watches",
    "speed-store": "Same-Day Delivery",
    "toys": "Toys & Games",
    "aps": "All Categories",
    "office-products": "Office Products",
    "sporting": "Sports, Fitness & Outdoors",
    "shoes": "Shoes & Handbags",
    "luxury-beauty": "Luxury Beauty",
    "industrial": "Industrial & Scientific",
    "amazon-pharmacy": "Amazon Pharmacy",
    "baby": "Baby",
    "grocery": "Grocery & Gourmet Foods",
    "alexa-skills": "Alexa Skills",
    "amazon-devices": "Amazon Devices",
    "specialty-aps-sns": "Subscribe & Save",
    "nowstore": "Amazon Fresh",
    "automotive": "Car & Motorbike",
    "stripbooks": "Books",
    "fashion": "Amazon Fashion",
    "under-ten-dollars": "Under ₹500"
  }
}
```
