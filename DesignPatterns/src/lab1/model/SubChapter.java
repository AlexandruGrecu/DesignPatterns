/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package lab1.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class SubChapter {
  private String name;
  private List<Paragraph> paragraphs = new ArrayList<>();
  private List<Image> images = new ArrayList<>();
  private List<Table> tables = new ArrayList<>();

  public SubChapter(String subChapterName) {
    name = subChapterName;
  }

  public void createNewParagraph(String text) {
    paragraphs.add(new Paragraph(text));
  }

  public void createNewImage(String imageName) {
    images.add(new Image(imageName));
  }

  public void createNewTable(String title) {
    tables.add(new Table(title));
  }

  @Override
  public String toString() {
    return "SubChapter [name=" + name + ", paragraphs=" + paragraphs + ", images=" + images + ", tables=" + tables + "]";
  }

}
