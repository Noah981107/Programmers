def solution(n):
    answer = ''
    
    count = 1
    while(count <= n):
        if count % 2 == 0:
            answer += '박'
        else:
            answer += '수'
        count += 1
    return answer