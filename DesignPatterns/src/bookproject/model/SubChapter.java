/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package bookproject.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class SubChapter {
  private String name;
  List<Element> elements = new ArrayList<>();

  public SubChapter(String subChapterName) {
    name = subChapterName;
  }

  public void createNewParagraph(String text) {
    elements.add(new Paragraph(text));
  }

  public void createNewImage(String imageName) {
    elements.add(new Image(imageName));
  }

  public void createNewTable(String title) {
    elements.add(new Table(title));
  }

  public void print() {
    System.out.println("Subchapter: " + name);
    for (Element element : elements) {
      element.print();
    }
  }

}
