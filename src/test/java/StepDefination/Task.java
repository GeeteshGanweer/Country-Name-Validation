package StepDefination;

import org.testng.Assert;

import com.BaseLayer.BaseClass;
import com.PageLayer.GooglePage;
import com.PageLayer.GoogleSearchPage;
import com.PageLayer.ImdbPage;
import com.PageLayer.WikipediaPage;
import com.UtilsLayer.UtilsClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Task extends BaseClass {

	static GooglePage google;
	static GoogleSearchPage search;
	static WikipediaPage wikipediapage;
	static String countrywiki;
	static ImdbPage imdbpage;
	static String countryibmdb;

	@Given("open the browser And search the movie name on Google")
	public void open_the_browser_and_search_the_movie_name_on_google() {

		BaseClass.initialization();
		google = new GooglePage();
		google.enter_search("pushpa the rise");
		google.clickOnsearch();

	}

	@When("user is on desired movie page And click on wikipedia movie page")
	public void user_is_on_desired_movie_page_and_click_on_wikipedia_movie_page() {

		search = new GoogleSearchPage();
		Assert.assertEquals(true, search.captureGoogleTitle().contains("ushpa"));
		search.clickOnwiki();

	}

	@Then("capture the release country")
	public void capture_the_release_date() {

		wikipediapage = new WikipediaPage();

		countrywiki = wikipediapage.capture_wiki_country();
	}

	@Given("move to IMDB page")
	public void move_to_imdb_page() {

		driver.navigate().back();
		search = new GoogleSearchPage();
		search.clickOnimdb();
	}

	@When("user is on page now capture the release country")
	public void user_is_on_page_now_capture_the_release_date() {

		imdbpage = new ImdbPage();

		countryibmdb = imdbpage.capture_imdb_country();

	}

	@Then("validate both release country")
	public void validate_both_release_date() throws Exception {

		Assert.assertEquals(countrywiki, countryibmdb);

	}
}