package com.finalproject.automated.refactoring.tool.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@ToString
@EqualsAndHashCode
public class ClassModel {

    private String packageName;

    @Builder.Default
    private List<String> imports;

    @Builder.Default
    private List<String> keywords = new ArrayList<>();

    private String name;

    private String extend;

    private String implement;

    @Builder.Default
    private List<String> attributes;

    @Builder.Default
    private List<MethodModel> methodModels;

    private String fullContent;

    private Long loc;

    private Long nom;

    private Long nof;
}
