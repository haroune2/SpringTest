package com.example.demo.Exeption;

import org.springframework.http.HttpStatus;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data @AllArgsConstructor@NoArgsConstructor @Getter @Setter

public class EtudiantExeption  extends RuntimeException{
   private HttpStatus  httpStatus;

public EtudiantExeption(HttpStatus httpStatus,String message) {
    super(message); 
    this.httpStatus = httpStatus;
} 


}
