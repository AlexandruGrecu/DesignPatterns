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

public class Chapter {
  private String name;
  private List<SubChapter> subChapters = new ArrayList<>();

  public Chapter(String chapterName) {
    name = chapterName;
  }

  public int createSubChapter(String subChapterName) {
    subChapters.add(new SubChapter(subChapterName));
    return subChapters.size() - 1;
  }

  public SubChapter getSubChapter(int indexOfSubChapter) {
    return subChapters.get(indexOfSubChapter);
  }

  public void print() {
    System.out.println("Chapter: " + name);
    for (SubChapter subChapter : subChapters) {
      subChapter.print();
    }
  }

}
