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

public class Table extends Element {
  private String title;

  public Table(String title) {
    this.title = title;
  }

  @Override
  public void print() {
    System.out.println(title);
  }

}
