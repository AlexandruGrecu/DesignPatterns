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

public class Paragraph extends Element {
  private String text;

  public Paragraph(String text) {
    this.text = text;
  }

  @Override
  public void print() {
    System.out.println(text);
  }

}
