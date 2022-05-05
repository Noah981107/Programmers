def solution(left, right):
    answer = 0
    
    for number in range(left, right+1):
        count=0
        for ele in range(1,number+1):
            if number%ele==0:
                count+=1
                
        if count%2==0:
            answer+=number
        else:
            answer-=number
            
    return answer