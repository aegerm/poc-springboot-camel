package com.aegerm.poccamel.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Device implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String osName;
    private int numberProcessors;
}