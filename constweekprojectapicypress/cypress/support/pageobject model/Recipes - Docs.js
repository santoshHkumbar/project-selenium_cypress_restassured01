class DummyJSON{

    Get_all_recipes(method,baseurl,endpoints){
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

    Get_a_single_recipe(method,baseurl,endpoints){
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

    Search_recipes(method,baseurl,endpoints){
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
    Limit_and_skip_recipes(method,baseurl,endpoints){
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

    Sort_recipes(method,baseurl,endpoints){
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
    Get_all_recipes_tags(method,baseurl,endpoints){
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
    Get_recipes_by_a_tag(method,baseurl,endpoints){
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
    Get_recipes_by_a_meal(method,baseurl,endpoints){
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
export default DummyJSON;