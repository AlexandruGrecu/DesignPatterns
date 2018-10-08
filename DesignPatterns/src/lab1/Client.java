/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package lab1;

import lab1.model.Author;
import lab1.model.Book;
import lab1.model.Chapter;
import lab1.model.SubChapter;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Client {
  public static void main(String[] args) {
    Book book = new Book("Amintiri din copilarie");
    Author author = new Author("Ion Creanga");

    book.addAuthor(author);

    int indexOfChapterOne = book.createChapter("Capitolul 1");
    Chapter chapter1 = book.getChapter(indexOfChapterOne);
    int indexOfSubChapterOneOne = chapter1.createSubChapter("Subcapitolul 1.1");
    SubChapter scOneOne = chapter1.getSubChapter(indexOfSubChapterOneOne);
    scOneOne.createNewParagraph("Paragraph 1");
    scOneOne.createNewParagraph("Paragraph 2");
    scOneOne.createNewParagraph("Paragraph 3");
    scOneOne.createNewImage("Image 1");
    scOneOne.createNewParagraph("Paragraph 4");
    scOneOne.createNewTable("Table 1");
    scOneOne.createNewParagraph("Paragraph 5");

    System.out.println(book);

  }
}
