package com.company;

import org.xml.sax.SAXException;

import javax.security.sasl.SaslException;

public class Main {

    public static void main(String[] args) throws SAXException {
//        new DomTester("E:\\NEW\\Java\\Дататех\\LABs\\Lab6\\__FILES_FOR_LABS\\clouds.svg").process();


        //new StaxDemo().readStaxEvent("test.xml");
        new StaxDemo().schemaCheckerTest();
        new StaxDemo().readStaxStream("E:\\NEW\\Java\\Дататех\\Lecture\\Day12\\SaxSample\\UfaCenterSmall.xml");
        // new StaxDemo().writeStaxExample();
    }
}
