class dummyjsonComments_Docs{

    Get_all_comments(method,baseurl,endpoints){
        cy.request({
            method: method,
            url:baseurl + endpoints,
            headers:{
                "Content-Type":"application/json"}  
        }).then((Response)=>{
            expect(Response.status).to.eq(200);
            const res = JSON.stringify(Response.body)
            cy.log(res)
        })

    }
    Get_a_single_comment(method,baseurl,endpoints){
        cy.request({
            method: method,
            url:baseurl + endpoints,
            headers:{
                "Content-Type":"application/json"}  
        }).then((Response)=>{
            expect(Response.status).to.eq(200);
            const res = JSON.stringify(Response.body)
            cy.log(res)
        })

    }
    Limit_and_skip_comments(method,baseurl,endpoints){
        cy.request({
            method: method,
            url:baseurl + endpoints,
            headers:{
                "Content-Type":"application/json"}  
        }).then((Response)=>{
            expect(Response.status).to.eq(200);
            const res = JSON.stringify(Response.body)
            cy.log(res)
        })

    }
    Get_all_comments_by_post_id(method,baseurl,endpoints){
        cy.request({
            method: method,
            url:baseurl + endpoints,
            headers:{
                "Content-Type":"application/json"}  
        }).then((Response)=>{
            expect(Response.status).to.eq(200);
            const res = JSON.stringify(Response.body)
            cy.log(res)
        })

    }
    Add_anew_comment(method,baseurl,endpoints,data){
        cy.request({
            method:method,
            url:baseurl + endpoints,
            body:data,
            headers:{
               "Content-Type": "application/json"
            }

        })
        .then((Response)=>{
            expect(Response.status).to.eq(201);
            const res = JSON.stringify(Response.body)
            cy.log(res)
        })
    }

    Update_a_comment(method,baseurl,endpoints,data){
        cy.request({
            method:method,
            url:baseurl + endpoints,
            body:data,
            headers:{
               "Content-Type": "application/json"
            }

        })
        .then((Response)=>{
            expect(Response.status).to.eq(200);
            const res = JSON.stringify(Response.body)
            cy.log(res)
        })
    }

    Delete_a_comment(method,baseurl,endpoints){
        cy.request({
            method: method,
            url:baseurl + endpoints,
            headers:{
                "Content-Type":"application/json"}  
        }).then((Response)=>{
            expect(Response.status).to.eq(200);
            const res = JSON.stringify(Response.body)
            cy.log(res)
        })

    }




















}
export default dummyjsonComments_Docs;