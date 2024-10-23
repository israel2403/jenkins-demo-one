package com.huerta.jenkins_demo_one.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class GreetingDTO {
    private String message;
}
