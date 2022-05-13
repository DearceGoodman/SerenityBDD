package net.serenitybdd.tuts.features.navigation;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.tuts.model.Category;
import net.serenitybdd.tuts.ui.EbayHomePage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import net.serenitybdd.tuts.steps.NavigatingUser;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {


    @Steps
    NavigatingUser mark;

    @Managed
    WebDriver browser;

    @Test
    public void shouldBeAbleToNavigateToTheMotorCategory(){
        //Given
        mark.isOnTheHomePage();


        //When
        mark.navigatesToCategory(Category.Motors);

        //Then
        mark.shouldSeePageTitleContaining("Wikipedia - Wikipedia");
    }
}
