package com.iwanttofaang.parkinglot;

public class EntityIdGenerator {
	
	private static EntityIdGenerator idGenerator;
	private long nextId;
	
	private EntityIdGenerator() {
		nextId = 1;
	}
	
	public static long getNextId() {
		if(idGenerator == null) {
			idGenerator = new EntityIdGenerator();
			return idGenerator.nextId;
		} else {
			return ++idGenerator.nextId;
		}
		
	}
}