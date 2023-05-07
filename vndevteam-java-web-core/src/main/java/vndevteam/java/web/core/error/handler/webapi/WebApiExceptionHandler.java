/**
 * Copyright © 2023 VNDevTeam. All rights reserved.
 * https://github.com/vndevteam
 */

package vndevteam.java.web.core.error.handler.webapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;
import vndevteam.java.web.core.error.handler.WebCoreExceptionHandler;

/**
 * Web API exception handler.
 *
 * @author Lam Ngoc Khuong
 * @since 1.0
 */
@RestControllerAdvice
@Order(5000)
public final class WebApiExceptionHandler extends ResponseEntityExceptionHandler
    implements WebCoreExceptionHandler {
  private final Logger LOG = LoggerFactory.getLogger(getClass());
  
  @Override
  public ResponseEntity<Object> handleHttpMediaTypeNotSupported(Throwable ex, WebRequest request,
      HttpServletRequest servletRequest) {
    return null;
  }
  
  @Override
  protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(
      HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatusCode status,
      WebRequest request) {
    return handleExceptionInternal(ex, ex, headers, status, request);
  }
  
}
