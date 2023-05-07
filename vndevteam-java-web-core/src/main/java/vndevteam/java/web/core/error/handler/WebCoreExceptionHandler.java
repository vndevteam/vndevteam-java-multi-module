/**
 * Copyright © 2023 VNDevTeam. All rights reserved.
 * https://github.com/vndevteam
 */

package vndevteam.java.web.core.error.handler;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;

/**
 * Web core exception handler interface.
 *
 * @author Lam Ngoc Khuong
 * @since 1.0
 */
public interface WebCoreExceptionHandler {
  ResponseEntity<Object> handleHttpMediaTypeNotSupported(Throwable ex, WebRequest request,
      HttpServletRequest servletRequest);
}
