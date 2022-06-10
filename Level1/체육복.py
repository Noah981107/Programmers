def solution(n, lost, reserve):
    answer = 0
    
    set_reserve = set(reserve)
    set_lost = set(lost)
    
    real_reserve = set_reserve - set_lost
    real_lost = set_lost - set_reserve
    
    for value in real_reserve:
        if value-1 in real_lost:
            real_lost.remove(value-1)
        elif value+1 in real_lost:
            real_lost.remove(value+1)

    answer = n - len(real_lost)
    return answer