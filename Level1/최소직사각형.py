def solution(sizes):
    answer = 0
    
    big = []
    small = []
    for value in sizes:
        if value[0] > value[1]:
            big.append(value[0])
            small.append(value[1])
        else:
            big.append(value[1])
            small.append(value[0])
        
    answer = max(big) * max(small)
    
    return answer