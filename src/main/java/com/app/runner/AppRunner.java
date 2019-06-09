package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

public void run(ApplicationArguments args) throws Exception {
		
		// 1. Read all Keys
		
		Set<String> allkeys=args.getOptionNames();
		System.out.println(allkeys);

		
		// 2. One Key related values
		
		List<String> values=args.getOptionValues("this");
		System.out.println(values);
		
		// 3. Check for key Exist
		
		System.out.println(args.containsOption("one"));
		System.out.println(args.containsOption("justcheck"));
		
		// 4. Non Option Arguments
		
		List<String> nonvalue=args.getNonOptionArgs();
		System.out.println(nonvalue);
		
		//5. All args
		
		String[] arr=args.getSourceArgs();
		System.out.println(arr);
		System.out.println(Arrays.asList(arr));
	}

}
