package com.amazonproductapi.model;

import java.util.ArrayList;
import java.util.HashMap;
import com.amazonproductapi.model.common.AuthorModel;
import com.amazonproductapi.model.common.PriceModel;
import com.amazonproductapi.model.common.RatingModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductInfoModel {

  private String asin;
  private PriceModel price;
  private RatingModel rating;
  private String url;
  private boolean sponsored = false;
  private boolean amazonChoice = false;
  private boolean bestSeller = false;
  private boolean prime = false;
  private String title;
  private String thumbnail;
  private ArrayList<AuthorModel> authorsList;
  private ArrayList<HashMap<String, String>> categories;
  private boolean itemAvailable = true;
  private ArrayList<Object> productVariants;
  private ArrayList<Object> videos;
  private String description;
  private ArrayList<String> featureBullets;
  private int maxQuantity;
  private String brand;
  private HashMap<String, String> techSpecs;

}
