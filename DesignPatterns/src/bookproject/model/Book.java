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

public class Book {
  private String title;
  private Author author;
  private List<Chapter> chapters = new ArrayList<Chapter>();

  public Book(String title) {
    this.title = title;
  }

  @SuppressWarnings("hiding")
  public void addAuthor(Author author) {
    this.author = author;
  }

  public int createChapter(String chapterName) {
    chapters.add(new Chapter(chapterName));
    return chapters.size() - 1;
  }

  public Chapter getChapter(int indexOfChapter) {
    return chapters.get(indexOfChapter);
  }

  public void print() {
    System.out.println("Book: " + title);
    author.print();
    for (Chapter chapter : chapters) {
      chapter.print();
    }
  }
}
