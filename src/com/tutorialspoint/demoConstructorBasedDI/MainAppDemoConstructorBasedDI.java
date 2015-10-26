package com.tutorialspoint.demoConstructorBasedDI;

/**This one is also working fine. 
 * But in order to make this one work, I'll have to enable
 * constructor-based DI in beans.xml and comment out other two DI methods in the TextEditor
 * and SpellChecker beans.*/
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.demoCommon.TextEditor;

public class MainAppDemoConstructorBasedDI {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/tutorialspoint/demoConstructorBasedDI/beansForDemoConstructorBasedDI.xml");

        TextEditor te = (TextEditor) context.getBean("textEditor");

        te.spellCheck();
        context.registerShutdownHook();

        System.out.println("Program ends.");
    }
}