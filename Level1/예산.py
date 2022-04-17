def solution(d, budget):
    answer = 0
    
    d.sort()
    sum_money = 0
    for value in d :
        tmp = sum_money + value
        if(tmp <= budget) :
            sum_money = tmp
            answer += 1
            
    return answer