from itertools import combinations

def solution(nums):
    answer = 0
    
    for value in combinations(nums, 3) :
        sum_combination = sum(value)
        
        count_isPrimeNumber = 0
        for i in range(1, sum_combination+1) :
            if(sum_combination % i == 0) :
                count_isPrimeNumber += 1
                
        if(count_isPrimeNumber == 2) :
            answer += 1
            
    return answer