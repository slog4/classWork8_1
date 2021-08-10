package com.company;

public class ProDocumentWorcer extends DocumentWorcer {

    protected void editDocument(){
        System.out.println("Документ отредактирован");
    }
    protected void saveDocument(){
        System.out.println("Документ сохранён в старом формате, сохранение в новом формате доступно в версии Эксперт");
    }
}
