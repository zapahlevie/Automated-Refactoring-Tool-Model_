package com.finalproject.automated.refactoring.tool.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 1 October 2018
 */

@Data
@Builder
@ToString(exclude = {"body"})
@EqualsAndHashCode(exclude = {"body"})
public class MethodModel {

    @Builder.Default
    private List<String> keywords = new ArrayList<>();

    private String returnType;

    private String name;

    @Builder.Default
    private List<PropertyModel> parameters = new ArrayList<>();

    @Builder.Default
    private List<String> exceptions = new ArrayList<>();

    private String body;

    private Long loc;
}
