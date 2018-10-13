/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package bookproject;

import bookproject.model.Author;
import bookproject.model.Book;
import bookproject.model.Chapter;
import bookproject.model.SubChapter;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Client {
  public static void main(String[] args) {
    Book book = new Book("Amintiri din copilarie");
    Author author = new Author("Ion Creanga");

    book.addAuthor(author);
    //CHAPTER 1
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
    int indexOfSubChapterOneTwo = chapter1.createSubChapter("Subcapitolul 1.2");
    SubChapter scOneTwo = chapter1.getSubChapter(indexOfSubChapterOneTwo);
    scOneTwo.createNewParagraph("Paragraph 1");
    scOneTwo.createNewParagraph("Paragraph 2");
    scOneTwo.createNewParagraph("Paragraph 3");
    scOneTwo.createNewImage("Image 1");
    scOneTwo.createNewParagraph("Paragraph 4");
    scOneTwo.createNewTable("Table 1");
    scOneTwo.createNewParagraph("Paragraph 5");

    //CHAPTER 2
    int indexOfChapterTwo = book.createChapter("Capitolul 2");
    Chapter chapter2 = book.getChapter(indexOfChapterOne);
    int indexOfSubChapterTwoOne = chapter1.createSubChapter("Subcapitolul 1.1");
    SubChapter scTwoOne = chapter1.getSubChapter(indexOfSubChapterTwoOne);
    scTwoOne.createNewParagraph("Paragraph 1");

    book.print();

  }
}
