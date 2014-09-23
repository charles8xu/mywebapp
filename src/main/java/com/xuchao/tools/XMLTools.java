package com.xuchao.tools;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * Created by xuchao on 14-9-1.
 */
public class XMLTools {

    static final Logger logger = LoggerFactory.getLogger(XMLTools.class);

    private File file;
    private SAXReader reader;
    private Document document;

    public XMLTools(String fileName){
        this.file = new File(fileName);
    }

    public void parseXML() throws DocumentException {
        this.reader = new SAXReader();
        this.document = reader.read(file);
        Element rootElement = document.getRootElement();
        logger.info("根节点名称:{}",rootElement.getName());
        logger.info("根节点有多少属性:{}",rootElement.attributeCount());
        logger.info("根节点属性:{}",rootElement.attributeValue("name"));
        logger.info("根节点属性:{}",rootElement.attributeValue("version"));
        logger.info("根节内文本:{}",rootElement.getTextTrim());
        logger.info("根节点子节点文本内容:{}",rootElement.getStringValue());
        for (Object obj : rootElement.elements()){
            Element element = (Element) obj;
            logger.info("Element name:{};Element value:{}",element.getName(),element.getTextTrim());
        }
    }

    public static void main(String[] args){
        XMLTools xmlTools = new XMLTools("/home/xuchao/IdeaProjects/mywebapp/src/main/resources/database.xml");
        try {
            xmlTools.parseXML();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

}
