package com.vincent.springboot.strategy.factory;

/**
 * 具体的创建器实现对象，实现创建导出成文本文件格式的对象
 */
public class ExportTxtFileOperate extends ExportOperate {
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}