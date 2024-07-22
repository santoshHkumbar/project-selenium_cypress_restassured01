
# DummyJSON Useing Spring Tool Suite (REST ASSURED) 

DummyJSON can be used with any type of front end project that needs products, carts, users, todos or any dummy data in JSON format.

 ## 🛠 TOOL Use for This page object module 

![image](https://github.com/user-attachments/assets/d8922884-506b-47ae-8d81-f974c7fb329f)
  ![image](https://github.com/user-attachments/assets/62f8f916-956a-4039-8c60-393a4bdb7f92) ![image](https://github.com/user-attachments/assets/a592d340-022a-4bba-9fc5-e42504d8c62c)


# Automate the below task using Spring Tool Suite (REST ASSURED) 
Validate all the COMMENTS AND RECIPES requests present inside this link   

https://dummyjson.com/docs/recipes

https://dummyjson.com/docs/comments

# Recipes - Docs
   Requests to be validated in RECIPES using Spring Tool Suite (REST ASSURED) 
   
      Get all recipes
      
      Get a single recipes
      
      Search recipes
      
      Limit & Skip recipes
      
      Sort Recipes
      
      Get all recipes by tag
      
      Get recipes by tag
      
      Get all recipes by meal

# Comments - Docs
   Request to be validated in COMMENTS using  Spring Tool Suite (REST ASSURED) 
   
        Get all Comments
        
        Get a Single Comment
        
        Limit and Skip Comments
        
        Get Comment by post id
        
        Add a comment
        
        Update a comment
        
        Delete a comment

# dependencies list : 
```http
  <dependencies>
<!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>4.5.1</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.7.1</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
<dependency>
    <groupId>com.googlecode.json-simple</groupId>
    <artifactId>json-simple</artifactId>
    <version>1.1.1</version>
</dependency>
<dependency>
    <groupId>org.jsoup</groupId>
    <artifactId>jsoup</artifactId>
    <version>1.14.3</version>
</dependency>
<dependency>
   <groupId>io.rest-assured</groupId>
   <artifactId>json-path</artifactId>
   <version>4.5.1</version>
   </dependency>
<dependency>
   <groupId>io.rest-assured</groupId>
   <artifactId>xml-path</artifactId>
   <version>4.5.1</version>
   </dependency>
<dependency>
   <groupId>io.rest-assured</groupId>
   <artifactId>json-schema-validator</artifactId>
   <version>4.5.1</version>
   </dependency>
  </dependencies>
```

# Spring Tool Suite (REST ASSURED)  Project structure:
![image](https://github.com/user-attachments/assets/8d8ebcb2-7247-4d40-bbb4-e4b418b0b242)


#  Spring Tool Suite (REST ASSURED) Testoutput results
![image](https://github.com/user-attachments/assets/f73ca825-ec28-493b-a0de-3a138b840444)


![image](https://github.com/user-attachments/assets/73e9868d-20fe-4c8b-8e3b-13b4f1bc8bac)

# API end Pointes Recipes - Docs
```http
        Get all recipes :'https://dummyjson.com/recipes'
 
       Get a single recipes:'https://dummyjson.com/recipes/1'
       
       Search recipes:'https://dummyjson.com/recipes/search?q=Margherita'
       
       Limit & Skip recipes:'https://dummyjson.com/recipes?limit=10&skip=10&select=name,image'
       
       Sort Recipes:'https://dummyjson.com/recipes?sortBy=name&order=asc'
       
       Get all recipes by tag:'https://dummyjson.com/recipes/tags'
       
       Get recipes by tag:'https://dummyjson.com/recipes/tag/Pakistani'
       
       Get all recipes by meal:'https://dummyjson.com/recipes/meal-type/snack'

```
# API end Pointes Comments - Docs
```http
  
        Get all Comments:'https://dummyjson.com/comments'
        
        Get a Single Comment:'https://dummyjson.com/comments/1'
        
        Limit and Skip Comments:'https://dummyjson.com/comments?limit=10&skip=10&select=body,postId'
        
        Get Comment by post id:'https://dummyjson.com/comments/post/6'
        
        Add a comment:'https://dummyjson.com/comments/add'
        
        Update a comment:'https://dummyjson.com/comments/1'
        
        Delete a comment:'https://dummyjson.com/comments/1'
```



## Feedback

If you have any feedback, please reach out to us at santoshkumbar081@gmail.com






