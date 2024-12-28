package com.bilal.workspace;

import com.bilal.workspace.model.Cat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SpringBootApplication
public class SpringBootCustomAnnotationApplication {

	public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
		SpringApplication.run(SpringBootCustomAnnotationApplication.class, args);

		Cat cat = new Cat(1, "Luna");

		boolean isImportant = cat.getClass().isAnnotationPresent(VeryImportant.class);
		if (isImportant) {
			Method[] methods = cat.getClass().getDeclaredMethods();
			for (Method method : methods) {
				boolean isRunImmediate = method.isAnnotationPresent(RunImmediately.class);
				if (isRunImmediate) {
					RunImmediately runImmediately = method.getAnnotation(RunImmediately.class);
					for (int i = 0; i < runImmediately.times(); i++) {
						method.invoke(cat);
					}
				}
			}
		}

		Field[] fields = cat.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(ImportantString.class)) {
				Object objectValue = field.get(cat);
				String fieldName = field.getName();
				if (objectValue instanceof String stringValue) {
//					field.set(fieldName, "Bilal's Luna");
					System.out.println(fieldName +" ------> "+stringValue);
				}
			}
		}


	}

}
