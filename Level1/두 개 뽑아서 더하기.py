from itertools import combinations

def solution(numbers):
    answer = []
    
    for value in combinations(numbers, 2):
        tmp = sum(value)
        if tmp not in answer:
            answer.append(sum(value))
    
    answer.sort()
    
    return answer