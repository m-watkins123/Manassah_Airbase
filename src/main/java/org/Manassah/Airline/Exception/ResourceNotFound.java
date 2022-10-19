package org.Manassah.Airline.Exception;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;
/**
* Returns a value when HTTPStatus is not found also extends the import method exception and intatlizes it as a final 
* 
* @ResponseStatus marks a method or exception class with the status code and reason message that should be returned. T
*/
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends Exception{
		    private static final long serialVersionUID = 1L;

		    public  ResourceNotFound(String message){
		        super(message);
		    }
}
