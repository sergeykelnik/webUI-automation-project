package com.demoqa.pages.interactions;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DroppablePage extends Methods {

    By menuItems = By.xpath("//*[contains(@href,\"#\")]");
    By dragMe = By.id("draggable");
    By dropHere = By.xpath("//*[@class=\"simple-drop-container\"]/*[contains(@id,\"droppable\")]");
    By acceptDrop=By.xpath("//*[@class=\"accept-drop-container\"]/*[contains(@id,\"droppable\")]");
    By revertDrop=By.xpath("//*[@class=\"revertable-drop-container\"]/*[contains(@id,\"droppable\")]");
    By acceptable = By.id("acceptable");
    By notAcceptable = By.id("notAcceptable");
    By dragBox = By.id("dragBox");
    By chooseOuterDroppable = By.xpath("//*[text()=\"Outer droppable\"]");
    By chooseInnerDroppable = By.xpath("//*[contains(text(),\"Inner droppable\")]");
    By willRevert = By.id("revertable");
    By notRevert = By.id("notRevertable");
    By text = By.xpath("//*[text()=\"Dropped!\"]");

    public DroppablePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver,wait,actions);
    }

    public void chooseDroppableMenu(String droppableMenuList) {
        int i = arrayListToInt(StaticVariables.DROPPABLE_MENU, droppableMenuList);
        clickWithIndex(menuItems,i);
    }
    public void simple() {
        dragAndDropElement(dragMe,dropHere);
    }
    public String getText(){
        return getText(text);
    }
    public void acceptableDragAndDrop(){
        dragAndDropElement(acceptable,acceptDrop);
    }
    public void notAcceptableDragAndDrop(){
        dragAndDropElement(notAcceptable,acceptDrop);
    }
    public void outerDroppable(int i){
        dragAndDropWebElements(dragBox,chooseOuterDroppable,0,i);
    }
    public void innerDroppable(int i){
         dragAndDropWebElements(chooseInnerDroppable,dragBox,i,0);
    }
    public void willRevertDraggable(){
        dragAndDropElement(willRevert,revertDrop);
    }
    public void notRevertDraggable(){
        dragAndDropElement(notRevert,revertDrop);
    }
}
