package com.tutorial.bridge;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class BridgeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(new GreenCircle());
        circle.draw();

        circle = new Circle(new RedCircle());
        circle.draw();
    }


}
