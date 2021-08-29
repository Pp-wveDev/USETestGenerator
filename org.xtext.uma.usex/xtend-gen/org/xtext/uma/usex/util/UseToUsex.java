package org.xtext.uma.usex.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("all")
public class UseToUsex {
  public static String useToUsex(final String filepath) throws FileNotFoundException, IOException {
    File originFile = new File(filepath);
    Scanner reader = new Scanner(originFile);
    int _length = filepath.length();
    int _minus = (_length - 3);
    String _substring = filepath.substring(0, _minus);
    String destinyPath = (_substring + "usex");
    File destinyFile = new File(destinyPath);
    destinyFile.createNewFile();
    FileWriter writer = new FileWriter(destinyFile);
    while (reader.hasNextLine()) {
      {
        String line = reader.nextLine();
        boolean _contains = line.contains("begin");
        if (_contains) {
          writer.write((line + "\"\n"));
          line = UseToUsex.processBody(reader);
        }
        writer.write((line + "\n"));
      }
    }
    reader.close();
    writer.close();
    return destinyPath;
  }
  
  private static String processBody(final Scanner reader) {
    StringBuilder sB = new StringBuilder();
    boolean continue_ = true;
    while ((reader.hasNext() && continue_)) {
      {
        String line = reader.nextLine();
        if ((line.contains("end") && (!line.contains(";")))) {
          int indexEnd = line.indexOf("end");
          String _substring = line.substring(0, indexEnd);
          String _plus = (_substring + "\"");
          String _substring_1 = line.substring(indexEnd);
          String _plus_1 = (_plus + _substring_1);
          line = _plus_1;
          continue_ = false;
        }
        sB.append((line + "\n"));
      }
    }
    return sB.toString();
  }
  
  public static void deleteTmp(final String filepath) {
    File file = new File(filepath);
    boolean _delete = file.delete();
    boolean _not = (!_delete);
    if (_not) {
      throw new TestGenerationException("Error deleting tmp file");
    }
  }
}
