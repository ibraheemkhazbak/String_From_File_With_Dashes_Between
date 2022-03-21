package com.khazbak.modifying;

import java.util.List;

public class StringAssembler implements IStringAssembler{

    @Override
    public String assemble(List<String> strings, String between) {
        StringBuilder stringBuilder =  new StringBuilder();
        int length =  strings.size();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(strings.get(i));
            if(!isLastIndex(i,length)){
                stringBuilder.append(between);
            }
        }
        return stringBuilder.toString();
    }

    private boolean isLastIndex(int index, int length) {
        return index+1==length;
    }
}
