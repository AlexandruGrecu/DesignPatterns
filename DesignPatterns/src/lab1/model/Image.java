/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package lab1.model;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Image {
  private String imageName;

  public Image(String imageName) {
    this.imageName = imageName;
  }

  @Override
  public String toString() {
    return "Image [imageName=" + imageName + "]";
  }

}
