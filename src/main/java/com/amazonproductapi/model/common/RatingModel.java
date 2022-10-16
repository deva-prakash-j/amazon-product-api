package com.amazonproductapi.model.common;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RatingModel {

  private String totalReview = "0";
  private String reviewRating = "0";
  private List reviewList;

}
