/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package composite;

import composite.model.Book;
import composite.model.Image;
import composite.model.Paragraph;
import composite.model.Section;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Client {

  public static void main(String[] args) {
    Book noapteBuna = new Book("Noapte buna copii.!");
    Section cap1 = new Section("Capitolul 1.");
    cap1.add(new Paragraph("Text 1"));
    cap1.add(new Paragraph("Text 2"));
    cap1.add(new Image("Image 1"));
    noapteBuna.add(cap1);
    noapteBuna.add(new Paragraph("Multumesc"));
    noapteBuna.print();
  }

}
