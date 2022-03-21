package com.khazbak.reading;

import java.io.File;
import java.util.List;

public interface IDataReader {
    List<String> readFileData(File file);

}
