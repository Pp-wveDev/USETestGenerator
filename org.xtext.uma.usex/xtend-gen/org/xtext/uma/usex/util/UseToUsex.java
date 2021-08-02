package org.xtext.uma.usex.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.eclipse.xtext.xbase.lib.InputOutput;

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
    int beginCounter = 0;
    while ((reader.hasNext() && (beginCounter >= 0))) {
      {
        String line = reader.nextLine();
        if (((line.equals("begin") || line.contains("then")) || line.contains("do"))) {
          beginCounter++;
        } else {
          boolean _contains = line.contains("end");
          if (_contains) {
            beginCounter--;
            if ((beginCounter == (-1))) {
              String[] decLine = line.split("e");
              String _get = decLine[0];
              String _plus = (_get + "\"e");
              String _get_1 = decLine[1];
              String _plus_1 = (_plus + _get_1);
              line = _plus_1;
            }
          }
        }
        sB.append((line + "\n"));
      }
    }
    return sB.toString();
  }
  
  public static String deleteTmp(final String filepath) {
    String _xblockexpression = null;
    {
      File file = new File(filepath);
      String _xifexpression = null;
      boolean _delete = file.delete();
      boolean _not = (!_delete);
      if (_not) {
        _xifexpression = InputOutput.<String>println("Error deleting tmp file");
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
