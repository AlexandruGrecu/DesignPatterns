/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package proxy.model;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class ImageProxy implements Element {
  private String imageName;
  Image image = null;

  public ImageProxy(String imageName) {
    this.imageName = imageName;
  }

  @Override
  public void print() {
    if (this.image == null) {
      this.image = new Image(this.imageName);
    }
    this.image.print();
  }

  @Override
  public void add(Element element) {
    System.out.println("ERORR - IMG PROXY");
  }

  @Override
  public void remove(Element element) {
    System.out.println("ERORR - IMG PROXY");
  }

  @Override
  public Element getElement(int index) {
    System.out.println("ERORR - IMG PROXY");
    return null;
  }
}
