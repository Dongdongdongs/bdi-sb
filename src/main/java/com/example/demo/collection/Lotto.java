package com.example.demo.collection;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("Lotto")
@Data
public class Lotto {
	private String winDate;
	private ObjectId _id;
	private Integer rotation;
	private List<String> lottoNums;
}
