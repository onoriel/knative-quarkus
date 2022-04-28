package com.at.lambda.response;


public class PersonResponse {

    private String greetings;

    public String getGreetings() {
        return greetings;
    }

    public PersonResponse() {
    }

    public PersonResponse(String greetings) {
        this.greetings = greetings;
    }

    public PersonResponse setName(String greetings) {
        this.greetings = greetings;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PersonResponse{");
        sb.append("greetings='").append(greetings).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
