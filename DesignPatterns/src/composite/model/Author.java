/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package composite.model;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Author {
  private String name;

  public Author(String name) {
    this.name = name;
  }

  public void print() {
    System.out.println("Author: " + name);
  }
}
