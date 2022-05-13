package net.serenitybdd.tuts.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.tuts.model.Category;
import org.openqa.selenium.By;

public class CategoryNavigationBar extends PageObject {
    public void selectCategory(Category category){
        find(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/div[1]/div/div[1]/h1/span/a")).click();
    }

}
