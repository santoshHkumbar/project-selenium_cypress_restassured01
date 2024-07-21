package dummyjson_rest_assured;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Comments {
	@Test
	public void Get_all_comments() {
		
		given().get("https://dummyjson.com/comments").then().statusCode(200).log().all();
		
	}
	@Test
	public void Geta_single_comment() {
		
		given().get("https://dummyjson.com/comments/1").then().statusCode(200).log().all();
		
	}
	@Test
	public void Limit_and_skipcomments() {
		
		given().get("https://dummyjson.com/comments?limit=10&skip=10&select=body,postId").then().statusCode(200).log().all();
		
	}
	@Test
	public void Get_all_commentsby_postid() {
		
		given().get("https://dummyjson.com/comments/post/6").then().statusCode(200).log().all();
		
	}
	@Test
	public void Add_a_new_comment() {
		JSONObject json = new JSONObject();
		json.put("body","This makes all sense to me!");
		json.put("postId", 3);
		json.put("userId", 5);
		given().contentType(ContentType.JSON).body(json.toJSONString()).when().post("https://dummyjson.com/comments/add").then().statusCode(201).log().all();	
		
		
		
	}
	@Test
	public void Update_a_comment() {
		JSONObject json = new JSONObject();
		json.put("body","I think I should shift to the moon");
		given().contentType(ContentType.JSON).body(json.toJSONString()).when().patch("https://dummyjson.com/comments/1").then().statusCode(200).log().all();	
		
	}
	
	@Test
	public void Delete_a_comment() {
		given().contentType(ContentType.JSON).delete("https://dummyjson.com/comments/1").then().statusCode(200).log().all();
		
	}
	
}
