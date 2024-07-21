package dummyjson_rest_assured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class recipes {

	
	@Test
	public void Get_all_recipes() {
		//given the bulid the 
		given().get("https://dummyjson.com/recipes").then().statusCode(200).log().all();
		
	}
	@Test
	public void Get_a_single_recipe() {
		//given the bulid the 
		given().get("https://dummyjson.com/recipes/1").then().statusCode(200).log().all();
		
	}
	@Test
	public void Search_recipes() {
		//given the bulid the 
		given().get("https://dummyjson.com/recipes/search?q=Margherita").then().statusCode(200).log().all();
		
	}
	@Test
	public void Limit_and_skip_recipes() {
		//given the bulid the 
		given().get("https://dummyjson.com/recipes?limit=10&skip=10&select=name,image").then().statusCode(200).log().all();
		
	}
	@Test
	public void Sort_recipes() {
		//given the bulid the 
		given().get("https://dummyjson.com/recipes?sortBy=name&order=asc").then().statusCode(200).log().all();
		
	}
	@Test
	public void Get_all_recipes_tags() {
		//given the bulid the 
		given().get("https://dummyjson.com/recipes/tags").then().statusCode(200).log().all();
		
	}
	@Test
	public void Get_recipes_bya_tag() {
		//given the bulid the 
		given().get("https://dummyjson.com/recipes/tag/Indian").then().statusCode(200).log().all();
		
	}
	@Test
	public void Get_recipes_byameal() {
		//given the bulid the 
		given().get("https://dummyjson.com/recipes/meal-type/snack").then().statusCode(200).log().all();
		
	}
}
