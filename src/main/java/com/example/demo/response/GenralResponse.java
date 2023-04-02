package com.example.demo.response;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class GenralResponse {

	private HttpStatus status;
	private String error;
	private String message;
	private LocalDateTime timestamp = LocalDateTime.now();
	private Object object;

}

