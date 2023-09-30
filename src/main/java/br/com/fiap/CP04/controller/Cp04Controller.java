package br.com.fiap.CP04.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cp04Controller {
	
	@PostMapping("/single-number")
	public int findSingleNumber(@RequestBody int[]nums) {
		Set<Integer> set = new HashSet<>();
		List<Integer> numerosRepetidos = new ArrayList<>();
		
        for (int num : nums) {
            if (set.contains(num)) {
            	numerosRepetidos.add(num);
            } else {
                set.add(num);
            }
        }
        for (int numero : numerosRepetidos) {
        	set.remove(numero);
        }
        
        return set.iterator().next();
	}
	
	@PostMapping("/max-consecutive-ones")
	public int findMaxConsecutiveOnes(@RequestBody int[] nums) {
	    int maxCount = 0;
	    int currentCount = 0;	    
	    for (int num : nums) {
	        currentCount = (num == 1) ? currentCount + 1 : 0;
	        maxCount = Math.max(maxCount, currentCount);
	    }	   
	    return maxCount;
	}	
}