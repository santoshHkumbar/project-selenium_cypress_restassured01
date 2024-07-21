///<reference types="cypress"/>
import dummyjsonComments_Docs from "../../support/pageobject model/Comments - Docs";
describe('DummyJSON Comments_Docs api testing', () => {
    let ca =new dummyjsonComments_Docs;
    let baseurl="https://dummyjson.com";
    it('Get all comments', () => {
        ca.Get_all_comments('GET',baseurl,'/comments')
    });
    it(' Get asingle comment', () => {
        ca.Get_a_single_comment('GET',baseurl,'/comments/1')
    });
    it('Limit and skip comments', () => {
        ca.Limit_and_skip_comments('GET',baseurl,'/comments?limit=10&skip=10&select=body,postId')
    });
    it('Get all comments by post id', () => {
        ca.Get_all_comments_by_post_id('GET',baseurl,'/comments/post/6')
    });
    it('Add a new comment', () => {
        ca.Add_anew_comment('POST', baseurl, '/comments/add',{
            body: 'This makes all sense to me!',
          postId: 3,
          userId: 5,
        })
    });
    it('Update a comment', () => {
        ca.Update_a_comment('PUT',baseurl,'/comments/1',{
            body: 'I think I should shift to the moon',
        })
    });
    it('Delete a comment', () => {
        ca.Delete_a_comment('DELETE',baseurl,'/comments/1')
    });
    

    





    
});
