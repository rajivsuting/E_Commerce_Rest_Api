package com.masai.ecom.exception;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ErrorDetails {
	
	
    private LocalDateTime timeStamp;
    private String message;
    private String description;
    public ErrorDetails(){
        this.timeStamp = LocalDateTime.now();
        
    }

    public ErrorDetails( String message , String description ){
        this();
        this.message = message;
        this.description = description;
    }

}
