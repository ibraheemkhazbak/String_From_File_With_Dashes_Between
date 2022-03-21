package com.khazbak;

import com.khazbak.modifying.IStringAssembler;
import com.khazbak.modifying.StringAssembler;
import com.khazbak.reading.DataReader;
import com.khazbak.reading.IDataReader;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file= new File("data.txt");
        IDataReader dataReader= new DataReader();
        List<String> data = dataReader.readFileData(file);

        IStringAssembler stringAssembler=new StringAssembler();
        String outputString = stringAssembler.assemble(data,"-");
        System.out.println(outputString);
    }
}
