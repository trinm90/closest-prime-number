package com.naivecat.closestprimenumber.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/patterncheck")
public class PatternCheckController {
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Boolean> findClosestPrimeNumber() {
        Boolean result = true;

        String parting = "abccab";

        String input = "hello hello world world hello friend";

        char[] partingChars = parting.toCharArray();

        String[] subInput = input.split(" ");

        int partingIndexes = partingChars.length;

        int inputIndexes = subInput.length;

        if(partingIndexes == inputIndexes) {
            for(int index = 0 ; index < partingIndexes - 1; index++) {
                for(int nextIndex = index + 1 ; nextIndex < partingIndexes ; nextIndex++) {
                    if(partingChars[index] == partingChars[nextIndex]) {
                        if(!subInput[index].equals(subInput[nextIndex])) {
                            return ResponseEntity.ok(false);
                        }
                    }
                }
            }
        } else {
            return ResponseEntity.ok(false);
        }

        return ResponseEntity.ok(result);
    }
}
