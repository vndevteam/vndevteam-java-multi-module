/**
 * Copyright © 2023 VNDevTeam. All rights reserved.
 * https://github.com/vndevteam
 */

package vndevteam.java.webapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Index Controller.
 *
 * @author Lam Ngoc Khuong
 * @since 1.0
 */
@RestController
public class IndexController {
  @GetMapping("/")
  public ResponseEntity<Void> index() {
    return ResponseEntity.ok(null);
  }
}
