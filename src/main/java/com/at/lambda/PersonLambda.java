package com.at.lambda;

import com.at.lambda.model.Person;
import com.at.lambda.response.PersonResponse;
import com.at.lambda.service.PersonService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/v1")
public class PersonLambda {
    @Inject
    PersonService personService;

    @ConfigProperty(name = "greeting.prefix")
    String prefixGreeting;

    @POST
    @Path("/serverless")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public PersonResponse handleRequest(Person input) {
        return new PersonResponse(prefixGreeting + " " +  personService.getName(input));
    }
}
