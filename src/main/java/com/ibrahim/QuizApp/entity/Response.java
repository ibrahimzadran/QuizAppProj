package com.ibrahim.QuizApp.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Response {
    private Long id;
    private String response;
}
