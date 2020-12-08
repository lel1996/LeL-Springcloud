package com.lierlin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)//Á´Ê½±ä³É
public class User implements Serializable {
    private int id;
    private String name;
    private String passwd;

}
