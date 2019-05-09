package com.test;

public class SampleBean implements SampleBeanInterface {
	private String message;
	

    public SampleBean() {
        message = "(no message)";
    }
     
    public SampleBean(String message) {
        this.message = message;
    }
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
 
    @Override
    public String toString() {
        return "SampleBean [message=" + message + "]";
    }

}
