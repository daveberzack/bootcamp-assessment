package com.daveberzack.bootcamp.assessment.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class AdderResponse implements Serializable {

    @JsonProperty("successCode")
    private int successCode;

    @JsonProperty("errorMessage")
    private String errorMessage;

    @JsonProperty("sum")
    private int sum;

}