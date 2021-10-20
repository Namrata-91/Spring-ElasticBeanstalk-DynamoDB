package com.aws.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.aws.entity.Product;

@Repository
public class ProductRepository {

	@Autowired
	private DynamoDBMapper dbMapper;

	public Product addProduct(Product product) {
		dbMapper.save(product);
		return product;
	}

	public Product findByID(String productId) {
		return dbMapper.load(Product.class, productId);
	}

	public String deleteProduct(Product product) {
		dbMapper.delete(product);
		return "Product remove";
	}

	public String EditProduct(Product product) {
		dbMapper.save(product, buildExpression(product));
		return "Product data updated ";
	}

	private DynamoDBSaveExpression buildExpression(Product product) {
		DynamoDBSaveExpression dynamoDBSaveExpression = new DynamoDBSaveExpression();
		Map<String, ExpectedAttributeValue> expectedMap = new HashMap<>();
		expectedMap.put("productId", new ExpectedAttributeValue(new AttributeValue().withS(product.getProductId())));
		dynamoDBSaveExpression.setExpected(expectedMap);
		return dynamoDBSaveExpression;
	}
}
