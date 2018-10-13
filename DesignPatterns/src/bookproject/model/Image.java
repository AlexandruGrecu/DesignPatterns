/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package bookproject.model;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Image extends Element {
  private String imageName;

  public Image(String imageName) {
    this.imageName = imageName;
  }

  @Override
  public void print() {
    System.out.println(imageName);
  }
}
