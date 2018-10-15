/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package composite.model;

import java.util.List;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Book implements Element {
  private Author author;
  private List<Element> content;
  private String name;

  public Book(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    Book noapteBuna = new Book("Noapte buna copii.!");
    Section cap1 = new Section("Capitolul 1.");
    cap1.add(new Paragraph("Text 1"));
    cap1.add(new Paragraph("Text 2"));
    cap1.add(new Image("Image 1"));
    noapteBuna.add(new Paragraph("Multumesc"));
    noapteBuna.add(cap1);

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
