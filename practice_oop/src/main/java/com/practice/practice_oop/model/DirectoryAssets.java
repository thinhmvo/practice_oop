package com.practice.practice_oop.model;

import java.time.LocalDate;

public abstract class DirectoryAssets {
    private String name;
    private LocalDate lastModify;
    private String owner;
    private int fileSize;

    protected DirectoryAssets(String name, LocalDate lastModify, String owner, int fileSize) {
        this.name = name;
        this.lastModify = lastModify;
        this.owner = owner;
        this.fileSize = fileSize;
    }
}