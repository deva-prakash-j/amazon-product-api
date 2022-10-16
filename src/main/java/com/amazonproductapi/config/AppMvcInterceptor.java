package com.amazonproductapi.config;

import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import com.amazonproductapi.util.CommonUtil;

@Component
public class AppMvcInterceptor implements HandlerInterceptor {

  @Autowired
  CommonUtil util;

  public AppMvcInterceptor() {
    MDC.put("transactionId", UUID.randomUUID().toString());
  }



  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    String traceID = UUID.randomUUID().toString();
    MDC.put("transactionId", traceID);
    if (request.getMethod().equals(HttpMethod.GET.name())
        || request.getMethod().equals(HttpMethod.DELETE.name())
        || request.getMethod().equals(HttpMethod.PUT.name())) {
      this.util.displayReq(request, null);
    }
    return true;
  }
}
