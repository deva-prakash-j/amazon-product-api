package com.amazonproductapi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.amazonproductapi.model.Countries;
import com.amazonproductapi.model.ProductInfoModel;
import com.amazonproductapi.util.AmazonScraper;
import com.amazonproductapi.util.CommonUtil;
import io.swagger.annotations.Api;

@RestController
@Api(tags = "Amazon Product API")
@RequestMapping("/amazon")
public class AmazonController {

  @Autowired
  CommonUtil util;

  List<Countries> countriesList;

  @GetMapping("/countries")
  public List<Countries> getCountries() {
    return getCountryList();
  }

  @GetMapping("/categories")
  public ResponseEntity<Object> getCategories(
      @RequestParam(value = "countryCode", defaultValue = "IN") String countryCode) {
    getCountryList();
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("countryCode", countryCode);
    AmazonScraper scraper = new AmazonScraper(countriesList, map);
    HashMap<String, String> cat = scraper.getCategories();
    HashMap<String, HashMap<String, String>> response =
        new HashMap<String, HashMap<String, String>>();
    response.put("categories", cat);
    return new ResponseEntity<Object>(response, HttpStatus.OK);
  }

  @GetMapping("/products")
  public ResponseEntity<Object> getProducts(
      @RequestParam(value = "countryCode", defaultValue = "IN") String countryCode,
      @RequestParam String keyword, @RequestParam(defaultValue = "20") int limit) {
    getCountryList();
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("countryCode", countryCode);
    map.put("keyword", keyword);
    map.put("limit", Integer.toString(limit));
    map.put("type", "products");
    AmazonScraper scraper = new AmazonScraper(countriesList, map);
    ArrayList<ProductInfoModel> prodList = scraper.getProducts(limit);
    HashMap<String, Object> outMap = new HashMap<String, Object>();
    outMap.put("total", prodList.size());
    outMap.put("productsList", prodList);
    return new ResponseEntity<Object>(outMap, HttpStatus.OK);
  }

  @GetMapping("/product-details")
  public ResponseEntity<Object> getProductDetails(
      @RequestParam(value = "countryCode", defaultValue = "IN") String countryCode,
      @RequestParam String asin) {
    getCountryList();
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("countryCode", countryCode);
    map.put("type", "asin");
    map.put("asin", asin);
    AmazonScraper scraper = new AmazonScraper(countriesList, map);
    HashMap<String, Object> outMap = new HashMap<String, Object>();
    outMap.put("total", 1);
    outMap.put("productDetail", scraper.getProductDetails());
    return new ResponseEntity<Object>(outMap, HttpStatus.OK);
  }

  @GetMapping("/reviews")
  public ResponseEntity<Object> getReviews(
      @RequestParam(value = "countryCode", defaultValue = "IN") String countryCode,
      @RequestParam String asin, @RequestParam(defaultValue = "20") int limit) {
    getCountryList();
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("countryCode", countryCode);
    map.put("type", "reviews");
    map.put("limit", Integer.toString(limit));
    map.put("asin", asin);
    AmazonScraper scraper = new AmazonScraper(countriesList, map);
    return new ResponseEntity<Object>(scraper.getReviews(limit), HttpStatus.OK);
  }

  public List<Countries> getCountryList() {
    if (countriesList == null) {
      try {
        countriesList = util.getCountries("/static/countries.json");
      } catch (IOException e) {
        System.out.print(e);
      }
    }
    return countriesList;
  }
}
