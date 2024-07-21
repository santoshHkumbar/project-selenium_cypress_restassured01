///<reference types="cypress"/>
import DummyJSON from "../../support/pageobject model/Recipes - Docs";
describe('DummyJSON recipes api testing', () => {
    let cw=new DummyJSON();
    let baseurl="https://dummyjson.com";

    it('Get all ecipes', () => {
        cw.Get_all_recipes('GET', baseurl, '/recipes') 
    });
    it('Get a single recipe', () => {
        cw.Get_a_single_recipe('GET',baseurl,'/recipes/1')
    });
    it('Search recipes', () => {
        cw.Search_recipes('GET',baseurl,'/recipes/search?q=Margherita')
    });
    it('Limit and skip recipes', () => {
        cw.Limit_and_skip_recipes('GET',baseurl,'/recipes?limit=10&skip=10&select=name,image')
    });
    it('Sort recipes', () => {
        cw.Sort_recipes('GET',baseurl,'/recipes?sortBy=name&order=asc')
    });
    it('Get all recipes tags', () => {
        cw.Get_all_recipes_tags('GET',baseurl,'/recipes/tags')
    });
    
    it('Get recipes by a tag', () => {
        cw.Get_recipes_by_a_tag('GET',baseurl,'/recipes/tag/Pakistani')
    });
    
    it('Get recipes by a meal', () => {
        cw.Get_recipes_by_a_meal('GET',baseurl,'/recipes/meal-type/snack')
    });
    
    
    
    
    

});
