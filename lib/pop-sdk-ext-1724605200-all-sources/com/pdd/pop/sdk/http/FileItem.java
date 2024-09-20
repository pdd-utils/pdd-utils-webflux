package com.pdd.pop.sdk.http;

import java.io.File;

/**
 * @author galuowa
 */
public class FileItem {

    private String fileName;
    private String filePath;

    public FileItem(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public File getFile() {
        return new File(filePath);
    }
}
