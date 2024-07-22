
# DummyJSON

DummyJSON can be used with any type of front end project that needs products, carts, users, todos or any dummy data in JSON format.

## Architecture
The two-tier is based on Client Server architecture. The two-tier architecture is like client server application. The direct communication takes place between client and server. There is no intermediate between client and server. Because of tight coupling a 2 tiered application will run faster.

![image](https://github.com/user-attachments/assets/f95a9ca8-889b-4e8e-92cd-914cb3d20a1c)



 ## 🛠 TOOL Use for This page object module 

![image](https://github.com/user-attachments/assets/cb7bf5d6-a563-46e7-8df8-aa8a18fce946)  ![image](https://github.com/user-attachments/assets/62f8f916-956a-4039-8c60-393a4bdb7f92) ![image](https://github.com/user-attachments/assets/7a29003e-80df-4cb9-836a-594e4d0834ba)

# Automate the below task using Cypress API Testing
Validate all the COMMENTS AND RECIPES requests present inside this link   

https://dummyjson.com/docs/recipes

https://dummyjson.com/docs/comments

# Recipes - Docs
   Requests to be validated in RECIPES using cypressAPI
   
      Get all recipes
      
      Get a single recipes
      
      Search recipes
      
      Limit & Skip recipes
      
      Sort Recipes
      
      Get all recipes by tag
      
      Get recipes by tag
      
      Get all recipes by meal

# Comments - Docs
   Request to be validated in COMMENTS using  cypressAPI
   
        Get all Comments
        
        Get a Single Comment
        
        Limit and Skip Comments
        
        Get Comment by post id
        
        Add a comment
        
        Update a comment
        
        Delete a comment

# Steps To Install Cypress: 
```http
npx -i init
npm install cypress --save-dev
npx cypress open
```
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
#  Cypress Project structure:
![image](https://github.com/user-attachments/assets/4dbc8d1e-5328-42ee-8ef8-ea0a3b96d38d)

#  CypressAPi Testoutput results
![image](https://github.com/user-attachments/assets/91c215e5-06c7-4ca6-a128-9a91c3345a55)

![image](https://github.com/user-attachments/assets/baaaa699-a421-4f46-9b79-003fac923f48)




## Feedback

If you have any feedback, please reach out to us at santoshkumbar081@gmail.com






