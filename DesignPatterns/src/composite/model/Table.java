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

public class Table implements Element {
  private String title;

  public Table(String title) {
    this.title = title;
  }

  @Override
  public void print() {
    System.out.println(title);
  }

  @Override
  public void add(Element element) {
    // TODO Auto-generated method stub
  }

  @Override
  public void remove(Element element) {
    // TODO Auto-generated method stub

  }

  @Override
  public Element getElement(int index) {
    return null;
  }

}
