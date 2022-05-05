def solution(lottos, win_nums):
    answer = []
    zero_count=0
    count=0
    
    for ele in lottos:
        if ele==0:
            zero_count += 1
            continue
            
        if ele in win_nums:
            count += 1
            
    if zero_count == 6:
        answer = [1,6]
    elif count == 6:
        answer = [1,1]
    elif count == 0 and zero_count == 0 :
        answer = [6,6] 
    else : 
        answer = [7-(zero_count+count), 7-count]
    
    return answer