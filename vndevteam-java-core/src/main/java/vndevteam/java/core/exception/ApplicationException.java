/**
 * Copyright © 2023 VNDevTeam. All rights reserved.
 * https://github.com/vndevteam
 */

package vndevteam.java.core.exception;

/**
 * ApplicationException.
 *
 * @author  Lam Ngoc Khuong
 * @since   1.0
 */
public class ApplicationException extends Exception implements ErrorCode {
  
  private static final long serialVersionUID = 1L;
  
  private final String code;
  private final Object[] arguments;
  
  /**
   * Define ApplicationException.
   *
   * @param code Error code
   * @param arguments Message arguments
   */
  public ApplicationException(String code, Object[] arguments) {
    super();
    this.code = code;
    this.arguments = arguments;
  }
  
  @Override
  public String getCode() {
    return this.code;
  }
  
  /**
   * Get Arguments.
   *
   * @return Object[]
   */
  public Object[] getArguments() {
    return this.arguments;
  }
}
