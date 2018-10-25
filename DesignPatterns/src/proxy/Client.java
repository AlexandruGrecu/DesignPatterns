/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package proxy;

import proxy.model.Book;
import proxy.model.Image;
import proxy.model.ImageProxy;
import proxy.model.Paragraph;
import proxy.model.Section;

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
    cap1.add(new ImageProxy("image1.jpg"));
    cap1.add(new ImageProxy("image2.jpg"));
    noapteBuna.add(cap1);
    noapteBuna.add(new Paragraph("Multumesc"));
    noapteBuna.print();
  }

}
