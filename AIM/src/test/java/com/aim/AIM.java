package com.aim;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebElement;

public class AIM extends BaseClasse {
	
	public static void main(String[] args) throws Exception {
		
		//File Upload without sendkeys
		
		getDriver(); getUrl("https://www.zamzar.com/convert/pdf-to-csv/"); implicitywaits(3);
		click(elementByXpath("//button[@class='btn btn-lg btn-block px-2']"));
		
		Robot robot = new Robot();
		
		robot.delay(3000);
		
		Transferable transferable = new StringSelection("D:\\Lakshmanan\\Tirupathi Ticket.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(transferable, null);
		
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	     
	     
	     
	     
	}

}
