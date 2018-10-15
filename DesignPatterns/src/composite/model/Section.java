/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package composite.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Section implements Element {
  private String title;
  private List<Element> content = new ArrayList<Element>();

  public String getName() {
    return title;
  }

  public void setName(String name) {
    this.title = name;
  }

  public Section(String name) {
    this.title = name;
  }

  @Override
  public void add(Element element) {
    this.content.add(element);
  }

  @Override
  public void remove(Element element) {
    this.content.remove(element);
  }

  @Override
  public Element getElement(int index) {
    return this.content.get(index);
  }

  @Override
  public void print() {
    for (Element element : content) {
      element.print();
    }
  }

}
