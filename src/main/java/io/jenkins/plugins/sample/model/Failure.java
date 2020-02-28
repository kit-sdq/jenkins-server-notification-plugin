package io.jenkins.plugins.sample.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "failure")
public class Failure {
    private String message;
    private String type;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
